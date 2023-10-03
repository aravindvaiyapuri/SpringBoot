package com.example.StudentDetailss;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class MyGobalException {

	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object> handlePrice(AgeNotFoundException p) {
		return new ResponseEntity<Object>("please enter valid age",HttpStatus.BAD_REQUEST);
	}	
	
}
