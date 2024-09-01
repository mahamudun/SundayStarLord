package com.upskill.java_2;

/* 3. Write two java functions which will return two different integer values, write a 
program to compare those numbers and send message that one number is bigger 
than other. (hints: using if..else)
*/

public class CompareTwoNumber {
	
	public static void main(String[] args) {
		
		int numOne = firstNumber();		
		int numTwo = secondNumber();
		
		if (numOne > numTwo) {
			System.out.println ( numOne + " is greter than " + numTwo );
		}
		else if (numTwo > numOne) {
			System.out.println ( numTwo + " is greater than " + numOne );
		}
		else { 
			System.out.print ( "Both are same numbers" );
		}
	}
		
		protected static int firstNumber() {
			return 50;
			
		}
		
		protected static int secondNumber() {
			return 500;
			
		}

}
