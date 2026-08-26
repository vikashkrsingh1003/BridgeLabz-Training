package com.authservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authservice.entity.PasswordResetToken;

public interface PasswordResetTokenRepository
        extends JpaRepository<PasswordResetToken, Integer> {

    Optional<PasswordResetToken> findByToken(String token);
}