package com.upskill.java_5;

//import java.util.Scanner;

/*	Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    For numbers which are multiples of both three and five return 'FizzBuzz'.
 	For numbers that are neither, return the input number.
*/
public class FizBazz {

	public static String fizzBuzz(int number) {

		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";

		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";

		} else {
			return number + " is not divisable by 3 or 5.";

		}
	}

	public static void main(String[] args) {

		int number = 20;

		String result = fizzBuzz(number);
		System.out.println(result);
		
		/* Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		String result = fizzBuzz(number);
		System.out.println(result);
		
		scanner.close();
		*/
	}

}
