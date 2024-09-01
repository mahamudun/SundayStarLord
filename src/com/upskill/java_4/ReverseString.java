package com.upskill.java_4;

/* Write a method which will reverse a string. */
public class ReverseString {

	public static String reverseString(String input) {

		StringBuilder reversedString = new StringBuilder();

		reversedString.reverse();
		
		return reversedString.toString();

	}

	public static void main(String[] args) {

		String originalString = "Hello,World!";

		String reversed = reverseString(originalString);

		System.out.println("Original String: " + originalString);
		System.out.println("Reversed  String: " + reversed);

	}

}


/*
 public class StringUtil {
    // Method to reverse a string using simple Java loops
    public static String reverseString(String input) {
        // Initialize an empty string to hold the reversed string
        String reversed = "";
        // Iterate over the input string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            // Add each character to the reversed string
            reversed += input.charAt(i);
        }
        // Return the reversed string
        return reversed;
    }

    // Main method to test the reverseString method
    public static void main(String[] args) {
        // Example string
        String originalString = "Hello, World!";
        // Reverse the string
        String reversed = reverseString(originalString);
        // Print the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversed);
    }
}

 */