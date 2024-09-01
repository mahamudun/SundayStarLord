package com.upskill.java_1;

/*  A function returns 30, another function returns 50.
 	Write a java program which will display subtraction value from 
	bigger number to smaller.
*/
public class SubtractionValue {

	public static void main(String[] args) {
		
		int value1 = valueOne();
		int value2 = valueTwo();

		int bigger = Math.max(value1, value2);
		int smaller = Math.min(value1, value2);

		int result = bigger - smaller;
		System.out.println("Result: " + result);

	}

	public static int valueOne() {
		return 30;
	}

	public static int valueTwo() {
		return 50;
	}

}
