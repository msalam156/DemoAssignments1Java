package com.nissan.app;

import java.util.Scanner;

public class DemoQues6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the First Number: ");
			int firstNumber = input.nextInt();
			
			System.out.println("Enter the Second Number: ");
			int secondNumber = input.nextInt();
			
			System.out.println(" First Number befor swap: "+ firstNumber);
			System.out.println(" Second Number befor swap: "+ secondNumber);
			
			//swaping
			int temp               = firstNumber;
			firstNumber        = secondNumber;
			secondNumber  = temp;
			System.out.println(" First Number after swap: "+ firstNumber);
			System.out.println(" Second Number after swap: "+ secondNumber);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
