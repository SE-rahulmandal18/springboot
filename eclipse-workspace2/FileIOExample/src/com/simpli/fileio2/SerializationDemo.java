package com.simpli.fileio2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		// 1. FOS 
		
		try(FileOutputStream fos =  new FileOutputStream("book.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(new Book(1, "programing in java", 7877));
			
			System.out.println("Data is written inside the file");
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
