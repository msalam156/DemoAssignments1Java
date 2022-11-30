package com.nissan.app;

import java.util.Scanner;

public class DemoQues7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the Basic Salary: ");
			double salary = input.nextDouble();
			
			System.out.println("Enter the dearness allowance in Percentage: ");
			int dearnesAllowance = input.nextInt();
			
			System.out.println("Enter the rent allowance in Percentage: ");
			int rentAllowance = input.nextInt();
			int totalAllowance = dearnesAllowance+rentAllowance;
			System.out.println("Total allowance is : "+((salary)*(totalAllowance))/100);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
