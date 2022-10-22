/**
 * 
 */
package com.yash.junit.intermediate;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tanay.ojha
 *
 */
public class ProgramTest5 {
	
	Program5 p5;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p5 = new Program5();
	}

	@Test
	public void testNoOfRegisteredStudent() {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(101, "Lalu", "IT", true));
		arrayList.add(new Student(102, "Kalu", "IT", true));
		arrayList.add(new Student(103, "Balu", "IT", false));
		assertEquals(2,p5.calculateRegistration(arrayList));
	}

}
