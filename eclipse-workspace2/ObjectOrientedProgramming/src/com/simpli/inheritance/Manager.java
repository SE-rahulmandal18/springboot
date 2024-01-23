package com.simpli.inheritance;

public class Manager extends Employee{
	
	private double incentives;
	
	public Manager() {
		
	}


	public Manager(int id, String name, double basicSalary, double incentives) {

		super(id, name, basicSalary);
		this.incentives = incentives;
	}

	// Method Overriding - Dynamic Polymorphism
	
	public double calculateSalary() {
		
		return super.calculateSalary() + incentives;
	}


	@Override
	public String toString() {
		return "Manager= " +super.toString()+ "[incentives=" + incentives + "]";
	}
	
	

}
