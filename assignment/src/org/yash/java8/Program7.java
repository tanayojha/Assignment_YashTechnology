package org.yash.java8;

/**
 * 
 * @author tanay.ojha 
 * WAP to calculate EMI and print the total number of EMIs
 *         for given amount, rate of interest and time duration. (Time can also
 *         be like this 12 months, 18 months, 24 months etc).
 */

interface Emi{
	double calculate();
}

public class Program7 {
	
	private static double  total_No_Of_EMIs = 12;
	private static double amount = 200000;
	private static double rate_of_interest = 6;
	private static int time_duration = 20;
	private static double emi;
	
	public static void main(String[] args) {
		
		Emi emi_ = () -> {
			emi = (amount*rate_of_interest*Math.pow(1+rate_of_interest,time_duration))
					/(Math.pow(1+rate_of_interest,time_duration)-1);
		
			return emi;
		};
		
		System.out.println(emi_.calculate());
		
			
	}
}
