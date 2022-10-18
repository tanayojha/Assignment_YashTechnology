package org.yash.java8.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author tanay.ojha
 *
 *         ->This Stream method is an intermediate operation which reads stream
 *         and returns new stream after applying given predicate (or condition)
 *         ->Predicate is Functional Interface so either we can pass Predicate
 *         class or lambda expression 
 *         ->Predicate or lambda expression is applied
 *         to each of the elements in the Stream for evaluating for the given
 *         condition 
 *         ->Stream filter() method is stateless which means it is
 *         non-interfering with other elements in the stream 
 *         ->Another intermediate operation can be applied to returned stream like map(),
 *         sorted(), distinct(), etc. after filter() intermediate operation 
 *         ->Note:-
 *         Number of elements returned in the new stream after filtering is
 *         either equal or less than the original stream elements Method
 *         signature :- Stream<T> filter(Predicate<? super T> predicate)
 * 
 */
//WAP to find duplicate numbers and there counting from list of numbers
public class Program2 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 6, 7, 8, 9, 6, 10);
        //find duplicate numbers and there counting from list of number
        System.out.println("duplicate numbers and there counting from list :");
        Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Stream<Integer> map = collect.entrySet().stream().filter(m -> m.getValue() > 1)//Check if frequency > 1  for duplicate elements 
        .map(Map.Entry::getKey);
        map.collect(Collectors.toSet()).forEach(System.out::println);
        
        System.out.println("EVEN number from list of first 10 numbers :");
        // filter only EVEN numbers
        numbers.stream().filter(i -> i%2 == 0).forEach(s -> System.out.println(s));
        //
        System.out.println("cube of even numbers:");
        numbers.stream().filter(i -> i%2 == 0)
		        .map(n -> n*n*n)
		        .collect(Collectors.toList())
		        .forEach(s -> System.out.println(s));
        
        //To find all names with length greater than 5
        List<String> names = Arrays.asList("Sachin","Rahul","Sehwag","Anil","Sourav","Sunil","Laxman" );
        System.out.println("Names with length greater than 5 :");
        names.stream().filter(n -> n.length() > 5).forEach(s -> System.out.println(s));
        //
        System.out.println("Names starting with 'S' and having length greater than 5 : \n");
        names.stream().filter(s -> s.length() > 5 && s.startsWith("S"))
        			  .collect(Collectors.toList())
        			  .forEach(System.out::println);
        
        //
        

	}
}
