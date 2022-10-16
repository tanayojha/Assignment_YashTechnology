package org.yash.java8.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * 
 * @author tanay.ojha
 *
 */
//WAP to find third maximum number from list of numbers in java8
public class Program1 {

	public static void main(String[] args) {
		int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        System.out.println("Original Integer List - " + numbers + "\n");
        
      // calculate sum
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum is = " + sum);

        // calculate average
        int average = (int) Arrays.stream(numbers).average().orElse(Double.NaN);
        System.out.println("Average is = " + average);
        
        List<Integer> asList = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        IntSummaryStatistics statistics = asList.stream().mapToInt(num -> num).summaryStatistics();
        
        // 1. sum - print sum to the console
        System.out.println("\n1. Sum is = " + statistics.getSum());
 
        // 2. average - print average to the console
        System.out.println("\n2. Average is = " + statistics.getAverage());
 
        // 3. min - print minimum to the console
        System.out.println("\n3. Minimum is = " + statistics.getMin());
 
        // 4. max - print maximum to the console
        System.out.println("\n4. Maximum is = " + statistics.getMax());
 
        // 5. count - print count to the console
        System.out.println("\n5. Count is = " + statistics.getCount());
       
        //Maximum number from list
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Maximum number - "+max+"\n");
        
        //Minumum number from list
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Minimum number - "+min+"\n");

        
		//third maximum number from list of numbers
        int num = Arrays.stream(numbers)
        		.boxed()//1,2,5,8,9,11,21
        		.sorted(Comparator.reverseOrder())//21,11,9,8,5,2,1
        		.skip(2)//9,2
        		.findFirst()//9
        		.get();
        System.out.println("third maximum number - "+num+"\n");
        
        //third minimum number from list of numbers
        int min_num = Arrays.stream(numbers)
				        .boxed()
				        .sorted(Comparator.naturalOrder())
				        .skip(2)
				        .findFirst()
				        .get();
        System.out.println("third minimum number - "+min_num+"\n");
        
        //First element of a list or Set
        int first = Arrays.stream(numbers).findFirst().getAsInt();
        System.out.println("Random element "+first+"\n");
        //Last element of a list or Set
        int last = Arrays.stream(numbers).reduce((one,two) -> two).getAsInt();
        System.out.println("Last element "+last+"\n");
        
        // local variables
        Map.Entry<Integer, String> firstEntry = null, lastEntry = null;
 
 
        // create HashMap object
        Map<Integer, String> companies = new HashMap<>();
 
        // add entries to newly created HashMap
        companies.put(1, "Amazon");
        companies.put(2, "Microsoft");
        companies.put(3, "Google");
        companies.put(4, "Apple");
        companies.put(5, "Meta");
        
        System.out.println("Map entries :- \n");

        companies.entrySet().stream().forEach(System.out::println);
        //find first entry in Hashmap
        firstEntry = companies.entrySet().stream().findFirst().get();
        //find last entry in Hashmap
        lastEntry = companies.entrySet().stream().reduce((one,two) -> two).get();
        // print to console
        System.out.println("first entry in the Map is " + firstEntry);
        System.out.println("Last entry in the Map is " + lastEntry);
        
        

        

	}
}
