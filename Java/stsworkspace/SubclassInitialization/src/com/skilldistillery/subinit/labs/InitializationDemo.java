package com.skilldistillery.subinit.labs;

public class InitializationDemo {

	public static void main(String[] args) {
		// // Finally, create a class InitializationDemo with a main that prints "Start"
		// and "End", and in between constructs a SuperClass object. Run it to observe
		// the order of initialization.

		// Modify InitializationDemo's main. Instead of constructing a SuperClass
		// object, construct only a SubClass object. When you run it, which happens
		// first: the subclass constructor, the subclass instance field initialization,
		// or the superclass constructor?
		
//		In InitializationDemo, after the SubClass object is instantiated, use their getters to print the resulting values of its own and its superclass's static and instance fields.

		System.out.println("Start");
		SubClass sc = new SubClass();
		System.out.println(sc.getSuperInstance());
		System.out.println(sc.getSuperStatic());
		
		System.out.println("End");
	}

}
