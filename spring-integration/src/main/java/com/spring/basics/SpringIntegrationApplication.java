package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.simpli.binarySearch;

@SpringBootApplication
public class SpringIntegrationApplication {

	// What are the beans
	// What are the dependencies for bean
	// Where to search for bean
   	
	
	
	public static void main(String[] args) {
		
		//concept of loosely coupling
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//com.spring.basics.BubbleSortAlgorithm@1c4af82c
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//com.spring.basics.QuickSortAlgorithm@379619aa
		
		//int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3 );
		//System.out.println(result);
		
		
		
		// Application context manages all the beans
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIntegrationApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.BinarySearch(new int[] {12, 4, 6}, 3 );
		
		System.out.println(result);
	}

}
