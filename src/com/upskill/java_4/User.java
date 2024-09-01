package com.upskill.java_4;
/* Write a user program using encapsulation that contains the 
   username, password, email, first and last names of a user of our application. 
   Display the user information in console output?
 */
public class User {

	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;

	public User(String username, String password, String email, String firstName, String lastName) {

		this.username = username;  //this refers to the instance variable
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	public void setUserName(String username) {
 
		this.username = username;         //this refers to the instance variable
	}

	public void setPassword(String password) {
  
		this.password = password;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}
	
	public void displayUserInfo() {
		
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		
	}
 public static void main (String[] args) {
	 
	 User user = new User("mahamud", "password12345", "mahamud@gmail.com", "Mahamud", "Sikder");
	 
	 user.displayUserInfo();
 }
}
