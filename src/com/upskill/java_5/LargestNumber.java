package com.upskill.java_5;

import java.util.List;

public class LargestNumber {

	public static int findLargest(List<Integer> numbers) {
		int largest = numbers.get(0);
		
		for (int i = 1; i<numbers.size(); i++) {
			if (numbers.get(i) > largest) {
				largest = numbers.get(i);
			}
		}
		
		return largest;
		
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,0);
		System.out.println("The Largest number is: " + findLargest(numbers) );
	}

}
