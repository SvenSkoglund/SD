package Labs;

import java.util.Scanner;

public class NumFactors {
	// Write a program that prompts the user to enter a number and prints a message
	// stating whether the number is odd or even. Modify your program to add a
	// message stating whether the number is divisible by 10. Add another message
	// stating whether the number is divisible by 100.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Your number is even");
		}
		else {
			System.out.println("Your number is odd");
		}
		if (num % 10 == 0) {
			System.out.println("Your number is divisible by 10");
		}
		if (num % 100 == 0) {
			System.out.println("Your number is divisible by 100");
		}
	}

}
