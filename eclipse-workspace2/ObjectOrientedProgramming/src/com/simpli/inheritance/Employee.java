package com.simpli.inheritance;

public class Employee {

	private int id;
	private String name;
	private double basicSalary;
	
	public Employee() {
		
		System.out.println("In Employee Constructor");
	}
	
	public Employee(int id, String name, double basicSalary) {
		
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary() {
		
		return this.basicSalary;
	}


	@Override
	public String toString() { // object - super class
		return "[id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	
	
	
	
}
