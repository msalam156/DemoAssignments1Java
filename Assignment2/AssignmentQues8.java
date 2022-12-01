package com.nissan.Assignment2;

public class AssignmentQues8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boxx square = new Boxx();
		Boxx rectangle = new Boxx();
		int squareVol = square.getVolume(2,4,4);
		int rectangleVol = rectangle.getVolume(88,43,12);
		System.out.println("area of rectangle: " + rectangleVol);
		System.out.println("area of square: " + squareVol);
	}

}
// creating box class
class Boxx {
	private int width , height, depth;
	public int getVolume(int  width, int height,int  depth ) {
		return width * height * depth;
	}
}
