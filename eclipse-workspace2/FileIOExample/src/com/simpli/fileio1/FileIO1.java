package com.simpli.fileio1;

import java.io.FileOutputStream;

public class FileIO1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fout=  new FileOutputStream("file.txt", true);){
			
			System.out.println("File is created...");
			
			String data = "Hello World";
			byte[] b = data.getBytes();
			
			fout.write(b);
			
		}
		catch (Exception e) {
		   e.printStackTrace();
		}

	}

}
