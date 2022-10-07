package org.yash.collection;

import java.util.Collections;
import java.util.Vector;

/**
 * 
 * @author tanay.ojha
 *	WAP to store data related to item in Vector and after that sort the data.
 */
public class Program5 {
	public static void main(String[] args) {
		 Vector v = new Vector();
		 v.add("This");
		 v.add("is");
		 v.add("a");
		 v.add("yash");
		 v.add("Technology");
		 System.out.println("The Vector item is "+v);
		 
		 Collections.sort(v);
		 System.out.println("The Sorted Vector item is "+v);

	}
}
