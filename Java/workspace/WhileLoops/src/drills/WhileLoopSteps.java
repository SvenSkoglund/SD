package drills;

import java.util.Scanner;

public class WhileLoopSteps {

	public static void main(String[] args) {
		// Write a `while` loop that will accept a number from the user, multiply it by
		// 2, and print the value to the screen. The program should accept data from the
		// user until the user enters zero.
		Scanner sc = new Scanner(System.in);

		int num = 1;
		while (num != 0) {
			System.out.print("Enter a number to be multiplied by 2. Enter 0 to quit: ");
			num = sc.nextInt();
			System.out.println(num + " multiplied by 2 equals " + (num*2));

			// while loop to multiply and get more input...
		}

	}
}
