package labs;

import java.util.Scanner;

public class AverageScoresPrompt {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Set length of array
		System.out.println("How many entries will you make?");
		int arrayLength = scanner.nextInt();
		int[] scores = new int[arrayLength];

		// Assign a value to each spot in the array
		for (int i = 0; i < scores.length; i++) {
			int count = i + 1;
			System.out.println("Score " + count + ": ");
			scores[i] = scanner.nextInt();

		}
		calculateMax(scores);
		// Call average method on array
		System.out.println(calculateAverage(scores));
	}

	// Takes an int array, totals it's parts, then returns the average as a double
	public static double calculateAverage(int[] scores) {
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total = total + scores[i];
		}
		return total / scores.length;
	}

	public static double calculateMax(int[] scores) {
		double max = scores[0];
		int place = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				place = i;
			}
		}
		System.out.println(place + ": " + max);
		return max;
	}
}
