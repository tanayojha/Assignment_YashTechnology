package com.yash.junit.intermediate;

import java.util.List;

/**
 * 
 * @author tanay.ojha
 *
 */
/*
 * Create a program for a Car shop to calculate the no of cars sold. Car class has three attributes: speed (int),
 * car owner (String), car type (String).Write methods to get and set above values of the car object. 
 * Also devise a way to calculate the number of cars sold by the car shop.
 */



public class Program4 {
	public static void main(String[] args) {
	}
	
	public static int calculation(List<Car>carsList) {
		
		int count = 0;
		
		for (int i = 0; i < carsList.size(); i++) {
			if(carsList.get(i).isFlagSold()) {
				count++;
			}
		}
		return count;	
	}
}
