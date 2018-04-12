package Labs;

import java.util.Scanner;

public class NumSignZero {
	public static void main(String[] args) {
		// Write a program that accepts a number as input and prints a message stating
		// whether the number is positive or negative.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scanner.nextInt();
		if (num < 0) {
			System.out.println("Your number is negative");
		}
		else if (num == 0) {
			System.out.println("Your number is zero");
		}
		else {
			System.out.println("Your number is positive");
		}
	}

}
