package com.skilldistillery.casting.solutions;

public class Round {
	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		System.out.print("Please enter a floating point number: ");
		double num = keyboard.nextDouble();
		keyboard.close();

		int round = (int)(num + .5);
		System.out.println(num + " rounded is " + round);
	}
}
