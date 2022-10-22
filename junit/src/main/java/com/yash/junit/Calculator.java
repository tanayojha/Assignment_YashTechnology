package com.yash.junit;

/**
 * 
 * @author tanay.ojha
 *
 */
public class Calculator {
	
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calcualte(2,3);
	}
	
	
	public int calcualte(int i, int j) {
		return service.perform(i,j);
		//return i+j;
	}
}


