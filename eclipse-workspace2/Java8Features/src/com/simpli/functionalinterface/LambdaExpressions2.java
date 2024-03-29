package com.simpli.functionalinterface;

@FunctionalInterface
interface Addable2{ // functional interface
	
	int add(int a , int b);
	
}

public class LambdaExpressions2 {

	public static void main(String[] args) {
		
		/*
		 * Addable2 obj = new Addable2() {
		 * 
		 * @Override public int add(int a, int b) {
		 * 
		 * return a + b ; } };
		 */
		
		Addable2 obj = (a, b) -> a + b;  // LambdaExpressions
		
		System.out.println("addition ="+obj.add(6, 7));
		
	}
}
