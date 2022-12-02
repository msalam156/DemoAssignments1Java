package com.nissan.app.util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerUtil {
//	
//	public static void main(String[] arg) {
//		//String msg = setValidCustomerName("Mukeet");
//		System.out.println(validateCustomerAccount("3647674545645"));
//	}
	public static String validateCustomerAccount(String acNo) {
		Scanner input = new Scanner(System.in);
		try {
				do {
					 if( !isNum(acNo)) {
						System.out.println("Account must be in Numeric");
						acNo = input.nextLine();
					}
					 else if(acNo.length() != 9) {
						System.out.println("Account length must be length in 9");
						acNo = input.nextLine();
					}
					//boolean flag = true;
					else {
						break;
					}	
				}
				while(true);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return acNo;
	}
	private static boolean isNum(String str) {
		for(int i= 0; i < str.length(); i ++) {
			char letter = str.charAt(i);
			if(letter > 47  && letter < 58) continue;
			else return false;
		}
		
		return true;
	}
	public static String setValidCustomerName(String customerName) {
		try {
			
			BufferedReader brRead = new BufferedReader(new InputStreamReader(System.in));
			// creating pattern using regular expression
			Pattern objPat = Pattern.compile("[^A-Za-z ]");
			do {
				// Match
				Matcher matcher = objPat.matcher(customerName);
				boolean finder = matcher.find();
				
				if(finder) {
					System.out.println("Name must contains only Alphabets.Enter Again ");
					customerName = brRead.readLine();
				}
				else if(customerName.length() < 3) {
					System.out.println("Name should contains minimum 3 characters .Enter Again");
					customerName = brRead.readLine();
				}
				else if(customerName.length() > 30) {
					System.out.println("Name should contains Max 30 characters .Enter Again");
					customerName = brRead.readLine();
				}
				else
					break;
			}while(true);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return customerName;
		
	}

}
