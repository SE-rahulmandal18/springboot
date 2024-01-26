package com.simpli.thread1;

class MyThread2 implements Runnable {

	@Override
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

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		MyThread obj = new MyThread();
		
		Thread t1 = new Thread(obj,"one");
		Thread t2 = new Thread(obj,"two");
		Thread t3 = new Thread(obj,"three");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
