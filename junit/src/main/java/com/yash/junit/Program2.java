package com.yash.junit;
/**
 * 
 * @author tanay.ojha
 *
 */
public class Program2 {
	public long factorial(int num) {
		long factorial = 1;
		for(int i = 1; i <= num; ++i)
		{
			factorial *= i;
		}
		return factorial;
	}
}
