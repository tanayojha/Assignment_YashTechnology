package org.yash.array;
/**
 * 
 * @author tanay.ojha
 * WAP to find third maximum number from list of numbers
 * 
 */
public class Program1 {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,7,3,4,5};
		
		Program1 pro = new Program1();
		pro.getThirdMaximumNumber(arr,7);
			
		System.out.println("Third Largest no. is: " + arr[arr.length-3] );
	}
	
	private int getThirdMaximumNumber(int[] arr, int arrayLength) {
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j  < arr.length; j ++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
		return arr[arrayLength-3];
	}

}
