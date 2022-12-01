/**
 Create a Box class with three instance variables as width, height, depth. 
 Create a method inside this class which returns the volume. 
 Create two different objects in other class assign values for instance variable 
 and calculate the volume and print it.
 * */

package com.nissan.Assignment2;

public class AssignmentQues7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box square = new Box(2,4,4);
		Box rectangle = new Box(88,43,12);
		int squareVol = square.getVolume();
		int rectangleVol = rectangle.getVolume();
		System.out.println("area of rectangle: " + rectangleVol);
		System.out.println("area of square: " + squareVol);
	}

}
// creating box class
class Box{
	private int width , height, depth;
	
	Box(int width, int height,int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
	public int getVolume() {
		return this.width * this.height * this.depth;
	}
}
