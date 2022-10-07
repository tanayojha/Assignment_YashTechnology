package org.yash.exception.assignment;

public class IndexText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Created an array of size 10
			String[] strArray = new String[10];
			//adding value to indexes
			strArray[0] = "zero";
			strArray[1] = "one";
			strArray[2] = "two";
			strArray[3] = "three";
			strArray[4] = "four";
			strArray[5] = "five";
			strArray[6] = "six";
			strArray[7] = "seven";
			strArray[8] = "eight";
			strArray[9] = "nine";
			
            System.out.println(strArray[5] + " " + strArray[4]);
            System.out.println(strArray[8] + " " + strArray[9]);
            System.out.println(strArray[10]);


			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
