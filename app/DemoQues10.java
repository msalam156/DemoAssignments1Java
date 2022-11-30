package com.nissan.app;

import java.util.Scanner;

public class DemoQues10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the Number: ");
			int number = input.nextInt();
			reverseDigit(number);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void reverseDigit(int num) {
			int reverseNum = 0;
			while(num > 0) {
				int lastDigit = num % 10;
				reverseNum = lastDigit + reverseNum* 10;
				num = num / 10;
			}
			System.out.println("Reverse digit is : "+reverseNum);
	}

}
