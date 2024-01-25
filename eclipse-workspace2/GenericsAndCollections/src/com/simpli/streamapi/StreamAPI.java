package com.simpli.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,7,5,1,8,3,10);
		
//		for (Integer integer : list) {
//			
//			System.out.println(integer);
//		}

//		list.forEach(System.out::println); // Java 8
		
	    Stream<Integer> stream = list.stream();
	    
//	    stream.sorted().forEach(System.out::println);
	    
	    stream.sorted()
	     .filter(i -> i % 2 != 0)
	     .map(e -> e *2)    
	     .forEach(System.out::println);
	    
	    
	    
	}

}
