package com.simpli.functionalinterface;

import java.util.function.Predicate;

public class LambdaExpressions3 {

	public static void main(String[] args) {
	
		// Predicate, UnaryOperator, BinaryOperator - Generic Interface
		
		int a = 20;
		
		/*
		 * Predicate<Integer> p = new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer num) {
		 * 
		 * return num % 2 == 0; } };
		 */
		
		// using Lambda
		Predicate<Integer> p = (Integer num) -> num % 2 == 0; 
		
		System.out.println(p.test(a));
		
	}
}
