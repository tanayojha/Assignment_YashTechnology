/**
 * 
 */
package com.yash.junit.intermediate;

import java.util.List;

/**
 * @author tanay.ojha
 *
 */
/*
 * Create a program for a Company to calculate the number of employees working
 * in that company. Employee class has three attributes: emp_Name (String), emp
 * _Designation(String), emp _ID (Integer).Write methods to get and set above
 * values of the Employee object. Also devise a way to calculate the number of
 * employees working in the company
 */
public class Program7 {

	/**
	 * 
	 */
	public Program7() {
		// TODO Auto-generated constructor stub
	}
	
	public static long calculateNoOfEmployees(List<Employee> employeeList) {
		long count = 0;
		for (Employee emp : employeeList) {
			if (emp.isWorking())
				count++;
		}

		return count;
	}
	
	
	

}
