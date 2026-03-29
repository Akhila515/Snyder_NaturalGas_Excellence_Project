package com.example.demo.exception;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private final MessageSource messageSource;

	public GlobalExceptionHandler(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleDataNotFound(DataNotFoundException ex, Locale locale) {

		 String message = messageSource.getMessage(
	                ex.getMessageKey(),
	                ex.getArgs(),
	                ex.getMessageKey(), // fallback
	                locale
	        );
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(message));
	}
}
