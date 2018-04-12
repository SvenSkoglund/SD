package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListExample ex = new ArrayListExample();
		ex.run();
	}

	private void run() {
		// Declare and instantiate an ArrayList to hold Strings.
		// Use the type argument <String> in the constructor.
		
		ArrayList<String> stringArrayList = new ArrayList<String>();
		// Declare and instantiate an ArrayList to hold Double objects.
		// This time use the <> shortcut in the constructor.
		
		ArrayList<Double> doubleArrayList = new ArrayList<>();
		// Try to declare an ArrayList to hold double primitives
		// (not Double objects). What happens?
		// ArrayList<Double> doubleArrayList = new
		// ArrayList<>();
		// Now try declaring an ArrayList without type
		// arguments.
		
		ArrayList newAL = new ArrayList();

		// What is the warning Eclipse gives you?

		// What combinations of <> and <String> can you put on either side of the =, and
		// still have the code compile?
		ArrayList<String> stringArrayList2 = new ArrayList<>();

	}

}
