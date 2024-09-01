package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {

	/*
	 * Polymorphism is the ability of an object to take on many forms. - Method
	 * Overloading (Compile time Polymorphism/Static binding) Same method name with
	 * different signature to overload - Method Overridding (Runtime
	 * Polymorphism/Dynamic binding) Same method name from Parent class to override
	 */

	
	// Polimorphism is the ability of an object to take on many forms.
	//it is typically applied through method overriding and method overloading. 
	
	//Method overloading allows multiple methods in the same class 
	//to have the same name but different parameters. The correct method is determined at compile time.
	
	//Method overriding occurs through inheritance when a subclass provides a specific 
	//implementation for a method already defined in its superclass. 
	//The method to be called is determined at runtime based on the object type.
	
	
	public static void main(String[] args) {

		car("Blue", 7);
		car2("Acura", "Green", 8);

		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		weeklyIncomeStatic();

	}

	// Method Overriding - Runtime Polymorphism - Dinamic Binding
	// Same method name from parent class to override
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 40000;
		int sideIncome = 40000;
		int secondJob = 120000;
		int newIncome = calculateAnnualIncome + rentalIncome + sideIncome + secondJob;
		System.out.println("My Annual Income is: " + newIncome);
	}

	// Method Overloading - Compile time polimorphism - Static Binding
// Same method name with different signature
	public static void car() {

		System.out.println("My Car is Tesla!");
	}

	public static void car(String color) {

		System.out.println("My Car is " + color);
	}

	public static void car(int seat) {

		System.out.println("My Car is has " + seat + "seat");
	}

	public static void car(boolean ev) {

		System.out.println("My Car is EV: " + ev);
	}

	public static void car(String color, int seat) {

		System.out.println("My Car is: " + color + ", it has " + seat + " seat");
	}

//////////////////////////////////////////////////////

	public static void car2(String color) {

		System.out.println("Color: " + color);
	}

	public static void car2(int seat) {

		System.out.println("Seat: " + seat);
	}

	public static void car2(String color, int seat) {

		System.out.println("Seat: " + seat + ", Color: " + color);
	}

	public static void car2(String brand, String color, int seat) {
		System.out.println("Brand: " + brand + ", Color: " + color + ", Seat: " + seat);
	}
}
