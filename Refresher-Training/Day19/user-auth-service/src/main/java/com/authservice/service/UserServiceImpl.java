package com.authservice.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.authservice.dto.ForgotPasswordRequest;
import com.authservice.dto.LoginRequest;
import com.authservice.dto.RegisterRequest;
import com.authservice.dto.ResetPasswordRequest;
import com.authservice.entity.PasswordResetToken;
import com.authservice.entity.User;
import com.authservice.exception.UserNotFoundException;
import com.authservice.repository.PasswordResetTokenRepository;
import com.authservice.repository.UserRepository;
import com.authservice.security.JwtUtil;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	private final JwtUtil jwtUtil;

	private final PasswordResetTokenRepository passwordResetTokenRepository;

	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil,
			PasswordResetTokenRepository passwordResetTokenRepository) {

		this.userRepository = userRepository;
		this.jwtUtil = jwtUtil;
		this.passwordResetTokenRepository = passwordResetTokenRepository;
	}

	@Override
	public String register(RegisterRequest request) {

		if (userRepository.findByEmail(request.getEmail()).isPresent()) {
			throw new IllegalArgumentException("Email already registered");
		}

		User user = new User();

		user.setEmail(request.getEmail());
		user.setPasswordHash(passwordEncoder.encode(request.getPassword()));
		user.setName(request.getName());

		User savedUser = userRepository.save(user);

		return jwtUtil.generateToken(String.valueOf(savedUser.getUserId()), savedUser.getEmail());
	}

	@Override
	public String login(LoginRequest request) {

		User user = userRepository.findByEmail(request.getEmail())
				.orElseThrow(() -> new UserNotFoundException("Invalid email or password"));

		if (!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {

			throw new IllegalArgumentException("Invalid email or password");
		}

		return jwtUtil.generateToken(String.valueOf(user.getUserId()), user.getEmail());
	}

	@Override
	public String forgotPassword(ForgotPasswordRequest request) {

		User user = userRepository.findByEmail(request.getEmail())
				.orElseThrow(() -> new UserNotFoundException("User not found"));

		String token = UUID.randomUUID().toString();

		PasswordResetToken resetToken = new PasswordResetToken();

		resetToken.setToken(token);
		resetToken.setUser(user);
		resetToken.setExpiryTime(LocalDateTime.now().plusMinutes(15));
		resetToken.setUsed(false);

		passwordResetTokenRepository.save(resetToken);

		/*
		 * Later we will connect the messaging part here. For now, keep the
		 * password-reset business logic separate from the User service.
		 */

		return token;
	}

	@Override
	public void resetPassword(ResetPasswordRequest request) {

		PasswordResetToken resetToken = passwordResetTokenRepository.findByToken(request.getToken())
				.orElseThrow(() -> new IllegalArgumentException("Invalid reset token"));

		if (resetToken.isUsed()) {
			throw new IllegalArgumentException("Reset token has already been used");
		}

		if (resetToken.getExpiryTime().isBefore(LocalDateTime.now())) {

			throw new IllegalArgumentException("Reset token has expired");
		}

		User user = resetToken.getUser();

		user.setPasswordHash(passwordEncoder.encode(request.getNewPassword()));

		userRepository.save(user);

		// Make token single-use
		resetToken.setUsed(true);

		passwordResetTokenRepository.save(resetToken);
	}
}