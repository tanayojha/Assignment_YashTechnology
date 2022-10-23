/**
 * 
 */
package com.yash.junit.intermediate;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author tanay.ojha
 *
 */
public class ProgramTest6 {
	
	Program6 p6;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p6 = new Program6();
	}

	@Test
	public void test() {
		ArrayList<Book> arrayList = new ArrayList<Book>();
		arrayList.add(new Book("Harry Potter", 120.25, "fiction", true));
		arrayList.add(new Book("Powers Within", 150.50, "Spritual", true));
		arrayList.add(new Book("Savitri", 250.00, "Mahakavya", true));
		assertEquals(3, p6.calculateNoOfBooks(arrayList));
	}

}
