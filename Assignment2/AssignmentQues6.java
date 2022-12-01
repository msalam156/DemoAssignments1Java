/**
 Create the following output using for loop
*****
***
**
*
 */

package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmentQues6 {

	public static void main(String[] args) {
	
		// invoking printPatter method 
		printPattern();

	}
	private static void printPattern() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the star Limit");
		
		// use try catch block for none numeric values
		try {
			// taking input from user
			int starLimit = input.nextInt();
			// run for loop for printing pattern
			for(int i = starLimit;  i > 0; i --) {
				// invoking printSrar Method
				printStar(i);
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Please enter valid Number"+e);
		}
		
	}
	// create printStar method for printing stars
	private static void printStar(int limit) {
		for(int i = 1; i <= limit; i ++) {
			System.out.print("*");
		}
	}

}
