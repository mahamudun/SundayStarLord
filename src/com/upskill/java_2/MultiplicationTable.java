package com.upskill.java_2;

public class MultiplicationTable {
	
// 5.  Write a program in Java to display the multiplication table of (eight)8.
	
	public static void main(String[] args) {
		
		int num = 8;
		
		for (int i = 1; i <=10; i++) {
			int multiple = num * i;
			System.out.println(num + "x" + i + "=" + multiple);
		}

	}

}
