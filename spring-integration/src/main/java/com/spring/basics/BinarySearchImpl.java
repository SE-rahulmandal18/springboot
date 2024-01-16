package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int BinarySearch(int[] numbers, int numberToSearchFor) {

		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumber= bubbleSortAlgorithm.sort(numbers);
		
		System.out.println( sortAlgorithm);
		
		   //implementing sorting an array
		   // Bubble sort Algorithm
		   //Quick sort
			//searching an array
			
		//retrun the result
		return 3;
		

	}
	
	
	
}
