/**
 * 
 */
package com.yash.junit.advanced;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author tanay.ojha
 *
 */
public class ApplicationTest {
	
	ApplicationService service;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		service = new ApplicationService();
	}

	@Test
	public void test() {
		ArrayList<Application> arrayList = new ArrayList<Application>();
		arrayList.add(new Application("101", "Nexus"));
		arrayList.add(new Application("102", "Meta"));
		Application[]app = (Application[]) arrayList.toArray();
		assertEquals(2, service.addApplication(app));
	}

}
