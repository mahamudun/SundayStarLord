package com.upskill.java_2;

//6.  Write a java program to find the prime number from 1 to 100 and print them.

public class FindPrimeNUmber {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			boolean primeNumber = true;

			if (i < 2) {
				primeNumber = false;
			}

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {

					primeNumber = false;

				}

			}
			if (primeNumber) {
				System.out.println(i);
			}

		}

	}
}
