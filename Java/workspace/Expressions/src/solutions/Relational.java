package solutions;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = keyboard.nextInt();
		System.out.print("Enter the second number: ");
		int second = keyboard.nextInt();
		
		boolean result = first >= second;
		System.out.println("Is first greater than or equal to second? " + result);
		// Add additional tests with the other logical operators.
		result = first > second;
		System.out.println("Is first greater than second? " + result);
		result = first < second;
		System.out.println("Is first less than second? " + result);
		result = first <= second;
		System.out.println("Is first less than or equal to second? " + result);
		result = first != second;
		System.out.println("Is first not equal to second? " + result);
		keyboard.close();

	}

}
