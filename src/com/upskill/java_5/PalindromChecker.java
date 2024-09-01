package com.upskill.java_5;
/*A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
 	Write a method that detects if a string is a palindrome.
 	Tip: Use word.charAt(i) to get the character at position i.
 */
public class PalindromChecker {
	
	public static boolean isPalindrome  (String word) {
		
		int length = word.length();
		
		for (int i = 0; i< length/2; i++) {
			if (word.charAt(i) != word.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[]args) {
		
		String word = "racecar";
		
		if (isPalindrome (word)) {
			System.out.println(word + " is a palindrome.");
		}else {
			System.out.println(word + " is not a palindrome.");
		}
	}

}
