package com.simpli.thread1;

class MyThread extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 0; i < 11; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t1 thread priority "+t1.getPriority());
		
		System.out.println("state of thread "+t1.getName()+" ="+t1.getState());
		
		t1.start();
		
		System.out.println("state of thread "+t1.getName()+" ="+t1.getState());
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("state of thread "+t1.getName()+" ="+t1.getState());
		
		t2.start();
		t3.start();
		

	}

}
