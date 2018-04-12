package labs;

import java.util.Scanner;

public class LoopMenu {

	public static void main(String[] args) {
		runMenu();
	}

	public static void runMenu() {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		while (quit == false) {

			printMenu();

			int entry = scanner.nextInt();
			switch (entry) {
			case 1:
				printGreeting();
				break;
			case 2:
				printAdvice();
				break;
			case 3:
				printWisdom();
				break;
			case 4:
				printHelp();
				break;
			case 5:
				printExit();
				quit = true;
				break;
			default:
				System.out.println("Invalid Entry, Try Again!");
			}

		}
	}

	private static void printMenu() {
		System.out.println("1: Greeting");
		System.out.println("2: Advice");
		System.out.println("3: Wisdom");
		System.out.println("4: Help");
		System.out.println("5: Exit");
	}

	public static void printGreeting() {
		System.out.println("Greetings friend!");
	}

	public static void printAdvice() {
		System.out.println("Sort yourself out");
	}

	public static void printWisdom() {
		System.out.println("Wisdom comes from within, not from a menu");
	}

	public static void printHelp() {
		System.out.println("2 + 2 = 4");
	}

	public static void printExit() {
		System.out.println("Goodbye!");
	}
}
