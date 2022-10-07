package org.yash.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author tanay.ojha
 * WAP to sort Collection elements in ascending order.
 */
public class Program1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("test1","test2","test3","test4","test5");
		Collections.sort(asList);
		System.out.println("Sorted list in Ascending order is "+asList);
		Collections.sort(asList, Collections.reverseOrder());
		System.out.println("Sorted list in Descending order is "+asList);

	}

}
