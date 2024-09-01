package com.upskill.java_2;

/*
 	9. Write a program to swap two string variables (Talen, Tech) and display 
 	result on the screen.
*/
public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringOne = "Talen";
		String stringTwo = "Tech";
		
		System.out.println("Before swap: " + stringOne + stringTwo);
		
		String stringThree = stringOne;
		stringOne = stringTwo;
		stringTwo = stringThree;
		
		System.out.println("After swap: " + stringOne + stringTwo);
		
	}

}
