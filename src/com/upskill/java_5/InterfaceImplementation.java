package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
	System.out.println("It has 4 doors");
		
	}
	
	@Override
	public void iDoor(String glass) {
	
		System.out.println("with " + glass);
	}
	
	@Override
	public void iDoor(int doors) {
		System.out.println("It has " + doors + " doors");
	}

	@Override
	public String iEngine() {
		
		return "286hp";
	}

	@Override
	public int iWheel() {
		
		return 4;
	}
		

}
