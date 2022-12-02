package com.nissan.javaDay3;

import java.util.Scanner;

public class CommonPrefix {
		public static void main(String [] arg) {
			// invoking a method to find largest common prefix between two string
			findLargeCommonPrefix();
		}
		private static void findLargeCommonPrefix() {
			// create Scanner class object for taking input from user
			Scanner input = new Scanner(System.in);
			
			// create a variable for storing prefix string
			String preString = "";
			
			//taking two string from user
			System.out.println("Enter First String");
			String firstString  = input.nextLine();
			System.out.println("Enter Second String");
			String scndString = input.nextLine();
			
			// creating the pointer for pointing character in String
			
			int pointer1 = 0;
			int pointer2 = 0;
			
			// accessing both String and comparing
			while((pointer1 <  firstString.length()) && (pointer2 < scndString.length())) {
				
				// taking first character in both String
				char firstChar  = firstString.charAt(pointer1);
				char scndChar = scndString.charAt(pointer2);
				
				// check both character is it equal or not
				if(firstChar == scndChar) {
					// store char to Final String
					preString += firstChar;
					
					// increment the both Pointer
					pointer1 ++;
					pointer2 ++;
				}
				else {
					System.out.println("Largest Common pre String is :"+preString);
					break;
				//return;
				}
			}
		}
}
