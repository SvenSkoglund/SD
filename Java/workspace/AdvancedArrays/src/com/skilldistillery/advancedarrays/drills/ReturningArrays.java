package com.skilldistillery.advancedarrays.drills;

import java.util.Scanner;

public class ReturningArrays {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		PopStar[] nSync = createBand();
		allSing(nSync);

	}

	public static PopStar[] createBand() {
		// Instantiate an Array to hold PopStar objects
		System.out.println("How many members in the band?");
		int numberOfMembers = scanner.nextInt();
		PopStar[] band = new PopStar[numberOfMembers];
		System.out.println();

		// Create PopStar instances and add them to the array
		
		for (int i = 0 ; i  < band.length; i++) {
			band [i] = new PopStar();
			System.out.println("Enter band member " + (i + 1) + "'s name");
			band[i].name = scanner.nextLine();
		}


		// Call the method allSing
		return band;
	}
	// TODO:
	// Add a method called
	// public static PopStar[] createBand().

	// Move the code that creates and fills a PopStar array into this method.
	// Be sure to return the array from the method
	// (since it's return type is PopStar[]).

	// Call the createBand method from main() and store the array reference in a
	// variable.

	// Pass the array to the allSing method.
	public static void allSing(PopStar[] stars) {
		// Loop through the array and call each PopStar's sing() method
		for (int i = 0; i < stars.length; i++) {
			PopStar popStar = stars[i];
			popStar.sing();
		}
	}
}
