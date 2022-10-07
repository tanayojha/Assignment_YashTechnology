package org.yash.oops.assignment.program1;

/**
 * 
 * @author tanay.ojha
 *
 */

/*
 * Create a class Person with following member and setter getter for them. Pid,
 * pname, paddress,dob all are private. Now Person class will be inherit by the
 * Employee class will have following fields salary, date_of_joining,
 * base_location, deptobj, contactno, emailid. Department class will have
 * following member, deptid, and dname. Customer class also inherit the Person
 * class, it also has following fields: - date_of_registration,
 * delivery_address, contactno, email_id. Setter and getter methods for all
 * class variables should be declared. Now you have to create object of Employee
 * class and Customer class. With the help of super keyword initialize the
 * person class data members as they are protected. Create array of object of
 * department class and while creating the object of the Employee class we will
 * pass object of that particular department. Now print all details of the
 * Customer and Employee.
 * 
 */
public class Program1 {

	public static void main(String[] args) {

		Department[] dep = new Department[3];

		Employee[] e1 = new Employee[3];
		// create object of Employee class and Customer class
		Employee employee1 = new Employee("p1", "Deepak", "Dewasnaka", "25/08/1989", 10000, "01/09/2022", "Indore",
				"9589029101", "abc@gmail.com", new Department(101, "IT"));
		e1[0] = employee1;
		Employee employee2 = new Employee("p2", "Tanay", "Dewasnaka", "15/07/1999", 10000, "01/09/2022", "Indore",
				"952345678", "xxx@gmail.com", new Department(102, "HR"));
		e1[1] = employee2;
		Employee employee3 = new Employee("p3", "Roshni", "Vijaynagar", "05/01/1999", 10000, "01/09/2022", "Indore",
				"898242454", "123@gmail.com", new Department(103, "SALES"));
		e1[2] = employee3;

		Customer customer = new Customer("c1", "Ujwal", "MR10", "25/08/1989", "01/09/2022", "MR10", "9589029101",
				"abc@gmail.com");
		customer = new Customer("c2", "Prakash", "MR11", "25/08/1989", "01/09/2022", "MR10", "9589029101",
				"abc@gmail.com");
		customer = new Customer("c3", "Ragini", "MR9", "25/08/1989", "01/09/2022", "MR10", "9589029101",
				"abc@gmail.com");

		for (int i = 0; i < dep.length; i++) {
			System.out.println(e1[i].toString());
		}

	}
}
