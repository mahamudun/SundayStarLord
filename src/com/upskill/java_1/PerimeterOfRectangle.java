package com.upskill.java_1;

/*
 2. A rectangle width and length are: 9 and 13 inches. 
Write a method to display the perimeter of rectangle in console output.
*/
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		
		int width = 9;
		int length = 13;
		
		displayPerimeter(width, length);
		
	}

	public static void displayPerimeter(int width, int length) {
		
		int perimeter = 2 * (width + length);
		
		System.out.println("Perimeter : " + perimeter + " Inches ");
	}

}
