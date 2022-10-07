package org.yash.exception.assignment;

import java.util.Scanner;

/**
 * 
 * @author tanay.ojha
 *
 */
public class Progrm3 {
	public static void main(String[] args) {
		System.out.println("Enter Array Size -");
		// taking Array size as user input
		Scanner s = new Scanner(System.in);
		int nextInt = s.nextInt();

		try {
			
			int num = Integer.parseInt("" + nextInt);

			// s is a valid integer
			int result = checkValue(nextInt);
			if (result == 1) {
				System.out.println("Posittive Number Value");
			} else {
				System.out.println("Negative Number Vlaue");
			}

			// try Creating dynamic Array on given input size by user
			int array[] = new int[nextInt];
			for (int i = 0; i < nextInt; i++) {
				array[i] = i + 1;
				System.out.println(array[i]);
			}
			
			// Array Created Successfully
			System.out.println("Array Created Successfully");

		} catch (NegativeArraySizeException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Given Number is either negative or invalid");
		}
	}

	// Function to check number is positive or negative
	static int checkValue(int x) {
		// inbuilt signum function
		int ans = Integer.signum(x);
		return ans;
	}
}
