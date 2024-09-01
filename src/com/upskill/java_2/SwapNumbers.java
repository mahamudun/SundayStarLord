package com.upskill.java_2;

/* 7.  You are given two integer number (a=25, b=30), write a program to swap them and 
display result on the screen.    
*/

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 25;
		int b = 30;

		System.out.println("Before Swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b + "\n");

		int c = a;

		a = b;
		b = c;

		System.out.println("After Swap:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);

	}

}
