package com.yash.junit.intermediate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProgramTest1 {
	
	Program1 prog;
	
	@Before
	public void beforeTest() {
		prog  = new Program1();
	}
	
	@Test
	public void testStringLength() {
		assertEquals(prog.checkStringLength("YashTechnologies"), 16);
	}
	
	@Test
	public void testStringConCat() {
		assertEquals(prog.concatString("Yash","Technologies"), "YashTechnologies");
	}

	@Test
	public void testStringCharAt() {
		assertEquals(prog.charAtString("Yash",2),'s');
	}
	
	@Test
	public void testStringContains() {
		assertEquals(prog.containsString("Yash","Technologies"), false);
	}
	
	@Test
	public void testStringSplit() {
		assertEquals(prog.splitString("YashxyzTechnologiesxyz"),new String[] {"Yash","Technologies"});
	}
	
	@Test
	public void testStringIndexOf() {
		assertEquals(prog.indexOfString("Technologies",'n'), 4);
	}
	
	@Test
	public void testStringReplace() {
		assertEquals(prog.replaceString("YashLechnologies",'L','T'), "YashTechnologies");
	}
	
	@Test
	public void testStringSubstring() {
		assertEquals(prog.subString("YashTechnologies", 0, 4), "Yash");
	}
	

}
