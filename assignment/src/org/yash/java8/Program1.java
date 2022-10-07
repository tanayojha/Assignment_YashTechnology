package org.yash.java8;

import java.util.Scanner;

/**
 * 
 * @author tanay.ojha
 *
 */
@FunctionalInterface
 interface Palindrome{
	String isPalindrome(String str);
}

public class Program1 {

	static String reverse="";
	public static void main(String[] args) {
		
		System.out.println("Enter number -");
		Scanner scan = new Scanner(System.in);
		String next = scan.next();
		Palindrome p = (s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			return reverse;
		};

		String palindrome = p.isPalindrome(next);
		if (palindrome.equalsIgnoreCase(reverse)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}

	}
}
