package com.example.demo.ExceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exception.HostelServiceException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(exception = HostelServiceException.class)
	public ResponseEntity handleHostelServiceException(HostelServiceException hostelServiceException) {
		return new ResponseEntity(hostelServiceException.getMsg(),hostelServiceException.getHttpStatus());
	}
	
}
