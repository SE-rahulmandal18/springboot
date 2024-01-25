package com.simpli.list;

class Employee{
	
	private int empId;
	private String name;
	private double Salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Salary=" + Salary + "]";
	}
	public String getName() {
		return name;
	}
	
	
}
