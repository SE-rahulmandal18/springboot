package com.simpli.demo;

public class DateMain {

	public static void main(String[] args) {
		
		MyDate d = new MyDate();
		//d.acceptDate(18,1,2024)
		d.printDate();
		
	    // Date d2 = new Date();
		// System.out.println("Todays Date = "+d2);
		 
		MyDate d2 = new MyDate(18, 1);
		d2.printDate();

	}

}
