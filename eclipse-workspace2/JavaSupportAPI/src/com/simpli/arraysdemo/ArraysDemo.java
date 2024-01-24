package com.simpli.arraysdemo;


public class ArraysDemo {

	public static void main(String[] args) {
			
//		singleDArray();
//		multiDArray();
		objectArrays();

	}
	
    private static void objectArrays() {
		
    	MyDate[] dates = new MyDate[3]; // Arrays of MyDate References
    	
    	dates[0] = new MyDate(10, 1, 3);
    	dates[1] = new MyDate(1, 2, 5);
    	dates[2] = new MyDate(20, 1, 5);
    	
    	for (MyDate myDate : dates) {
			
    		System.out.println(myDate);
		}
		
	}

	private static void multiDArray() {
		
    	int[][] arr = new int[3][3];
    	int count = 1;
    	
    	for (int i = 0; i < arr.length; i++) {
    		
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = count++;
			}
		}
    	
		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * for (int j = 0; j < arr[i].length; j++) {
		 * 
		 * System.out.println(" "+arr[i][j]); }
		 * 
		 * System.out.println(); }
		 */
		
    	for (int[] row : arr) {
			
    		for (int col : row) {
				
    			System.out.println(" "+col);
			}
    		System.out.println();
		}
	}

	private static void singleDArray() {
	
    	int[] arr = new int[5];
		int count = 1;
		
		for(int i=0;  i<arr.length; i++) {
			
			arr[i] = count++;
		}
		
		/*
		 * for(int i=0; i<arr.length; i++) {
		 * 
		 * System.out.println(arr[i]); }
		 */
		
		for(int element : arr) {
			
			System.out.println(element);
		}
    }
    
}