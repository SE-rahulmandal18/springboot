package com.simpli.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void divide(int num, int den) {

		int res = num / den;

		System.out.println("Result =" + res);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {   // Inspect the Exception
			System.out.println("Enter the numerator :");
			int num = sc.nextInt();

			System.out.println("Enter the denomirator :");
			int den = sc.nextInt();

			
			divide(num, den);
			
			String str = null;
			str.length();
			
		}
		catch (ArithmeticException | InputMismatchException ex) { // Handle the Exception

			//System.out.println("Denominator should not be zero !");
			ex.printStackTrace();

		} 
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		/*
			 * catch (InputMismatchException ex) {
			 * 
			 * System.out.println(ex.getMessage()); ex.printStackTrace(); }
			 */

		System.out.println("Rest code..........");
	}

}