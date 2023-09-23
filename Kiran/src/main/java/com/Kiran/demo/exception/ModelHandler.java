package com.Kiran.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ModelHandler {
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleException(Exception exception){
		
		ModelException modelException = new ModelException(exception.getMessage(),exception.getCause(),HttpStatus.NOT_FOUND); 
		return new ResponseEntity<Object>(exception, HttpStatus.NOT_FOUND);
		
	}
}
