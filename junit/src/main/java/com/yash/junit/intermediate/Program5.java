/**
 * Create a program for a Hostel to calculate the no of students registered. 
 * Student class has three attributes: Student_ID (int), Student_Name (String), Student_class (String).
 * Write methods to get and set above values of the Student object. 
 * Also devise a way to calculate the number of students registered in the hostel.
 */
package com.yash.junit.intermediate;

import java.util.List;

/**
 * @author tanay.ojha
 *
 */

public class Program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static int calculateRegistration(List<Student> studentList) {

		int count = 0;

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).isFlag_registered()) {
				count++;
			}
		}
		return count;
	}

}
