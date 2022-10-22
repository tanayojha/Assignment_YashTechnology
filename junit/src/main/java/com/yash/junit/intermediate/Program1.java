package com.yash.junit.intermediate;

/**
 * 
 * @author tanay.ojha
 *
 */

/*
 * Create StringTest class, this will have multiple test cases like
 * testStringLength(), testIndexOfTest() etc. which will be testing all the
 * String methods. You need to write the test cases for below methods for
 * StringDemo component. charAt, concat, contains, endsWith, equals,
 * equalsIgnoreCase, indexOf, intern, lastIndexOf, length, replace, split,
 * substring, toLowerCase, toUpperCase,trim, valueOf.
 */
public class Program1 {

	public static void main(String[] args) {
		String str = "yashxyzTechnologiesxyz";
		String str1 = "Yash";
		String str2 = "Technologies";
		Program1 p = new Program1();
		//length of String
		p.checkStringLength(str1);
		//concat of String
		p.concatString(str1,str2);
		//charAt of String
		p.charAtString(str1,2);
		//contains of String
		p.containsString(str1, str2);
		//split of String
		p.splitString(str);
		//index of String
		p.indexOfString(str2,'h');
		//replace of String
		p.replaceString("YashLechnologies",'L','T');
		//subString of String
		p.subString(str, 5, 7);
	}

	public String subString(String str, int begin, int end) {
		return str.substring(begin, end);
		
	}
	
	public int checkStringLength(String string) {
		return string.length();
	}

	public String concatString(String str1, String str2) {
		return str1.concat(str2);
	}
	
	public char charAtString(String str1, int index) {
		return str1.charAt(index);
	}
	
	public boolean containsString(String str1,String str2) {
		return str1.contains(str2);
	}
	
	public String[] splitString(String str) {
		 String[] split = str.split("xyz");
         
	        for (String obj: split) {
	            System.out.println(obj);
	        }
	         
	        return split;
	}
	
	public int indexOfString(String str,char c) {
		return str.indexOf(c);
	}
	
	public String replaceString(String str,char ch1, char ch2) {
		return str.replace(ch1, ch2);
	}
	
	
	
}
