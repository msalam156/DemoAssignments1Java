package com.nissan.app;

import java.util.Scanner;

public class DemoQues9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the Number: ");
			int number = input.nextInt();
			calculateSumOfDigit(number);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void calculateSumOfDigit(int num) {
			int sum = 0;
			while(num > 0) {
				int lastDigit = num % 10;
				sum += lastDigit;
				num = num / 10;
			}
			System.out.println("The sum of all digits is : "+sum);
	}

}
