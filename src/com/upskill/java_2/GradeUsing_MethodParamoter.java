package com.upskill.java_2;

/*	2.  A school conducts a 100 mark exam for its student and grades them as follows:
	Grade:
		Grade A: Marks>=90
		Grade B: Marks>=80-89
		Grade C: Marks>=70-79
		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60

 Write a java program to calculate the grade for a student in a method passing 
 parameter for grade to display every grade type, using if..else statement.
*/

public class GradeUsing_MethodParamoter {

	public static void main(String[] args) {
		
		int marks = 90;
		
		grade(marks);
	}	
	
	public static void grade (int marks) {
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("Grade: A");
		
		} else if (marks >= 80 && marks <= 89) {
			System.out.println("Grade: B");
			
		} else if (marks >= 70 && marks <= 79) {
			System.out.println("Grade: C");
			
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("Grade: D");
			
		} else if (marks <60) {
			System.out.println("FAIL");
			
		} else {
			System.out.println("Invalid Number");
			
		}
		
		
		
	}

}
