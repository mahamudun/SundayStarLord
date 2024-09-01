package com.upskill.java_2;

// Write a Java program to convert temperature from Fahrenheit to Celsius degree. 

public class FarenheightToCelcius {

	public static void main(String[] args) {
		
		double farenheight = 92;
		
		double celcius = (farenheight - 32) * 5 / 9;

		System.out.println(celcius + " Degree Celcius.");
	}

}
