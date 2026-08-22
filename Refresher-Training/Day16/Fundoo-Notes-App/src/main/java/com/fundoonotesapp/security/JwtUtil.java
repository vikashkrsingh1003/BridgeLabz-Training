package com.fundoonotesapp.security;

import java.time.Duration;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private final RedisTemplate<String, String> redisTemplate;

    public JwtUtil(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    // =========================================================
    // GENERATE TOKEN
    // =========================================================

    public String generateToken(String userId, String email) {

        return Jwts.builder()
                .subject(userId)
                .claim("email", email)
                .issuedAt(new Date())
                .expiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 1000 * 60 * 60))
                .signWith(getSigningKey())
                .compact();
    }

    // =========================================================
    // EXTRACT USER ID
    // =========================================================

    public String extractUserId(String token) {

        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    // =========================================================
    // EXTRACT EMAIL
    // =========================================================

    public String extractEmail(String token) {

        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .get("email", String.class);
    }

    // =========================================================
    // JWT VALIDATION + REDIS CACHE
    // =========================================================

    public boolean isTokenValid(String token) {

        String cacheKey = "jwt:validation:" + token;

        // -----------------------------------------------------
        // 1. Check Redis
        // -----------------------------------------------------

        String cachedResult =
                redisTemplate.opsForValue().get(cacheKey);

        if (cachedResult != null) {

            System.out.println("JWT Cache HIT");

            return Boolean.parseBoolean(cachedResult);
        }

        System.out.println("JWT Cache MISS");

        // -----------------------------------------------------
        // 2. Real JWT validation
        // -----------------------------------------------------

        try {

            var claims =
                    Jwts.parser()
                            .verifyWith(getSigningKey())
                            .build()
                            .parseSignedClaims(token)
                            .getPayload();

            // -------------------------------------------------
            // 3. Calculate remaining JWT lifetime
            // -------------------------------------------------

            long remainingTime =
                    claims.getExpiration().getTime()
                            - System.currentTimeMillis();

            if (remainingTime <= 0) {
                return false;
            }

            // -------------------------------------------------
            // 4. Store validation result in Redis
            // -------------------------------------------------

            redisTemplate.opsForValue().set(
                    cacheKey,
                    "true",
                    Duration.ofMillis(remainingTime));

            System.out.println("JWT validation stored in Redis");

            return true;

        } catch (Exception e) {

            // Invalid token
            return false;
        }
    }
}