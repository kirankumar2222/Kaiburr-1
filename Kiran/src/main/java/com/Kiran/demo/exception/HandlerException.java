package com.Kiran.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerException {
	
	@ExceptionHandler(value= {ModelNotFoundException.class})
	public ResponseEntity<Object> handleModelNotFoundException(ModelNotFoundException modelNotFoundException){
		ModelException modelException = new ModelException(modelNotFoundException.getMessage(),modelNotFoundException.getCause(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(modelException, HttpStatus.NOT_FOUND);
	}
	
}
