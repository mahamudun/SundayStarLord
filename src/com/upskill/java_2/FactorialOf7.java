package com.upskill.java_2;

//TODO 8. Write Java Program to display Factorial of Number 7.

public class FactorialOf7 {

	public static void main(String[] args) {

		int num = 7;
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			factorial *= i;

		}
		System.out.println(factorial);
	}

}
/* 
  	The factorial of a number is the multiplication of all the numbers between 
	1 and the number itself. 7!	= 1 × 2 × 3 × 4 × 5 × 6 × 7 = 5040
	factorial is the number of different permutations you can have. 
	It helps a word or number writing different way or how many
	different way you can write the word.
	
*/