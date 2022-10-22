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
public class ProgramTest4 {
	
	Program4 p4;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p4 = new Program4();
	}

	@Test
	public void testNoOfCarsSold() {
		ArrayList<Car> arrayList = new ArrayList<Car>();
		arrayList.add(new Car(120, "Mohan", "Sedan", true));
		arrayList.add(new Car(150, "Tushar", "Hutchback", true));
		arrayList.add(new Car(250, "Rahul", "SUV", false));
		assertEquals(2, p4.calculation(arrayList));
	}
	


}
