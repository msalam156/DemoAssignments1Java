/**
 e. Create a menu driven program using do-while and switch-case which implements a help system for Java’s selection and iteration statements. You have to display the syntax of selected control statement.
Help on:

1. if

2. switch

3. while

4. do-while

5. for

Choose one:

4

The do-while:

do {

statement;

 } while (condition); 
 */

package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmentQues5 {
	public static void main(String[] arg) {
		// invoking chooseOption Method
		chooseOption();
	}
	private static void chooseOption() {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		// create while loop for repeating the input output
		while(flag) {	
			System.out.println("choose one the the following in which you want help + _ +");
			System.out.println("1. Help for If");
			System.out.println("2. Help for Switch");
			System.out.println("3. Help for while");
			System.out.println("4. Help for do while");
			System.out.println("5. Help for forLoop");
			System.out.println("10.  for Exit");
			//	// use try catch block for none numeric values
			
			try {
				int option = input.nextInt();
				// invoking ifStatemntHelp
				if(option == 1) ifStatemntHelp();
				// invoking switchStatementHelp
				else if(option == 2) switchStatementHelp();
				// invoking WhileLoopHelp
				else if(option == 3)  WhileLoopHelp();
				// invoking doWhileLoopHelp
				else if(option == 4) doWhileLoopHelp();
				// invoking forLoopHelp
				else if(option == 5) forLoopHelp();
				else if(option == 10) flag = false;
			}
			catch(Exception e) {
				System.out.println("Please enter valid Number"+e);
				flag = false;
			}
		}	
	}
	// create Method  ifStatemntHelp for if
	private static void ifStatemntHelp() {
		       System.out.println("if(condition is true) {");
		       System.out.println("\t //statement");
		       System.out.println("} else {");
		       System.out.println("\t //statement;");
		       System.out.println("}");
		       System.out.println();
	}
	// create Method  switchStatementHelp for switch
	static void switchStatementHelp() {
		System.out.println("switch(key) {");
		System.out.println("\t case1:");
		System.out.println("\t \t //statements");
		System.out.println("\t \t break;");
        System.out.println("\t default:");
        System.out.println("\t \t //statement");
        System.out.println("\t \t break;");
        System.out.println("}");
	}
	// create Method  WhileLoopHelp for while loop
	private static void WhileLoopHelp() {
		System.out.println("while(condition = true) {");
		System.out.println("\t //statement");
		System.out.println("}");
	}
	// create Method  switchStatementHelp for switch
		private static void doWhileLoopHelp() {
			System.out.println("do {");
			System.out.println("\t //statement");
			System.out.println("} while(condition = true)");
			}
		// create Method  forLoopHelp for for loop
	 static void forLoopHelp() {
		 System.out.println("for(initialization; condition; increment/decrement) {");
		 System.out.println("\t //statement");
		 System.out.println("}");
	 }
}
