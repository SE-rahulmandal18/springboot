package com.simpli.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		
		// Java is Simple and Java is Robust
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Input String:");
		String input = sc.nextLine();
		
		System.out.println("Enter the patter string:");
		String ptext = sc.nextLine();
		
		Pattern p = Pattern.compile(ptext);
		Matcher matcher= p.matcher(input);

		while(matcher.find()) {
			
			System.out.println(matcher.group()+ "start index ="+matcher.start()+ "end index= "+matcher.end());
		}
	}

}
