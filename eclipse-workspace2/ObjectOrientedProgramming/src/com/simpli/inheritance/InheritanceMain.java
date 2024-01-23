package com.simpli.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		
//		Employee emp1 = new Employee(1, "Akash",234344.56);
//	
//		System.out.println(emp1);
		
		Manager mgr1 = new Manager(1, "Akash",234344,40000.0);
		
		System.out.println(mgr1);
		
		System.out.println("Manager total salary = "+mgr1.calculateSalary());
	
	}
}
