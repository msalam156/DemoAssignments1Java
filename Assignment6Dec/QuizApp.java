package com.nissan.Assignment6Dec;

import java.util.Scanner;

public class QuizApp {
	public static int score = 0;
	public static Scanner input = new Scanner(System.in);
	public static void main(String [] args) {
		// start Quiz
		System.out.println("Enter You name" );
		String name = input.nextLine();
		startQuiz();
		showResul(name);
	}
	public static void startQuiz() {
		System.out.println("Quize Starting : ");
		checkAnswer();
	}
	public static void checkAnswer() {
		
		// initialize the states and their capitals
		String [] states = {"Uttar Pradesh","Uttrakhand"};//,"Kerala","Goa","Karnatka"};
		String[] capitals = {"lucknow","Dehradoon"};//,"Trivendrum","Panji","Bengluru"};
		
		do {
			// take input form user
			for(int i = 0; i < states.length; i ++) {
				System.out.println("What is the capital of : "+ states[i]);
				String answer = input.nextLine();
				// check for correct ans not worry about casing
				if((answer.toLowerCase()).equals(capitals[i].toLowerCase())) {
					score ++;
				} 
			}
			// ask user to continue or not
			System.out.println("if You want to continue press 1 or Press to 2 exit");
			int check = input.nextInt();
			if(check == 2 ) break;
		}while(true);
		
	}
	public static void showResul(String name) {
		// showing following result
		System.out.println("+++++++++++++++Report Card++++++++++++++++++++++++++++");
		System.out.println("Name : "+ name);
		if(score == 5) System.out.println("Extra briliant");
		else if(score == 0) System.out.println("Try Again");
		else System.out.println("Good Efforts");
		System.out.println("Your Score is : "+ score);
	}
}
