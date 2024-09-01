package com.upskill.java_3;

public class Bank {

	public static void main(String[] args) {

		Bank chase = new Chase();
		Bank city = new City();
		Bank td = new TD();

		System.out.println("Chase Bank Interest Rate: " + chase.getInterestRate() + "%");
		System.out.println("City Bank Interest Rate: " + city.getInterestRate() + "%");
		System.out.println("TD Bank Interest Rate: " + td.getInterestRate() + "%");

	}

	public double getInterestRate() {
		return 0.0;

	}
}

class Chase extends Bank {
	@Override
	public double getInterestRate() {
		return 8.0;
	}

}

class City extends Bank {
	@Override
	public double getInterestRate() {
		return 7.0;
	}

}

class TD extends Bank {
	@Override
	public double getInterestRate() {
		return 9.0;
	}

}
