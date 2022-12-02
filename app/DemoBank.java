package com.nissan.app;

import java.util.Scanner;

import com.nissan.app.util.CustomerUtil;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankOperation();
	}
	private static void bankOperation() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Your  name");
			
			// take Name from user
			String name = input.nextLine();
			String getName = CustomerUtil.setValidCustomerName(name);
			
			// ask to user for Account number
			System.out.println("Enter your Account Number");
			String AcNum = input.nextLine();
			String AcNumber = CustomerUtil.validateCustomerAccount(AcNum);
			
			// show result according to input
			System.out.println("*************** Details*******************");
			System.out.println("-------------->:"+AcNumber+":<----------------");
			System.out.println("Hi "+ getName);
			
	}

}
