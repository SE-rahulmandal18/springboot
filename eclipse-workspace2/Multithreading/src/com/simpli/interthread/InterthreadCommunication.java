package com.simpli.interthread;

class Account {

	private double balance = 2000;


	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public synchronized void withdraw(int amount) {

		System.out.println("withdrawl is happening with amount = " + amount);

		delay(1000);
		
		if (balance < amount) {

			System.out.println("Insufficient balance....");
			
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		} 
			balance -= amount;

			System.out.println("withdrawl successful...remaining balance =" + balance);
		
	}

	public synchronized void deposit(int amount) {

		System.out.println("deposit is happening with amount = " + amount);

		delay(1000);
		
		balance += amount;

		System.out.println("deposit successful...remaining balance =" + balance);
	     
		notify();
	}

}

public class InterthreadCommunication {

	public static void main(String[] args) {

		Account account = new Account();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				account.withdraw(5000);
			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {

				account.deposit(5000);
			}
		};
		

		Thread t1 = new Thread(r1,"wt");
		Thread t2 = new Thread(r2,"dt");

		
		t1.start();
		t2.start();

	}

}
