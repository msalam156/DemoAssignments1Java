package com.nissan.lib;

public class SumDigit {
		public int calculateSum(String str) {
			int sumOfDigits = 0;
			for(int i = 0; i < str.length(); i ++) {
				char letter = str.charAt(i);
				if(letter > 47 && letter < 58) {
					sumOfDigits = sumOfDigits + (letter - '0');
				}
			}
		return	sumOfDigits ;
		}
}
