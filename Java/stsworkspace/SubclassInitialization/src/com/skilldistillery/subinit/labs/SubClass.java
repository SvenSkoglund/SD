package com.skilldistillery.subinit.labs;

public class SubClass extends SuperClass {
	// Create a class named SubClass that extends SuperClass, with static string
	// field staticField and non-static string field instanceField. Use singString
	// to initialize them to "staticField declaration" and "instanceField
	// declaration", respectively, and give them getters and setters.

	// Provide a no-arg constructor that explicitly invokes super(), then prints out
	// "My constructor".

	
	// In SubClass, add an instace initializer block above the instanceField declaration. It should use singString to assign "Above" to instanceField. Also, in its constructor, use singString to assign "Set by my constructor" to instanceField.
	
	{
		instanceField = singString("Above");
	}
	static String staticField = singString("staticField Declaration");
	String instanceField = singString("instanceField Declaration");
	
	public SubClass() {
		super();
		System.out.println("My Constructor");
		instanceField = singString("Set By My Constructor");
	}
}
