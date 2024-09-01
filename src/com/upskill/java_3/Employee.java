package com.upskill.java_3;

// 2.    Write a java program which will display 5 employee information(name, age, salary and address).

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String address;

	public Employee(String name, int age, double salary, String address) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;

	}

	static int employeeCount = 1;

	public void displayEmployeeInfo() {
		System.out.println("Employee: " + employeeCount);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: $" + salary);
		System.out.println("Address: " + address);
		employeeCount++;
		System.out.println("--------------------------");

	}

	public static void main(String[] args) {

		Employee[] employees = new Employee[5];

		employees[0] = new Employee("Mahamud Sikder", 40, 100000, "123-45 Jeweel Ave, Queens, NY");
		employees[1] = new Employee("Abida Sikder", 8, 50000, "123-45 Jeweel Ave, Queens, NY");
		employees[2] = new Employee("Jerin Akter", 36, 750000, "123-45 Jeweel Ave, Queens, NY");
		employees[3] = new Employee("Mehreen Sikder", 13, 60000, "123-45 Jeweel Ave, Queens, NY");
		employees[4] = new Employee("Ahad Sikder", 36, 50000, "1166 Grand Concourse, Bronx, NY");

		for (Employee employee : employees) {
			employee.displayEmployeeInfo();
		}
	}

}
