package com.example.demo.Exception;

import org.springframework.http.HttpStatus;

public class HostelServiceException extends RuntimeException{
private String msg;
private HttpStatus httpStatus;
public HostelServiceException(String msg, HttpStatus httpStatus) {
	super();
	this.msg = msg;
	this.httpStatus = httpStatus;
}
public String getMsg() {
	return msg;
}
public HttpStatus getHttpStatus() {
	return httpStatus;
}


}
