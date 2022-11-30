package com.nissan.app;

import java.util.Scanner;

public class DemoQues2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
				System.out.println("Enter Price of Notebook: ");
				int bookPrice = input.nextInt();
				System.out.println("Enter Price of Magic Pot : ");
				int magicPrice = input.nextInt();
				int totalPrice = bookPrice + magicPrice;
				System.out.println("You spend totla money:  "+ totalPrice);
		}catch(Exception e) {
			System.out.println(e);
		}
		}

}
