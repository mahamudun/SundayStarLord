package com.upskill.java_1;
/*
  A triangle three arms are: 5, 7 and 11 inches. Write a method to display 
  the perimeter of triangle in console output.
*/
public class PerimeterOfTriangle {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		int c = 11;
		
		displayPerimeter(a,b,c);
	}		
		public static void displayPerimeter (int a, int b, int c) {
			
			int perimeter = a+b+c;
			
			System.out.println(perimeter + " Inches Perimeter.");
		}

	

}
