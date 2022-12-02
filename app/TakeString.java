package com.nissan.app;

import java.util.Scanner;

import com.nissan.lib.SumDigit;

public class TakeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAns();
	}
	private static void getAns() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the mix String");
		String str = input.nextLine();
		SumDigit obj = new SumDigit();
		int getFromSumDigit = obj.calculateSum(str);
		System.out.println(getFromSumDigit);
	}

}
