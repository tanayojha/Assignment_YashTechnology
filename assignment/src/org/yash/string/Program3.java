package org.yash.string;

public class Program3 {
		public static void main(String[] args) {
			String str = "yash technologies";
			String res = "";
			
			for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				res = res + " ";
			}
			else {
				res = res + str.charAt(i);
			}
		}
			
		System.out.println("Result: "+res);	
			
	}

}
