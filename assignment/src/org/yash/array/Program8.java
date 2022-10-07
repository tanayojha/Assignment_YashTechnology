/**
 * 
 */
package org.yash.array;

/**
 * @author tanay.ojha
 * 		   You are given a sequence of Character in the form of
 *         Array. Now you have to put all vowels and consonants together in the
 *         array.
 */
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
					 'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		char[] vow = {'a','e','i','o','u'};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				System.out.println("vowel "+arr[i]);
			}
			else {
				System.out.println("Consonants "+arr[i]);
			}
		}
		
	}

}
