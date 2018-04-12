package com.skilldistillery.advancedarrays.labs;

import java.util.Scanner;

public class Months2DArray {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Write a program that creates a 12 x 3 two-dimensional array. For each of the
		// twelve months, store the name of the month, an abbreviation for the name, and
		// the number of days (all as Strings).
		// F
		// Print out the abbreviation of the month in which you were born and how many
		// days are in that month.
		// Modify your program to print out the name of each month that has 31 days.

		String[][] months = { { "January", "Jan", "31" }, { "February", "Feb", "28" }, { "March", "Mar", "31" },
				{ "April", "Apr", "30" }, { "May", "May", "31" }, { "June", "Jun", "30" }, { "July", "Jul", "31" },
				{ "August", "Aug", "31" }, { "September", "Sep", "30" }, { "October", "Oct", "31" },
				{ "November", "Nov", "30" }, { "December", "Dec", "31" } };

		monthFinder(months);
		System.out.println("Born in " + months[2][1] + " which has " + months[2][2] + " days");

		for (int i = 0; i < months.length; i++) {
			if (months[i][2].equals("31")) {
				System.out.println(months[i][0]);
			}
		}
	}

	public static void monthFinder(String[][] strArray) {
		while (true) {
			System.out.println("What month were you born in?");
			String month = scanner.nextLine();
			for (int i = 0; i < strArray.length; i++) {
				if (strArray[i][0].equalsIgnoreCase(month)) {
					System.out.println(strArray[i][0] + " " + strArray[i][1] + " " + strArray[i][2]);
					System.exit(0);
				}
			}
			System.out.println("Entry not recognized please try again.");
		}
	}
}
