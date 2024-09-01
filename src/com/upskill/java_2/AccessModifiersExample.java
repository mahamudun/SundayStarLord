package com.upskill.java_2;

public class AccessModifiersExample {

/*	// Class with different access modifiers
	public class AccessModifiersExample {

	    // Public variable
	    public String publicVar = "I am public";

	    // Protected variable
	    protected String protectedVar = "I am protected";

	    // Default (Package-Private) variable
	    String defaultVar = "I am default (package-private)";

	    // Private variable
	    private String privateVar = "I am private";

	    // Public method
	    public void publicMethod() {
	        System.out.println("Public method");
	    }

	    // Protected method
	    protected void protectedMethod() {
	        System.out.println("Protected method");
	    }

	    // Default (Package-Private) method
	    void defaultMethod() {
	        System.out.println("Default (package-private) method");
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("Private method");
	    }

	    // Method to demonstrate access within the same class
	    public void accessWithinClass() {
	        System.out.println(publicVar); // Accessible
	        System.out.println(protectedVar); // Accessible
	        System.out.println(defaultVar); // Accessible
	        System.out.println(privateVar); // Accessible

	        publicMethod(); // Accessible
	        protectedMethod(); // Accessible
	        defaultMethod(); // Accessible
	        privateMethod(); // Accessible
	    }
	}

	// Class in the same package
	class SamePackageClass {
	    public void accessInSamePackage() {
	        AccessModifiersExample example = new AccessModifiersExample();
	        System.out.println(example.publicVar); // Accessible
	        System.out.println(example.protectedVar); // Accessible
	        System.out.println(example.defaultVar); // Accessible
	        // System.out.println(example.privateVar); // Not accessible

	        example.publicMethod(); // Accessible
	        example.protectedMethod(); // Accessible
	        example.defaultMethod(); // Accessible
	        // example.privateMethod(); // Not accessible
	    }
	}

	// Subclass in the same package
	class SubclassInSamePackage extends AccessModifiersExample {
	    public void accessInSubclass() {
	        System.out.println(publicVar); // Accessible
	        System.out.println(protectedVar); // Accessible
	        System.out.println(defaultVar); // Accessible
	        // System.out.println(privateVar); // Not accessible

	        publicMethod(); // Accessible
	        protectedMethod(); // Accessible
	        defaultMethod(); // Accessible
	        // privateMethod(); // Not accessible
	    }
	}

	// Subclass in a different package
	package differentPackage;

	import AccessModifiersExample;

	public class SubclassInDifferentPackage extends AccessModifiersExample {
	    public void accessInDifferentPackageSubclass() {
	        System.out.println(publicVar); // Accessible
	        System.out.println(protectedVar); // Accessible
	        // System.out.println(defaultVar); // Not accessible
	        // System.out.println(privateVar); // Not accessible

	        publicMethod(); // Accessible
	        protectedMethod(); // Accessible
	        // defaultMethod(); // Not accessible
	        // privateMethod(); // Not accessible
	    }
	}

	// Class in a different package
	package differentPackage;

	import AccessModifiersExample;

	public class DifferentPackageClass {
	    public void accessInDifferentPackage() {
	        AccessModifiersExample example = new AccessModifiersExample();
	        System.out.println(example.publicVar); // Accessible
	        // System.out.println(example.protectedVar); // Not accessible
	        // System.out.println(example.defaultVar); // Not accessible
	        // System.out.println(example.privateVar); // Not accessible

	        example.publicMethod(); // Accessible
	        // example.protectedMethod(); // Not accessible
	        // example.defaultMethod(); // Not accessible
	        // example.privateMethod(); // Not accessible
	    }
*/
}
