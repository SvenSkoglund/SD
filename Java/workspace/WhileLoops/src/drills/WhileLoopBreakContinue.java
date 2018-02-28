package drills;

import java.util.Scanner;

public class WhileLoopBreakContinue {

	public static void main(String[] args) {
		// Try the loops in the content examples in code.
		System.out.println("Loop 1...");
		// COPY-PASTE LOOP 1 HERE
		int i = 0;
		while (true) { // this loop never ends on its own
			i = i + 1;
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Loop 2...");
		// COPY-PASTE LOOP 2 HERE
		int j = 0;
		while (j <= 10) {
			j = j + 1;
			if (j == 5) {
				continue;
			}
			System.out.println(j);
		}
		// Write a do-while loop that accepts an int from a user, and exits when the
		// user types 0.
		int num;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter int numbers. Enter 0 to quit: ");
			num = scan.nextInt();
			System.out.println("You entered: " + num);
		}
		while (num != 0);
		// Loop here...

		System.out.println("Finished");

		// Write an infinite loop that accepts String values from the user.
		// Exit when the user types 'quit'. If the user types a different word, output
		// it to the screen.
		// Hint: check if the user's input equals "quit" by using the
		// if("quit".equals(YOUR_INPUT_VARIABLE)).
		String input;
		while (true) {
			System.out.println("Enter a word, 'quit' to exit.");
			input = scan.nextLine();
			if (input.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println(input);
		}

		// Loop here...

		System.out.println("Infinite loop Finished");
	}

}
