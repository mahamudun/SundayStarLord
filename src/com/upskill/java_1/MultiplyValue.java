package com.upskill.java_1;

/* A function which returns the multiply value of a and b where a = 9 and b = 11.      
	Write a program which will display addition of a + b + function returns value.*/

public class MultiplyValue {

	public static void main(String[] args) {

		int a = 9;
		int b = 11;
		
		int c = multiply(a,b);
		
		int addition = a + b + c;
	
		System.out.println("Result: " + addition);
	}

	public static int multiply(int a, int b) {
		return a * b;

	}

}
