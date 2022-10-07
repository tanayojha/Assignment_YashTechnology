package org.yash.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author tanay.ojha 
 * 		   WAP to store elements in List and remove all duplicates
 *         names of items. After duplicates are removed print all elements in
 *         descending order.
 */
public class Program4 {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Tanay","Subham","Deepesh","Ritika","Rupal","Priyanka","Tanay","Subham");
		
		//Set
		Set<String>set = new HashSet<String>();
		set.addAll(asList);
		
		System.out.println("List after removing Duplicate elements"+set);
		
		 TreeSet<Object> treeSet = new TreeSet<Object>();
		
		for(Object tree:set)
			treeSet.add(tree);
		
		  TreeSet<Object> res = (TreeSet<Object>)treeSet.descendingSet();
	      System.out.println("TreeSet after sorting in descending order\n" + res);
		
	}
}
