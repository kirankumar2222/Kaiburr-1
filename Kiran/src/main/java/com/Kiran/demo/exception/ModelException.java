package com.Kiran.demo.exception;

import org.springframework.http.HttpStatus;

public class ModelException {

	private final String message;
	private final String throwable;
	private final HttpStatus httpStatus;
	
	public ModelException(String message, String throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public String getThrowable() {
		return throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
}
