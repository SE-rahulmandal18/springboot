package com.simpli.datetimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeAPI {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
	      LocalDateTime d2= LocalDateTime.now();
	      System.out.println(d2);
	      
	      DateTimeFormatter format = 
	    		   DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	       
	      String formatedDateTime = d2.format(format);
	      
	      System.out.println("in formatted manner " + formatedDateTime);
	}

}
