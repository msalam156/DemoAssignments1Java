package com.nissan.app;

import java.util.Scanner;

public class DemoQues1java {
		public static void main(String [] arg) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the quantity of Orange");
			try {
				int quantityOfOrange = input.nextInt();
				System.out.println("Enter the total price did you spend");
				int totalPrice = input.nextInt();
				System.out.println("The price of One piece of Orange is : "+ totalPrice / quantityOfOrange);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
}
