package com.simpli.customexception;

import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		validateAge(age);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("rest code....");
	}

	private static void validateAge(int age) throws InvalidAgeException {
		
		if(age > 18 ) {
			System.out.println("Age is valid for voting... ");
			
		}else {
			throw new InvalidAgeException("age < 18 invalid age for voting !");
		}
		
	}

}