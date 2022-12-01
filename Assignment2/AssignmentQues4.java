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

public class AssignmentQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			// create switch for options
			switch(checkMonth) {
			case 1:
			case 2:
			case 12:
				System.out.println(checkMonth+" :This months comes under in Winter Season");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(checkMonth+" :This months comes under in spring season");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(checkMonth+" :This months comes under in summer season");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(checkMonth+" :This months comes under in autumn season");
				break;
			}
		} 
		catch(Exception e) {
			System.out.println("Please enter valid number "+ e);
		}
	}

}
