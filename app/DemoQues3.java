package com.nissan.app;

import java.util.Scanner;

public class DemoQues3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			try {
				   System.out.println("Enter the First Number");
					int firstNumber = input.nextInt();
					 System.out.println("Enter the Second Number");
					int secondNumber = input.nextInt();
					System.out.println("The quetient is : "+ firstNumber / secondNumber);
					System.out.println("The Remainder is: "+firstNumber % secondNumber );
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
