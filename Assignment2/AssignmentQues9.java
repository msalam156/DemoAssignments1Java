/**Accept a real constant value from user
 *  and typecast this value into integer and print the result.*/
package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmentQues9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			typeCastNumber();
	}
	private static void typeCastNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point value to converting into integer");
		try {
			double pointValue = input.nextDouble();
			int intValue = (int)pointValue;
			System.out.println(intValue);
		}
		catch(Exception e) {
			System.out.println("please enter valid Value" + e);
		}
	}

}
