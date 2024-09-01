package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array stores multiple data using index.
		
		/* Arrays are used to store multiple values in a single variable, 
		   instead of declaring separate variables for each value. */
	
		//safaint age = 30;
		
		int[] ageStarLord = new int[] { 25, 30, 28, 32, 35, 27 };	

		System.out.println("Student Age: " + ageStarLord [3] );
		System.out.println("Total Student: " + ageStarLord.length );
		
		String [] name = new String [] {"Mahamud", "Nabi", "Sikder"};
		System.out.println("Student Name: " + name [2] ); //Printing single String
		
		//System.out.print ("All Students: ");
	/*	for (int i = 0; i <name.length; i++) {  // Printing all the Array
		
			System.out.println (name[i] + ", ");
		}	
		*/
			//Multi Dimentional Array
									
			int [][] ageStarLord2D = {{25, 30, 28, 35, 27},  //This Line [0], first index is [0][0]
								
									  {26, 29, 30, 34}};  	// This Line [1], first index is [1][0]
			
			System.out.println ("Students age 2D: " + ageStarLord2D [1][1]);
			
			String [][] studentNames = {{"Mahamud", "Nabi", "Sikder"}, 
										{"Alex", "Phill", "Michael"}};
			System.out.println ("Students Name 2D: " + studentNames [0][2]);
					
			// Hashmap store multiple data using key value pair, Implementation of map interface,
			// one null key and multiple null key and null value allowed
			
			HashMap <String, Integer> Student = new HashMap<String, Integer>();
			
			Student.put("Ahsan", 26);
			Student.put("Arovi", 21);
			Student.put("Elena", 25);
			
			System.out.println("HashMap Student AGE: " + Student.get("Arovi"));
			
			
			//String String Hashmap, Country, Capital
			
			HashMap <String, String> StudentCity = new HashMap<String, String>();
		
			StudentCity.put("Bangladesh", "Dhaka");
			StudentCity.put("USA", "New York");
			StudentCity.put("England", "London");
			StudentCity.put("Australia", "Sydney");
			
			System.out.println("Student City: " + StudentCity.get("USA"));
			System.out.println("Student City: " + StudentCity.get("Bangladesh"));
			System.out.println("Student City: " + StudentCity.get("England"));
			System.out.println("Student City: " + StudentCity.get("Australia"));
			
			//Hashtable store multiple data using key-value pair, No duplicate, 
			//No null value, also synchronized (only one thread can be modified)
			
			Hashtable<String, String> Region = new Hashtable<String, String>();
			
			Region.put("BD", "South Asia");
			Region.put("USA", "America");
			
			System.out.println("Region : " + Region.get("BD"));
			
			// HashSet store unordered collection containing unique value, 
			// Implementation of set interface.
			
			HashSet<String> car = new HashSet<String>();
			
			car.add("BMW");
			car.add("Toyota");
			car.add("Audi");
			car.add("Ford");
			System.out.println("Car : " + car);
	}

}
