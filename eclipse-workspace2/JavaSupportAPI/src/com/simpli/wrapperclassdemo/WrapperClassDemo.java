package com.simpli.wrapperclassdemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		// Autoboxing and Auto Unboxing
		
		int num = 10;
	    Integer i = num;   // Autoboxing   //	    System.out.println(i.SIZE);
	    
	    int sum = 0;
	    
	    for (String str : args) {
			
	    	sum += Integer.parseInt(str);
		}
	    System.out.println("sum ="+sum);

	    
	    

	}

}
