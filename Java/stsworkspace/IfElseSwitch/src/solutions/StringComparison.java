package solutions;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		compareNames();
	}

	public static void compareNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Short, hungry, hairy - you're my kind of lad.");
		System.out.println("What is your name?");
		String name = sc.next();
		
		// Run the program with a proper name.
		
		// Fix the code to no longer use `==`.
		if(name.equals("Frodo")) {
			System.out.println("And brave, too!");
		}
		else if(name.equals("Sam")) {
			System.out.println("And so loyal!");
		}
		else if(name.equals("Merry")) {
			System.out.println("Oh, a hungry one!");
		}
		else if(name.equals("Pippin")) {
			System.out.println("A sidekick, huh? At least you know rings.");
		}
		else {
			System.out.println("Hmmm. Doesn't ring a bell.");
		}
		sc.close();
	}

}
