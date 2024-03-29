package com.simpli.equalsmethod;

public class EqualsDemo {

	public static void main(String[] args) {

		String str1 = "Hello";
//		String str2 = "Hello";
		String str2 = new String("Hello");

		if (str1.equals(str2)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		MyDate d1 = new MyDate(1, 2, 3);
		MyDate d2 = new MyDate(1, 2, 3);

		if (d1.equals(d2)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

	}
}
