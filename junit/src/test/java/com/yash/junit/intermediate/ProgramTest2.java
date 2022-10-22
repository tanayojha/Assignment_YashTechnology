package com.yash.junit.intermediate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author tanay.ojha
 *
 */
public class ProgramTest2 {
	
	Program2 program2;
	
	@Before
	public void beforeTest() {
		program2 = new Program2();
	}

	@Test
	public void testCustomLength() {
		assertEquals(program2.customLength("Yash Technologies"), 17);
	}
	
	@Test
	public void testCustomCharAt() {
		assertEquals(program2.customCharAt("Yash Technologies", 7), 'c');
	}
	
	@Test
	public void testCustomConcat() {
		assertEquals(program2.customConcat("Yash", "Technologies"), "YashTechnologies");
	}
}
