package org.yash.exception.assignment;

public class Progrm2 {

	public static void main(String[] args) {
		try {
			double parseDouble = Double.parseDouble("2.3");
			System.out.println(" "+parseDouble);
			
			double parseDouble1 = Double.parseDouble("220");
			System.out.println(" "+parseDouble1);
			
			double parseDouble2 = Double.parseDouble("abc");
			System.out.println(" "+parseDouble2);
			
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
