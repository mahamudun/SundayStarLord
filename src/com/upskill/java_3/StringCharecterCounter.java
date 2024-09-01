package com.upskill.java_3;

/*
     Write a java program which will count the number of vowels, consonants, digits, 
	  tabs and blank spaces from a string “A quick brown fox jumps over the lazy dog”.
 */
public class StringCharecterCounter {

	public static void main(String[] args) {

		String aTOz = "A quick brown fox jumps over the Lazy Dog 12 34 567 		890";
		int vowels = 0, consonants = 0, digits = 0, tabs = 0, space = 0;

		for (int i = 0; i < aTOz.length(); i++) {
			char ch = aTOz.charAt(i);

			if (Character.isDigit(ch)) {
				digits++;
			} else if (ch == ' ') {
				space++;
			} else if (ch == '\t') {
				tabs++;

			} else if (isVowel(ch)) {
				vowels++;
			} else if (Character.isLetter(ch)) {
				consonants++;
			}

		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("Tabs: " + tabs);
		System.out.println("Blank Spaces: " + space);
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

	}

}
