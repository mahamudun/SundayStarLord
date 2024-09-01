package com.upskill.java_3;

// 04. Write a java program that explains runtime polymorphism.

public class RuntimePolyExample {

	public void sound() {
		System.out.println("Animal makes a sound");

	}

	public static void main(String[] aargs) {

		RuntimePolyExample myDog = new Dog();
		RuntimePolyExample myCat = new Cat();

		myDog.sound();
		myCat.sound();

	}

}

class Dog extends RuntimePolyExample {

	@Override
	public void sound() {
		System.out.println("Dog barks");

	}
}

class Cat extends RuntimePolyExample {

	@Override
	public void sound() {
		System.out.println("Cat meows");

	}
}