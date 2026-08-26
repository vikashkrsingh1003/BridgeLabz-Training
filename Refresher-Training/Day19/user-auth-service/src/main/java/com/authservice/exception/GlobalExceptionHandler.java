package com.authservice.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	// Validation errors from DTO
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException ex) {

		Map<String, String> errors = new HashMap<>();

		ex.getBindingResult().getFieldErrors()
				.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
	}

	// User not found
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleUserNotFound(UserNotFoundException ex) {

		Map<String, String> response = new HashMap<>();

		response.put("error", ex.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	// Illegal arguments
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Map<String, String>> handleIllegalArgument(IllegalArgumentException ex) {

		Map<String, String> response = new HashMap<>();

		response.put("error", ex.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

	
}