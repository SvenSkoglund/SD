package com.skilldistillery.characters.labs;

import java.util.Scanner;

public class AlphaNumCheck {

	public static void main(String[] args) {
		// Write a program to prompt the user for a String and check if the String meets
		// certain conditions.
		//
		// Use Scanner.nextLine() to read in a String that may contain spaces.
		// Check if all characters in an input String are letters (upper or lower) and
		// print a messaging saying the result.
		// (Solution: AlphaNumCheck.java)

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check for upper case and lower case");
		String input = scanner.nextLine();

		if (input.equals(input.toLowerCase())) {
			System.out.println("Your input was all lower case");
		}
		else if (input.equals(input.toUpperCase())) {
			System.out.println("Your input was all upper case");
		}
		else {
			System.out.println("Your string was a mixture of upper and lower case");
		}

		char[] inputChars = input.toCharArray();

		for (int i = 0; i < inputChars.length; i++) {
			if (inputChars[i] >= 65 && inputChars[i] <= 90) {
				System.out.println(""+inputChars[i] + " is an uppercase letter");
			}
			else if (inputChars[i] >= 97 && inputChars[i] <= 122) {
				System.out.println("" + inputChars[i]  + " is a lowercase letter ");
			}
			else if (inputChars[i] >= 48 && inputChars[i] <= 57) {
				System.out.println("" + inputChars[i] + " is a number ");
			}
			else if (inputChars[i] == 32) {
				System.out.println("" + inputChars[i] + " is a space ");
			}
			else {
				System.out.println("" + inputChars[i] + " is not a letter, number, or space");
			}
		}
	}
}
