package com.simpli.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface Sayable {
	
	void say();
}

public class MethodRef {
	
	public static void saySomething() {
		
		System.out.println("Hello Say Something...");
	}

	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(2,5,4,6,7,1,9);

//		 Consumer<Integer> c =  a -> System.out.println(a);
			
		 list.forEach(System.out::println); 
		 
		 Sayable s = MethodRef::saySomething;
		 s.say();
	}
}
