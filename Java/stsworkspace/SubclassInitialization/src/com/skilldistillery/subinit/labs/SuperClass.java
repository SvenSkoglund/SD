package com.skilldistillery.subinit.labs;

public class SuperClass {
	// create a class named superclass, with static field superstatic and non-static
	// (instance) field superinstance, both of type string. use eclipse to create
	// getters and setters for both fields. also add a public, static method that
	// returns a string, named singstring. it should take a string as a parameter,
	// print it, and return it. in their declarations, use singstring to assign the
	// values "superstatic declaration" and "superinstance declaration" to the two
	// fields.
	// provide a no-arg constructor that prints out "superclass()";
	// Finally, create a class InitializationDemo with a main that prints "Start"
	// and "End", and in between constructs a SuperClass object. Run it to observe
	// the order of initialization.

	// In SuperClass, add two static initializer blocks, one at the very top of the
	// class and one at the bottom. Each should use singString to assign a value to
	// superStatic: "Top" and "Bottom", respectively.
	
	static {
		superStatic = singString("Top");
	}

	static String superStatic = singString("superStatic Declaration");
	String superInstance = singString("superInstance Declaration");

	public SuperClass() {
		System.out.println("superclass()");
	}

	public static String singString(String s) {
		System.out.println(s);
		return s;
	}

	public static String getSuperStatic() {
		return superStatic;
	}

	public static void setSuperStatic(String superStatic) {
		SuperClass.superStatic = superStatic;
	}

	public String getSuperInstance() {
		return superInstance;
	}

	public void setSuperInstance(String superInstance) {
		this.superInstance = superInstance;
	}
	static {
		superStatic = singString("Bottom");
	}
}
