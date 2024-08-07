package com.simpli.interfacemethods;

interface Callable{
	
	default void print() {
		
		System.out.println("print default method in interface");
		
	}
	static void display() {
		
		System.out.println("display static method in interface");
		
	}
	
	void call();
}

/*
 * class Phone implements Callable {
 * 
 * @Override public void call() {
 * 
 * System.out.println("calling from a phone..."); } }
 */

public class InterfaceMethods {

	public static void main(String[] args) {
		
		Callable.display();
		
		Callable c = new Callable() {  // inner class
			
			@Override
			public void call() {
				
				System.out.println("calling from a phone..");
				
			}
		};
		
		c.print();
		c.call();

	}

}
