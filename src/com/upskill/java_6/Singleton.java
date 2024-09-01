package com.upskill.java_6;

public class Singleton {
	//Singleton is a class that can have only one object.
	// Private constructor, it it prevents any other class from instantiating
	private Singleton() {
		
	}
	
	private static Singleton SingletonObj =  new Singleton();
	

}

