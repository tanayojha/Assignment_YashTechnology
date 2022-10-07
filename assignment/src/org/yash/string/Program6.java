package org.yash.string;
/**
 * 
 * @author tanay.ojha
 *
 */
/*
 *  WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.
 * 
 */
public class Program6 {
	public static void main(String[] args) {
		Program6 prog = new Program6();
		prog.method1();
		prog.method2();
	}
	
	private void method1() {
		 String s1 = "abc";
	        String s2 = "abc";
	  
	        // Note that this == compares whether
	        // s1 and s2 refer to same object or not
	        if (s1 == s2)
	           System.out.println("Yes");
	        else
	           System.out.println("No");
	}
	
	private void method2() {
		 String s1 = new String("abc");
	        String s2 = new String("abc");
	  
	        // Note that this == compares whether
	        // s1 and s2 refer to same object or not
	        if (s1 == s2)
	           System.out.println("Yes");
	        else
	           System.out.println("No");
	}
}


