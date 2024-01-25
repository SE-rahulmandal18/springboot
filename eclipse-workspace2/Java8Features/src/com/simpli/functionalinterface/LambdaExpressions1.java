package com.simpli.functionalinterface;

@FunctionalInterface
interface Addable{ // functional interface
	
	int add();
	
//	default void print() {
//		 
//	}
	
	
}

public class LambdaExpressions1 {

	public static void main(String[] args) {
		
		/*
		 * Addable a = new Addable() {
		 * 
		 * @Override public int add() {
		 * 
		 * int a= 29; int b = 39;
		 * 
		 * return a + b; } };
		 */
		
	Addable obj = () -> {
				int a= 29; 
				int b = 39;
				return a + b;		
		};
		
		System.out.println("addition = "+obj.add());
	}

}
