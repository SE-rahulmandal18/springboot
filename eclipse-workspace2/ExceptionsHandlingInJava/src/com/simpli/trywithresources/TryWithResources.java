package com.simpli.trywithresources;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Demo implements AutoCloseable{

	@Override
	public void close() {

          System.out.println("close is called...");
		
	}
	
}

public class TryWithResources {

	public static void main(String[] args) {
		

		try(PrintWriter pw = new PrintWriter("abc.txt"); Demo obj = new Demo();) { // Automatic resource management
			
			pw.write("Hello Java");
			
			System.out.println("Content written inside the file...");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} 
		
	}

}
