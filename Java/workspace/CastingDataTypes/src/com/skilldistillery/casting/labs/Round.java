package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Round {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Write a program that reads a floating point number from the user and prints
		// out the number rounded to the nearest int.

		System.out.println("Enter a number to be rounded");
		double entry = scanner.nextDouble();
		System.out.println("Rounded to the nearest int: " +round(entry));

	}

	private static int round(double entry) {
		
		int entryInt = (int) entry;
		
		if (entry - entryInt > (entryInt + 1) - entry) {
			entryInt = entryInt + 1;
			return entryInt;
		}
		else {
			return entryInt;
		}
	}

}
