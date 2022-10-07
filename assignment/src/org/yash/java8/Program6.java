package org.yash.java8;

import java.util.Scanner;

/**
 * 
 * @author tanay.ojha
 * WAP to print the following patterns using lambda expression
			ABCDEFEDCBA
			ABCDE EDCBA
			 ABCD DCBA
			  ABC CBA
			   AB BA
			    A A
 */

@FunctionalInterface
interface DrawPattern{
	void draw(int input);
}

public class Program6 {
	public static void main(String[] args) {
		
		int alphabet = 65;
		 // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");
        int rows = scanner.nextInt();
        
       DrawPattern dp = (input) -> {

           System.out.println("## Printing the pattern ##");
           
           for(int i=0;i<= input;i++)
           {
               for(int j=0;j<=input-i;j++)
               {
                   System.out.print((char)(alphabet+j));
               }
               for(int k=1;k<=i*2-1; k++)
               {
                   System.out.print(" ");
               }
               for(int l=input-i; l>=0; l--)
               {
                   if(l!=input)
                       System.out.print((char)(alphabet+l));
               }
              System.out.println();
           }
        };
        
        dp.draw(rows);
        
   	}
}
