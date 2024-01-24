package com.simpli.customexception;

//1. Unchecked
//2. Checked
public class InvalidAgeException extends Exception {

	private String message;

	public InvalidAgeException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
}
