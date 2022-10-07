package org.yash;

public class PrimeNumber {

	static int n = 100;

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {

			// if the number is divisible by i, then n is not a prime number.
			if (n % i == 0) {
				System.out.println("The number is not Prime");
			}

		}
	}

}
