package org.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/**
 * 
 * @author tanay.ojha 
 *         WAP to store data in hashmap. Keys are the city name and
 *         values are the population. Now you have to sort the all elements (on
 *         the basis of city name ) in hashmap and print the detail.
 */
public class Program6 {
	
	
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Rio", "500000");
		hashMap.put("NewYork", "1000000");
		hashMap.put("Mumbai", "500000");
		hashMap.put("Dubai", "200000");
		hashMap.put("Sydney", "400000");
		hashMap.put("London", "800000");
		hashMap.put("Rome", "300000");
		hashMap.put("Ottawa", "200000");
		
		// using for-each loop for iteration over Map.entrySet()
        for (Entry<String, String> entry : hashMap.entrySet()) 
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());        
        
        // using iterators
        Iterator<Entry<String, String>> iterator = hashMap.entrySet().iterator();
          
        while(iterator.hasNext())
        {
        	Entry<String, String> entry = iterator.next();        	
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        
        System.out.println("\nNow Sorting the Hashmap elements\n");
        
        ArrayList<String> keyList = new ArrayList<String>(hashMap.keySet());
        Collections.sort(keyList);
        
        System.out.println("Sorted list "+keyList);
        
       TreeMap<String, String>treeMap = new TreeMap<String, String>(hashMap);
       //Set<String>set = new SortedSet<String>(treeMap);
        
        
       
      

       
        
	}
}
