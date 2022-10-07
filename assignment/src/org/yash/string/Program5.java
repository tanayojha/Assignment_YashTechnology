package org.yash.string;
/**
 * 
 * @author tanay.ojha
 *
 */
/*
 * WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
 * 
 */
public class Program5 {
	public static void main(String[] args) {
		 	String s1 = "tanay";
		 
	        // Calling above defined method
	        concat1(s1);
	 
	        // s1 is not changed
	        System.out.println("String: " + s1);
	 
	        // String 1
	        StringBuilder s2 = new StringBuilder("tanay");
	        // String 3
	        StringBuffer s3 = new StringBuffer("tanay");
	 
	        // Calling above defined method
	        concat2(s2);
	        // Calling above defined method
	        concat3(s3);
	 
	        // s2 is changed
	        System.out.println("StringBuilder: " + s2);
	 
	        // s3 is changed
	        System.out.println("StringBuffer: " + s3);
	}
	
	 public static void concat1(String s1)
	    {
	        s1 = s1 + "ojha";
	    }
	 
	    // Method 2
	    // Concatenates to StringBuilder
	    public static void concat2(StringBuilder s2)
	    {
	        s2.append("ojha");
	        long currentTimeMillis = System.currentTimeMillis();
	        System.out.println("Builder time: "+currentTimeMillis);
	        
	    }
	 
	    // Method 3
	    // Concatenates to StringBuffer
	    public static void concat3(StringBuffer s3)
	    {
	        s3.append("ojha");
	        long currentTimeMillis = System.currentTimeMillis();
	        System.out.println("Buffer time: "+currentTimeMillis);
	    }
	 
	    
}
