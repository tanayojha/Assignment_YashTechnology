/**
 * 
 */
package com.yash.junit.advanced;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tanay.ojha
 *
 */
public class ApplicationTest {
	
	ApplicationService service;
	Application app;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		app = new Application();
		service = new ApplicationService();
	}

	 @Test
	    public void testAddApplication1(){  
		 	//Application[]app = ;
	        assertEquals("Application [appId=101, appName=Nexus]",service.addApplication(new Application[] {new Application("101","Nexus")})); 
	    }

}
