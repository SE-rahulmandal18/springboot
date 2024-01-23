package com.simpli.equalsmethod;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {

		boolean flag = false;

		MyDate d = (MyDate) obj;

		if (d.day == this.day && d.month == this.month && d.year == this.year) {
			flag = true;
		}

		return flag;
	}

	public void printDate() {
		System.out.println("Date= " + day + "/" + month + "/" + year);
		; // dd/mm/yyyy
	}

}
