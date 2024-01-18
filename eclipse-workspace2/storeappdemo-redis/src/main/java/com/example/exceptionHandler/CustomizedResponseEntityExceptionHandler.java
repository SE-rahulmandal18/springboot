package com.example.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.exception.ExceptionResponse;
import com.example.exception.ProductNotFoundException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

 @ExceptionHandler(ProductNotFoundException.class)
 ResponseEntity<ExceptionResponse>	handleNotFoundException(ProductNotFoundException ex, WebRequest request){
	 
	 ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());
	 
	 return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_ACCEPTABLE);
		
	}
}
