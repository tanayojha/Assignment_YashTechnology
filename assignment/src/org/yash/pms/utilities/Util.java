package org.yash.pms.utilities;

import java.util.Scanner;

import org.yash.pms.impl.ProductServiceImpl;
import org.yash.pms.model.Product;

public class Util {

	public static Scanner scan;  
	
	public Util() {
		// TODO Auto-generated constructor stub
		scan  = new Scanner(System.in);
	}
	
	public static int userInputInInteger() {
		int next = scan.nextInt();//
		return next;
	}
	
	public static String userInputInString() {
		String next = scan.next();
		return next;
	}
	
	public static double userInputInDouble() {
		double next = scan.nextDouble();
		return next;
	}
	

}
