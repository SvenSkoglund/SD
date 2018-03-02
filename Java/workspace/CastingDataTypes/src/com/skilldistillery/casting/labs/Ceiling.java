package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Ceiling {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// // In mathematics, the ceiling function returns the smallest integer greater
		// than or equal to a number. For example:
		//
		// ceiling(25.95) yields 26
		//
		// ceiling(-25.95) yields -25
		//
		// Write a program similar to (1) to print out the ceiling for any floating
		// point number given by the user.
		//
		// (Solution: Ceiling.java)

		System.out.println("Enter a floating point number to be converted");
		double input = scanner.nextDouble();

		System.out.println("Ceiling = " + ceiling(input));
	}

	private static int ceiling(double input) {
		int ceiling;
		if (input >= 0) {
			if (input % 1 != 0) {
				ceiling = (int) input + 1;
			}
			else {
				ceiling = (int) input;
			}
		}
		else {
			ceiling = (int) input;
		}
		return ceiling;

	}

}
