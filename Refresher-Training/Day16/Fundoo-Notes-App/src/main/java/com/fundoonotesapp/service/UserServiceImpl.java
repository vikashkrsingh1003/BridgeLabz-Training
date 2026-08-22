package com.fundoonotesapp.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fundoonotesapp.dto.ForgotPasswordRequest;
import com.fundoonotesapp.dto.LoginRequest;
import com.fundoonotesapp.dto.RegisterRequest;
import com.fundoonotesapp.dto.ReminderMessage;
import com.fundoonotesapp.dto.ResetPasswordRequest;
import com.fundoonotesapp.entity.PasswordResetToken;
import com.fundoonotesapp.entity.User;
import com.fundoonotesapp.messaging.ReminderProducer;
import com.fundoonotesapp.repository.PasswordResetTokenRepository;
import com.fundoonotesapp.repository.UserRepository;
import com.fundoonotesapp.security.JwtUtil;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final JwtUtil jwtUtil;
    
    private final ReminderProducer reminderProducer;

    private final PasswordResetTokenRepository passwordResetTokenRepository;

    private final BCryptPasswordEncoder passwordEncoder =
            new BCryptPasswordEncoder();

    public UserServiceImpl(
            UserRepository userRepository,
            JwtUtil jwtUtil,
            PasswordResetTokenRepository passwordResetTokenRepository,
            ReminderProducer reminderProducer) {

        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordResetTokenRepository = passwordResetTokenRepository;
        this.reminderProducer = reminderProducer;
    }

    @Override
    public String register(RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException(
                    "Email already registered");
        }

        User user = new User();

        user.setEmail(request.getEmail());
        user.setPasswordHash(
                passwordEncoder.encode(request.getPassword()));
        user.setName(request.getName());

        User savedUser = userRepository.save(user);

        return jwtUtil.generateToken(
                String.valueOf(savedUser.getUserId()),
                savedUser.getEmail());
    }

    @Override
    public String login(LoginRequest request) {

        User user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Invalid email or password"));

        if (!passwordEncoder.matches(
                request.getPassword(),
                user.getPasswordHash())) {

            throw new IllegalArgumentException(
                    "Invalid email or password");
        }

        return jwtUtil.generateToken(
                String.valueOf(user.getUserId()),
                user.getEmail());
    }

    @Override
    public String forgotPassword(ForgotPasswordRequest request) {

        User user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new IllegalArgumentException("User not found"));

        String token = UUID.randomUUID().toString();

        PasswordResetToken resetToken = new PasswordResetToken();

        resetToken.setToken(token);
        resetToken.setUser(user);
        resetToken.setExpiryTime(
                LocalDateTime.now().plusMinutes(15));
        resetToken.setUsed(false);

        // Save token in database
        passwordResetTokenRepository.save(resetToken);

        // Create JMS message
        ReminderMessage message = new ReminderMessage();

        message.setEmail(user.getEmail());

        message.setMessage(
                "Your password reset token is: " + token
        );

        // Send message to JMS queue
        reminderProducer.sendReminder(message);

        return token;
    }
    
    @Override
    public void resetPassword(ResetPasswordRequest request) {

        PasswordResetToken resetToken =
                passwordResetTokenRepository
                        .findByToken(request.getToken())
                        .orElseThrow(() ->
                                new IllegalArgumentException(
                                        "Invalid reset token"));

        if (resetToken.isUsed()) {
            throw new IllegalArgumentException(
                    "Reset token has already been used");
        }

        if (resetToken.getExpiryTime()
                .isBefore(LocalDateTime.now())) {

            throw new IllegalArgumentException(
                    "Reset token has expired");
        }

        User user = resetToken.getUser();

        user.setPasswordHash(
                passwordEncoder.encode(
                        request.getNewPassword()));

        userRepository.save(user);

        //make token single use
        resetToken.setUsed(true);

        passwordResetTokenRepository.save(resetToken);
    }
}