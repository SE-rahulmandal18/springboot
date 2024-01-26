package com.simpli.fileio2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		
		// 1. FOS 
		
		try(FileInputStream fis =  new FileInputStream("book.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Book b = (Book) ois.readObject();
			System.out.println(b);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
