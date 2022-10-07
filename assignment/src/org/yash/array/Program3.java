package org.yash.array;

import java.util.Scanner;

/**
 * 
 * @author tanay.ojha
 * 		   WAP to create a dynamic array. Dynamic Array means when
 *         user want to input the number more than size of array it will
 *         increase the size of array without throwing exception.
 */
public class Program3 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int n = 0;
		int []arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The Array is :"+arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number -");
		int nextInt = sc.nextInt();
		//assign user input to value
		n = nextInt;
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.println("the new Array is "+arr[i]);
		}
		
	}

}
