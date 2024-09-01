package com.upskill.java_1;

public class Encapsulation {

	/*
	 * Encapsulation is the mechanism that binds together code and data to make sure
	 * that "sensitive" data is hidden from users.
	 * 
	 * to make encapsulation, class, variables/attributes should be declared as
	 * private. Usually private class or member accessible from the same class only.
	 * but the encapsulation mechanism make it possible to use it from different
	 * class by get and set method.
	 * 
	 * Encapsulation used to hide the data using setter and getter method
	 */

	private String name = "upskill"; 	// write & read

	private int ssn = 123456789; 		// write only

	private String userName = "mahamud"; // read only

	// Setter method - name 			 - set the data, writing
	public void setName(String value) {
		name = value;
	}

	// Getter method - name 			- get the data, reading
	public String getName() {
		return name;
	}
	
	//Setter Method    					- set the data, write
	public void setSSN (int value) {
		ssn = value;
	}
	
	//Getter method  - username  		- get the data, read
	public String getUsername() {
		return userName;
			
	}
	
    private String address = "12345 Jewel Ave";  // read and write
    private int dob = 20000101;                  // write only
    private int dl = 12345678;                   // read only

    // Setter method for address - set the data, writing
    public void setAddress(String value) {
        address = value;
    }

    // Getter method for address - get the data, reading
    public String getAddress() {
        return address;
    }

    // Setter method for dob - set the data, write
    public void setDob(int value) {
        dob = value;
    }

    // Getter method for dl - get the data, read
    public int getDl() {
        return dl;
    }
    
    
}
