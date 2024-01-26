package com.simpli.fileio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileIO2 {

	public static void main(String[] args) {
		
		try(// FileInputStream fin = new FileInputStream("file.txt");
				FileReader fr = new FileReader("file.txt");
				BufferedReader br = new BufferedReader(fr)){
			
//			int i= 0;
//			while( (i = fin.read()) != -1 ) {
//				System.out.print((char)i);
//			}
		
		 int count = 0;
		 String str = "";
		 while(( str = br.readLine()) != null) {
			 
			 count++;
			 System.out.println(str);
		 }
			
			System.out.println(count);
		}
		catch (Exception e) {
		   e.printStackTrace();
		}

	}

}
