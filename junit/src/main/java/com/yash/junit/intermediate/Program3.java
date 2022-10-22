package com.yash.junit.intermediate;
/**
 * 
 * @author tanay.ojha
 *
 */
/*
 * Write a TestClass to evaluate the action from given url.
Suppose you provide the following urls one by one.
www.yash.com/index.jsp
www.yash.com/employees/salary.xhtml
www.google.com/searches/searchdata.jsp
 */
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static String evaluationURL(String str) {
		String output = "";
		String[] split = str.split("/");
		for (int i = 0; i < split.length; i++) {
			if(split[i].contains(".jsp")) {
				int indexOf = split[i].indexOf(".jsp");
				return split[i].substring(0,indexOf);
			}

			if(split[i].contains(".xhtml")) {
				int indexOf = split[i].indexOf(".xhtml");
				return split[i].substring(0,indexOf);
			}
			
			if(split[i].contains(".html")) {
				int indexOf = split[i].indexOf(".html");
				return split[i].substring(0,indexOf);
			}
		}

		return null;
	}

}
