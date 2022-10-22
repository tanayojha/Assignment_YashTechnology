package com.yash.junit.intermediate;
/**
 * 
 * @author tanay.ojha
 *
 */
/*
 * Recreate the above program, but this time you need to write the logic for each method, 
 * you are not supposed to use any of the library method
 */
public class Program2 {
	public static void main(String[] args) {
		Program2 p2 = new Program2();
		//custom method to find length of String
		p2.customLength("Yash technologies");
		//Custom method to find index of String
		p2.customCharAt("Yash", 2);
		//Custom method to concat two strings
		p2.customConcat("Yash", "Technologies");
	}
	
	public String customConcat(String str1, String str2) {
		String str = str1 + "" + str2;
		String s = new String(str);
		return s;
	}
	
	public int customLength(String str) {
		int length = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			length++;
		}
		return length;
	}
	
	public char customCharAt(String s, int index) {
		   char c[] = s.toCharArray();
	       if ((index < 0) || (index >= c.length)) {    
	           throw new StringIndexOutOfBoundsException(index);    
	       }    
	       return c[index]; 
	 }
	
	
}
