package com.yash.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	//
	//@Mock
	//CalculatorService service;
	//@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	Calculator c = null ;
	
	//Mock or fake object
//	CalculatorService service = new CalculatorService() {
//		
//		public int perform(int i, int j) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};
	
	CalculatorService service = mock(CalculatorService.class);
	
	@Before
	public void beforeTest() {
		c = new Calculator(service);
	}


	@Test
	public void test() {
		when(service.perform(2, 3)).thenReturn(5);
		assertEquals(5, c.calcualte(2, 3));
		verify(service).perform(2, 3);
	}
	

}
