package com.nissan.class6Dec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {
	
	// main class for practice 
	public static void main(String [] arg) {
		//System.out.println("z:"+(int)'z'+" Z"+(int)'Z' );
		getInputFromUser();
	}
	
	// create list of customer
	List customers = new ArrayList();
	public static Scanner input = new Scanner(System.in);
	
	// make Method for taking input
	public static void getInputFromUser() {
		do {
			System.out.println("Enter customer name");
			// take input as name from user
			String name = input.nextLine();
			// chek name is it valid or not
			Customer customer = setValidCustomerName(name);
			if(customer != null) {
				
			}
			else {
				System.out.println("Please Enter Valid Name  ");
				//return;
			}
			//Customer customerExist = check
			// ask for continue or not
			System.out.println("If you want to continue Prees Y. \n If you want to exit Press N");
			char btn = input.nextLine().charAt(0);
			boolean flag = true;
			if(btn == 'y' ||  btn == 'Y') continue;
			else if(btn == 'n' || btn == 'N')  break;
		}
		while(true);
	}

	private static Customer setValidCustomerName(String name) {
		// TODO Auto-generated method stub
		for(int i = 0;  i < name.length(); i ++) {
			char letter = name.charAt(i);
			if(!((letter > 64 && letter < 91) || (letter > 96 && letter < 123))) {
				return null;
			}
		}
		return new Customer(name) ;
	}
	
	
}
