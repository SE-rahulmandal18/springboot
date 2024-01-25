package com.simpli.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		// add element inside the collection
		emps.add(new Employee(123, "abc", 23213));
		emps.add(new Employee(123, "prq", 12543));
		emps.add(new Employee(123, "qxy", 45651));

		emps.add(2, new Employee(999, "hkj", 45453));

		// how many elements ?
		System.out.println("Number of elements = " + emps.size());

		// Remove
//		emps.remove(2);

		// print the list

//		System.out.println("list elements");
//		System.out.println(emps);

		// For each loop
		/*
		 * for (Employee employee : emps) {
		 * 
		 * System.out.println(employee);
		 * 
		 * }
		 */

		
		// Iterator
        // remove
		Iterator<Employee> itr = emps.iterator();
		while (itr.hasNext()) {

			Employee emp = itr.next();
			if (emp.getName().equals("prq")) {

				itr.remove();
			}

//			System.out.println(itr.next());
		}

		for (Employee employee : emps) {

			System.out.println(employee);

		}
		
		// sorting the list of custom objects we go for 
		// Comparable and comparator
	}
}
