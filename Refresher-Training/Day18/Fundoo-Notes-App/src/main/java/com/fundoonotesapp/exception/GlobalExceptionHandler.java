package com.fundoonotesapp.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fundoonotesapp.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {


	@ExceptionHandler(NoteNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleNoteNotFound(NoteNotFoundException exception) {

		ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND.value(),
				LocalDateTime.now());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}



	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException exception) {

		ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND.value(),
				LocalDateTime.now());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}



	@ExceptionHandler(InvalidNoteStateException.class)
	public ResponseEntity<ErrorResponse> handleInvalidNoteState(InvalidNoteStateException exception) {

		ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), HttpStatus.BAD_REQUEST.value(),
				LocalDateTime.now());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}



	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception exception) {

		ErrorResponse errorResponse = new ErrorResponse("An unexpected error occurred",
				HttpStatus.INTERNAL_SERVER_ERROR.value(), LocalDateTime.now());

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}
}