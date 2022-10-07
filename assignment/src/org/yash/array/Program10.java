package org.yash.array;

/**
 * 
 * @author tanay.ojha 
 * 		   You are having array of strings. Now you have to arrange
 *         strings in array on the basis of the length of each string. Smallest
 *         string will be first and so on.
 */
public class Program10 {
	public static void main(String[] args) {
		String temp;
		String []arr = {"YashTechnologies","Wipro","IBM","Infosys","TCS","Accenture","Cognizant","TechMahindra"};
		
		for (int i = 0; i < arr.length; i++) {
			String str1 = arr[i];
			int length1 = str1.length();
			
			for (int j = i+1; j < arr.length; j++) {
				String str2 = arr[j];
				int length2 = str2.length();
				
				if(length1 > length2) {
					temp = arr[j];
					arr[i] = arr[j];
					//arr[j] = temp;
					temp = arr[i];
				}
		
			}
			System.out.println("I "+arr[i]);
		}
	}
}
