package com.simpli.props;

import java.io.FileInputStream;
import java.util.Properties;

public class PropsMain {

	public static void main(String[] args) {
		
			try(FileInputStream fin = new FileInputStream("user.properties")) {
				
				Properties p = new Properties();
				p.load(fin); // loads all the properties and create Map of <String, String>
				
				System.out.println(p.getProperty("username")+" "+p.getProperty("password"));
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

	}

}
