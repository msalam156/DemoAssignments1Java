/**
 a. Write a program that collects information of employees in an organization
 . When the user gives the input make sure that employee’s age should be 
 between 18 and 60. If otherwise, throw exception. 
 */

package com.nissan.employee;

import java.util.Scanner;

public class EmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking Method for Collect Information
		collectInformation();
		
	}
	private static void collectInformation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name ");
		// Execution start
		try {
			// collect information  from user
				String name = input.nextLine();
				System.out.println("Enter your Age ");
				int age = input.nextInt();
				
				// check age according to the question
				checkAge(age);		
				
				// show details invoking show details Method
				showDetails(name,age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	// Method for checking Age
	private static void checkAge(int age) {
		try {
			
			// if Age is not satisfy to the question throw new Exception;
				if(age >= 18 && age <= 60) ;
				else throw new Exception("Please enter age between 18 to 60");
		}
		// print exception if occur
		catch(Exception e) {
			System.out.println(e);
		}
	}
	private static void showDetails(String name , int age) {
		System.out.println("*****************  Details *****************");
		System.out.println("Hi : "+ name );
		System.out.println("You are "+age+" Years old");
	}
}
