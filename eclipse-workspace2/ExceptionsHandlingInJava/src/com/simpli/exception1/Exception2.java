package com.simpli.exception1;

import java.io.*;

public class Exception2 {

	public static void main(String[] args) {

		FileInputStream fin = null;
		try {

			fin = new FileInputStream("abc.txt");
			System.out.println("File is open");
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		finally {
			
			try {
				fin.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("cleanup code..");
			System.out.println("finally: always get executed");
		}
		System.out.println("Rest code....");
	}

}
