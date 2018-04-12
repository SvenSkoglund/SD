package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class NameChangerProgram {
	static Scanner scanner = new Scanner(System.in);
	static NameChanger nc = new NameChanger();

	public static void main(String[] args) {
		// Write a program to prompt a user for their first name. You will be
		// calculating a numeric value for the first name, and changing the characters
		// in the name.
		//
		// The program will have two classes: NameChangeProgram, and NameChanger.
		//
		// NameChangeProgram is the program you can run. It prompts the user for a name.
		// It uses an instance of NameChanger to do data conversion. It then outputs the
		// converted data (numeric value for the name, and the changed name) to the
		// screen.
		//
		//
		//
		// This also requires the name's char[]. The trick will be returning a String
		// from the method. (You learned a trick for casting to a String in this
		// chapter.)
		// Optional: Also prompt the user for how many characters to shift. Overload the
		// transformString method to take this amount as a parameter.
		System.out.println("Please enter your name");
		String name = scanner.next();
		
		nc.calculateNumericValue(name);
		nc.transformString(name);

	}

}
