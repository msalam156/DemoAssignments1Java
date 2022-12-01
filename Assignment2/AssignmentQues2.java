package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmentQues2{

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actualPin = 1254;
		checkAuthentication(actualPin);
	}
	private static void checkAuthentication(int actualPin) {
		System.out.print("Please enter PIN :");
		int inputPin = input.nextInt();
		try {
			if(actualPin  == inputPin) System.out.println("You are welcome.. ");
			else System.out.println("Please enter valid Pin not :" + inputPin);
		} 
		catch(Exception e) {
			System.out.println("Please enter valid Numbe: "+ e);
		}
	}

}
