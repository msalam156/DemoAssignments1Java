package com.nissan.app;

import java.util.Scanner;

public class DemoQues5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("Enter the temperature in Farhenite");
				double Farhanite = input.nextDouble();
				System.out.println(" Celcius is  :"+((Farhanite - 32) * 0.555556));
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
