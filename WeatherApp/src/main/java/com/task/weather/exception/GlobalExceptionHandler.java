package com.task.weather.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RapidApiDownException.class)
	public ResponseEntity<?> rapidApiDown(RapidApiDownException exceptio) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptio.getMessage());
	}

	@ExceptionHandler(InvalidHeaderException.class)
	public ResponseEntity<?> invalidHeaderException(InvalidHeaderException exceptio) {
		return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(exceptio.getMessage());
	}

}
