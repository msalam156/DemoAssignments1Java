/**
c. Write a program that uses an if-else-if ladder to determine which season a particular
Month is in.
Months 1, 2 and 12 are come under winter season.
Months 3, 4 and 5 are come under spring season.
Months 6, 7 and 8 are come under summer season.
Months 9, 10 and 11 are come under autumn season.
Accept a number for month from user and print the result accordingly.
 */

package com.nissan.Assignment2;

import java.util.Scanner;

public class AssigmentQues3 {
	public static void main(String[] arg) {
		
		checkSeason();
	}
	private static void checkSeason() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the months between 1 to 12");
		// use try catch block for none numeric values
		try {
			int checkMonth = input.nextInt();
			if(checkMonth > 12) {
				System.out.println("Please enter Number between 1 to 12");
				return;
			}
			// check the options for months
			if(checkMonth == 1 || checkMonth == 2 || checkMonth == 12)
				System.out.println(checkMonth+" :This months comes under in Winter Season");
			else if(checkMonth == 3 || checkMonth == 4 || checkMonth == 5)
				System.out.println(checkMonth+" :This months comes under in spring season");
			else if (checkMonth == 6 || checkMonth == 7 || checkMonth == 8)
				System.out.println(checkMonth+" :This months comes under in summer season");
			else
				System.out.println(checkMonth+" :This months comes under in autumn season");
			
		} 
		catch(Exception e) {
			System.out.println("Please enter valid number "+ e);
		}
	}
}
