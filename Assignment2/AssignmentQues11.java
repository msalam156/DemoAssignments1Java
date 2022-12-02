/**
 
 */
package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmentQues11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// storing data either from file or database
		//dummy data
		int trianId = 101;
		int pnrNu = 97979;
		int inputPnr  = 0;
		String trainName = "jan Shatabdi";
		String passNmae = "Sumitra Bhonti";
		
		// Application is executing 
		try {
			 	System.out.println("Enter PNR no : ");
			 	inputPnr =Integer.parseInt( input.nextLine()); // one way
			 	
			 	// check condition
			 	if(inputPnr  == pnrNu) 
			 		System.out.println("Seat confirmed");
			 	else
			 		System.out.println("Seat not confirmed");
			 	input.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
