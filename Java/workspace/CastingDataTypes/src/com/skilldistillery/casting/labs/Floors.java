package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Floors {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// In mathematics, the floor function returns the largest integer less than or
		// equal to a given number. For example:
		//
		// floor(25.95) yields 25
		//
		// floor(-25.95) yields -26
		//
		// Create a program that prompts the user for a floating point number and reads
		// it into a variable of type double. Use the cast operator to convert the
		// number to the largest integer less than or equal to the number. Print out the
		// results. (Hint: negative numbers will require more than just casting. Be sure
		// to check your solution for decimals and whole numbers.)
		//
		// (Solution: Floor.java)

		System.out.println("Enter a floating point number to be converted");
		double input = scanner.nextDouble();

		System.out.println("Floor = " + floor(input));
	}

	private static int floor(double input) {
		int floor;
		if (input >= 0) {
			floor = (int) input;
		}
		else {
			if (input % 1 != 0) {
				floor = (int) input - 1;
			}
			else {
				floor = (int) input;
			}
		}
		return floor;
	}

}
