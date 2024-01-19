package com.simpli.demo;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	// default constructor
	public MyDate() {
		day = 18;
		month = 1;
		year = 2024;
	}
	
	public MyDate(int d, int m) {
		
		day = d;
		month = m;
		year = 2024;
	}
	
	public MyDate(int d, int m, int y) {
	
		day = d;
		month = m;
		year = y;
	}

   public void acceptDate(int d, int m, int y) {
	    day = d;
	    month = m;
		year = y;
   }

	public void printDate() {
		System.out.println("Date= "+ day + "/" + month + "/" + year );; // dd/mm/yyyy
	}
	
}
