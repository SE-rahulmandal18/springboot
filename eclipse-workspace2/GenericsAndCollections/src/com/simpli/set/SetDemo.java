package com.simpli.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

//		Set<Integer> numbers = new HashSet<Integer>();
		Set<Integer> numbers = new TreeSet<Integer>();

		  numbers.add(35);
		  numbers.add(12);
		  numbers.add(54);
		  numbers.add(12);
		  numbers.add(6);
		  
		  for (Integer integer : numbers) {
		 
		  System.out.println(integer); }

		// add element inside the collection

//		Set<Employee> emps = new HashSet<Employee>();
		  
		Set<Employee> emps = new TreeSet<Employee>(new SalaryComparator());
		
		emps.add(new Employee(123, "abc", 23213));
		emps.add(new Employee(354, "prq", 12543));
		emps.add(new Employee(455, "prq", 54543));
		emps.add(new Employee(564, "qxy", 45651));

		for (Employee employee : emps) {

			System.out.println(employee);
		}

	}

}
