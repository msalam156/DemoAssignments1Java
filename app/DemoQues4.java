package com.nissan.app;

import java.util.Scanner;

public class DemoQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			try {
				System.out.println("Enter the distance between two cities in Km");
				double distanceInKm = input.nextDouble();
				System.out.println(" Distance between two cities in Meter :"+distanceInKm * 1000);
				System.out.println(" Distance between two cities in Centimeter :"+distanceInKm * 100000);
				System.out.println(" Distance between two cities in Foot:"+distanceInKm * 1000 * 3.28084);
				System.out.println(" Distance between two cities in Meter :"+distanceInKm * 1000 * 3.28084*12);
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
