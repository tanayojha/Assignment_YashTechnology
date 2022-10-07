package org.yash.string;
/**
 * 
 * @author tanay.ojha
 * WAP to print the all alphabets of string in ascending and descending order.
 *
 */
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "yash technologies";
		int t=0;
		char temp = 0;
		
		char[] chars = str.toCharArray();
		
		//for Ascending Order
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars.length; j++) {
				if(chars[j] > chars[i]) {
					temp = chars[i];
					chars[i]= chars[j];
					chars[j] = temp;
				}
			}
		}
	
		
		System.out.println("Ascending order:");
		for(int i=0; i < chars.length; i++) {
			System.out.print(""+chars[i]);
		}
		
		System.out.println("\n");


		//for Descending Order
		for(int i=0; i<chars.length; i++) {
			for(int j=0; j<chars.length; j++) {
				if(chars[j] < chars[i]) {
					temp = chars[i];
					chars[i]= chars[j];
					chars[j] = temp;
				}
			}
		}

		System.out.println("Descending order: ");
		for(int i=0; i < chars.length; i++) {
			System.out.print(""+chars[i]);
		}
	}

}
