package com.upskill.java_4;

import java.util.ArrayList;

// Write a method which return count of duplicate value from a array?

public class CountDuplicateArray {
	
	public static int countDuplicate (int [] array) {
		
		ArrayList <Integer> checkedValues = new ArrayList<>();
		
		int duplicateCount = 0;
		
		for (int i = 0; i <array.length; i++) {
			if(!checkedValues.contains(array[i])) {
				checkedValues.add(array[i]);
				for (int j = i + 1; j <array.length; j++) {
					if (array[i] == array[j]) {
						duplicateCount++;
						break;
					}
				}
			}
		}
		
		return duplicateCount;
	}
	
	public static void main (String[]args) {
		
		int array [] = { 1,2,3,4,5,3,6,7,3,8,9,1 };
		int duplicates = countDuplicate(array);
		
		System.out.println("Number of duplicates: " + duplicates);
		}

}
