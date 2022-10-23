/**
 * 
 */
package com.yash.junit.intermediate;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author tanay.ojha
 *
 */
public class ProgramTest7 {
	
	Program7 p7;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p7 = new Program7();
	}

	@Test
	public void test() {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee("Mukesh", "SE", 101, true));
		arrayList.add(new Employee("Dinesh", "SE", 102, true));
		arrayList.add(new Employee("Rakesh", "SE", 103, true));
		assertEquals(3, p7.calculateNoOfEmployees(arrayList));
	}

}
