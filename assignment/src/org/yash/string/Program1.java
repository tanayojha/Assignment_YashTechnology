package org.yash.string;

/**
 * @author tanay.ojha
 * Create a program in which two string is input by the user and after that 
 * user will enter index in first string where we want to insert the second string 
 * and insert the second string at that index and create a new string
 */
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tanay
		// ojha
		// 3
		// tanojhaay
		// Taking Input from User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String - ");
		String first = sc.next();
		System.out.println("Enter Second String - ");
		String second = sc.next();
		System.out.println("Enter index");
		int index = sc.nextInt();
		//
		char[] charArray = first.toCharArray();
		String s = "";
		for (int i = 0; i < first.length(); i++) {
			s += charArray[i];
			if (index == i) {
				s += second;
			}
		}
		System.out.println("Final String: " + s);

	}

}
