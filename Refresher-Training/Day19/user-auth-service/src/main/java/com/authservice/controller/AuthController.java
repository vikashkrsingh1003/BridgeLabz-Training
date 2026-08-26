package com.authservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authservice.dto.AuthResponse;
import com.authservice.dto.ForgotPasswordRequest;
import com.authservice.dto.LoginRequest;
import com.authservice.dto.RegisterRequest;
import com.authservice.dto.ResetPasswordRequest;
import com.authservice.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final UserService userService;

	public AuthController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/register")
	public ResponseEntity<AuthResponse> register(@Valid @RequestBody RegisterRequest request) {

		String token = userService.register(request);

		return ResponseEntity.status(HttpStatus.CREATED).body(new AuthResponse(token));
	}

	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest request) {

		String token = userService.login(request);

		return ResponseEntity.ok(new AuthResponse(token));
	}

	@PostMapping("/forgot-password")
	public ResponseEntity<String> forgotPassword(@Valid @RequestBody ForgotPasswordRequest request) {

		String resetToken = userService.forgotPassword(request);

		return ResponseEntity.ok(resetToken);
	}

	@PostMapping("/reset-password")
	public ResponseEntity<String> resetPassword(@Valid @RequestBody ResetPasswordRequest request) {

		userService.resetPassword(request);

		return ResponseEntity.ok("Password reset successfully");
	}
}