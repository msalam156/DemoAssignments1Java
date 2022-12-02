/*b. Create an array having 10 elements. Try to print the element in the 11th position. 
 * Catch the appropriate exception.**/

package com.nissan.employee;

public class ArrayExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkException();
	}
	private static void checkException() {
		// initialize the array
		int[] nums = new int[10];
		//execute the program
		try {
				// try to get index 11 element 
			System.out.println(nums[10]);
		}
		catch(Exception e) {
			System.out.println("The Exception is : "+ e);
		}
	}

}
