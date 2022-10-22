/**
 * 
 */
package com.yash.junit.intermediate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tanay.ojha
 *
 */
public class ProgramTest3 {
	
	Program3 p3;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p3 = new Program3();
	}

	@Test
	public void testEvaluationForJSP() {
		assertEquals(p3.evaluationURL("www.google.com/searches/searchdata.jsp"),"searchdata");
	}

	@Test
	public void testEvaluationForXHTMl() {
    	assertEquals(p3.evaluationURL("www.yash.com/employees/salary.xhtml"),"salary"); 
	}
	
	@Test
	public void testEvaluationForHTMl() {
    	assertEquals("index",p3.evaluationURL("www.yash.com/index.jsp")); 
	}
	
	

}
