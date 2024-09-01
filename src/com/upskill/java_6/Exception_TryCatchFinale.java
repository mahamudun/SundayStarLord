package com.upskill.java_6;

public class Exception_TryCatchFinale {
	/* Java Exceptions - Use "try - catch - finally"
	 * 
	 * Exception handling in Java is a mechanism used to handle runtime errors, 
	 * allowing the normal flow of the program to continue. 
	 * It enables you to manage exceptions, which are unexpected events that 
	 * can disrupt the normal execution of a program.
	 * 
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
			 1. ArithmeticException - error has occurred in an arithmetic operation.
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
			 3. ClassNotFoundException - try to access a class whose definition is not found in case of inheritance, object creation, polymorphism.
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted. parameter missing, 
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object. unable to access the Object or missing
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/
	public static void main(String[] args) {

		// Built-in exception - ArrayIndexOutOfBoundsException

		try {

			int[] ageStarLord = new int[] { 25, 19, 21, 28, 35 };
			System.out.println(ageStarLord[5]);

		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("Array Completed!");

		}

		// Specific Built-in Exception NumberFormatException

		try {

			int num = Integer.parseInt("Test"); //
			System.out.println(num);

		} catch (NumberFormatException e) {
			e.printStackTrace();

			System.out.println("Parsing Completed!");

		}

		try {
			throw new MyException("Test");
		} catch (Exception e) {
			e.printStackTrace();

			System.out.println("User Defined Exception!");
		} finally {

			System.out.println("Test Execution Completed!");
		}
	}

}
