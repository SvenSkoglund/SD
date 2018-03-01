package labs;

import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {

		menu();
	}

	public static void shortStory() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a verb in the past tense:");
		String verb = scanner.next();
		System.out.println("Please enter a noun (place):");
		String noun = scanner.next();
		System.out.println("Please enter a secound noun (thing):");
		String noun2 = scanner.next();
		System.out.println("Please enter a second verb in the past tense:");
		String verb2 = scanner.next();
		System.out.println("Please enter a third noun (thing):");
		String noun3 = scanner.next();
		System.out.println("Please enter an adjective:");
		String adjective = scanner.next();

		System.out.println("Yesterday, I " + verb + " to the " + noun + " and bought a " + noun2 + ". I " + verb2
				+ " with the woman behind the " + noun3 + " and she was very " + adjective + " .");
	}

	public static void longStory() {
		System.out.println("The spaceship was large, but looked miniscule in the distance. Jerry was curious. Why would such a ship be so far out in the forest? He couldn't help himself. He ran towards it. He carefully placed each foot as he ran, avoiding branches and rocks in his path. He was short of breath by the time he arrived at the ship's landing place. The forst had opened into a clearing, just large enough for the ship to land on the ground between the trees. He hid behind a tree on the edge of the clearing and looked around its side to see what was happening. There were tall humanoid type creatures exiting the ship, walking down a ramp that had extended from underneath it. As the group of aliens reached the forest floor, they all stopped walking, and in perfect synchronization, looked directly at him.");
	}

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for short story or 2 for long story. 0 to exit");
		int entry = scanner.nextInt();

		if (entry == 1) {
			shortStory();
			playAgain();
		}
		else if (entry == 2) {
			longStory();
			playAgain();
		}
		else if (entry == 0) {
			System.out.println("Goodbye!");
		}
		else {
			System.out.println("Invalid entry. Try again!");
			menu();
		}
	}
	public static void playAgain() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to play again or 0 to quit");
		int entry = scanner.nextInt();
		if (entry == 1 ) {
			menu();
		}else {
			System.out.println("Goodbye!");
		}
	}

}
