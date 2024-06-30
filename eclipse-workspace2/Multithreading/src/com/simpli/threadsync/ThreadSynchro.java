package com.simpli.threadsync;

class Table {  // Resource
	
	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void printTable(int num) {
		
		synchronized (this) {
			
			for (int i = 1; i < 11; i++) {
				
				delay(500);
				System.out.println(+num * i);
			}
		}
	}
}

public class ThreadSynchro {

	public static void main(String[] args) {
		
		Table t = new Table();
		
		Runnable obj1 = new Runnable() {
			
			@Override
			public void run() {
				
				t.printTable(5);
			}
		};

		Runnable obj2 = new Runnable() {
			
			@Override
			public void run() {
				
				t.printTable(100);
			}
		};

		Runnable obj3 = new Runnable() {
			
			@Override
			public void run() {
				
				t.printTable(1000);
			}
		};
		
		Thread t1 = new Thread(obj1,"fiveTable");
		Thread t2 = new Thread(obj2,"hundredTable");
		Thread t3 = new Thread(obj3,"throusandTable");
		
		t1.start();
		t2.start();
		t3.start();
	}

}