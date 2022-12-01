/**
 Create a small application that reads a month in number and print it in words.
 */
package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmentQues10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readMonthInWords();
	}
	private static void readMonthInWords() {
		String [] months = {"January","Faruary","March","April","May","June","July","August","September","October","November","December"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month no: ");
		try {
			int noOfMonth =  input.nextInt();
			System.out.println("The Month is: " +months[noOfMonth - 1]);
		}
		catch(Exception e) {
			System.out.println("Please enter Valid Value"+ e);
		}
	}

}
