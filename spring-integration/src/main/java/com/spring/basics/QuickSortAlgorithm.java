package com.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
   public int[] sort(int[] numbers) {
	   // logic for Quick sort
	   return numbers;
   }
}
