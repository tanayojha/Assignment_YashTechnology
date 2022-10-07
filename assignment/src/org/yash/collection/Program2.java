package org.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author tanay.ojha WAP to store all Collection elements in Array and perform
 *         the Binary Search
 * 
 */
/*
 * Binary Search in Java is a search algorithm that finds the position of a
 * target value within a sorted array. Binary search compares the target value
 * to the middle element of the array. It works only on a sorted set of
 * elements. To use binary search on a collection, the collection must first be
 * sorted.
 */
public class Program2 {

	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		arr.add(30);
		arr.add(35);
		int binarySearch = Collections.binarySearch(arr, 10);
		System.out.println(binarySearch);
		//int index = Collections.binarySearch(arr, 13);
		//System.out.println(index);

	}
}
