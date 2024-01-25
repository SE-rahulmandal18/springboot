package com.simpli.set;

import java.util.Objects;

class Employee implements Comparable<Employee>{

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
	public int hashCode() {
		return Objects.hash(Salary, empId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary) && empId == other.empId
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Salary=" + Salary + "]";
	}

	public String getName() {
		return name;
	}
	
	

	public double getSalary() {
		return Salary;
	}

	@Override
	public int compareTo(Employee emp) {
		
//		if(this.empId > emp.empId)
//			return 1;
//		else if(this.empId < emp.empId)
//			return -1;
//		else
//		    return 0;
		
		return this.name.compareTo(emp.name);
	} 

}
