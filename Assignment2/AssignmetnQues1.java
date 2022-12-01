/**
 Consider an electricity billing calculation. There are two types of customers. Domestic and Industry. If it is domestic, the slabs are like this,
The reading in the range,0-100 then amt=units* Rs.1

100-200amt=units*1.5

200-500amt=units*2

>500amt = units*5

If it is industrial, the amt =units*10. 
 */


package com.nissan.Assignment2;

import java.util.Scanner;

public class AssignmetnQues1 {
	public static Scanner  input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateBill();
	}
	private static void generateBill() {
		System.out.println("Please Select Bill Type Press 1 for domestic and press 2 for industiral");
		try {
			int checkBillType = input.nextInt();
			if(checkBillType == 1 || checkBillType == 2) {
				if(checkBillType == 1) getDomesticBill();
				else getIndustrialcBill();
			}else System.out.println("Please press 1 or 2");
		}
		catch(Exception e) {
			System.out.println("please Enter Valid Numbe  :"+ e);
		}
		
		
	}
	private static void getDomesticBill() {
		System.out.println("Enter the Unit you spent");
		try {
				int unit = input.nextInt();
				if(unit > 0 && unit <= 100) System.out.println("Your total Electricity bill Amount is : Rs  "+unit * 1);
				else if(unit > 100 && unit <=200) System.out.println("Your total Electricity bill Amount is : Rs  "+unit * 1.5);
				else if(unit > 200 && unit <= 500) System.out.println("Your total Electricity bill Amount is : Rs  "+unit * 2);
				else System.out.println("Your total Electricity bill Amount is : Rs  "+unit * 5);
		}
		catch(Exception e) {
			System.out.println("Please Enter Valid Unit: "+ e);
		}
	}
	private static void getIndustrialcBill() {
		System.out.println("Enter the Unit you spent");
		try {
				int unit = input.nextInt();
				System.out.println("Your total Electricity bill Amount is : Rs  "+unit * 10);
	}
	catch(Exception e) {
			System.out.println("Please Enter Valid Unit: "+ e);
		}
	}

}
