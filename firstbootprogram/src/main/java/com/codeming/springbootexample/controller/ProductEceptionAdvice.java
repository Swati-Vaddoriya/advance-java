package com.codeming.springbootexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductEceptionAdvice {
	
	@ExceptionHandler(value = ProductException.class)
	public ResponseEntity<Object> exception (ProductException exception){
		return new ResponseEntity<>("Product id should be 2 digits only...!!",HttpStatus.NOT_FOUND);
	}
	

}
