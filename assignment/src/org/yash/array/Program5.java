package org.yash.array;

/**
 * 
 * @author tanay.ojha 
 * 	       An Array Contain different numbers you have to find how
 *         many are even, odd, perfect and prime
 */
public class Program5 {
	public static void main(String[] args) {
		int[] arr = {11,32,42,56,26,39,93,2,3,19};
		int count_even = 0, count_odd = 0, count_prime = 0;
		int prime;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				count_even++;
			}else if(arr[i]%3 == 0) {
				count_odd++;
			}
			else  {
				count_prime++;
			}
		}
		System.out.println("The count of even number is: "+count_even);
		System.out.println("The count of odd number is: "+count_odd);
		System.out.println("The count of prime number is: "+count_prime);


		
	}
}
