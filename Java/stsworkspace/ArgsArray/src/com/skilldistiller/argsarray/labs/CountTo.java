package com.skilldistiller.argsarray.labs;

public class CountTo {

	public static void main(String[] args) {
		// Write a new Java program. In its main check to see if exactly one argument
		// was passed on the command line and if not, exit with an appropriate message.
		//
		// Otherwise, convert the argument to an int using the code
		//
		// int count = Integer.parseInt(args[0]);
		// and then use a for loop to print the numbers from 1 to the given number.

		if (args.length != 1 ) {
			System.out.println("Incorrect number of args!");
			System.exit(0);
		}
		int count = Integer.parseInt(args[0]);
		for (int i = 1 ; i <= count ; i++) {
			System.out.println(i);
		}

	}

}
