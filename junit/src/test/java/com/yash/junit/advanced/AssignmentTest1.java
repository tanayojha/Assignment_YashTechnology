/**
 * 
 */
package com.yash.junit.advanced;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yash.junit.advanced.stringAssignment.Assignment1;
import com.yash.junit.advanced.stringAssignment.Document;

/**
 * @author tanay.ojha
 *
 */
public class AssignmentTest1 {

	Assignment1 a1;
	Document doc;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a1 = new Assignment1();
		doc = new Document();
	}

	@Test
	public void test() {
		assertEquals("javabasics , c:/document/corejava/basics/introduction.pdf",
				a1.showDocumentInformation("javabasics","c:/document/corejava/basics/introduction.pdf"));
	}

}
