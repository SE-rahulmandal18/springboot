package com.simpli.encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setRadius(-10);
		
		double radius = c.getRadius();
 
		System.out.println("Radius = "+radius); 
	}

}