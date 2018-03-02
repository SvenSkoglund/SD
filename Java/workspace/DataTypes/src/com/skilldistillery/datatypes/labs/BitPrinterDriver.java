package com.skilldistillery.datatypes.labs;

import java.util.Scanner;

public class BitPrinterDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BitPrinter bp = new BitPrinter();
		// Write a program called BitPrinterDriver that prompts the user for a char,
		// int, or double. The program will use BitPrinter to get the bits for the data,
		// and print them to the screen.
		// Put the program in an infinite loop. Prompt the user to type QUIT to exit the
		// program.
		while (true) {
			System.out.println("Please enter a char, int, or double. Type \"quit\" to quit" );
			String entry = scanner.nextLine();

			if (entry.equals("quit")) {
				System.exit(0);
			}
			
			System.out.println(entry + " as bits equals " + bp.getDataAsBits(entry));
		}
	}
}
