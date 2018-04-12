package labs;

import java.util.Scanner;

public class AverageScores {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Write a program to declare an array with space for five ints. Prompt a user
		// to enter five scores by repeating the prompt Score 1:, Score 2:, etc. Store
		// the entries in the correct array index.
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			int count = i + 1;
			System.out.println("Score " + count + ": ");
			intArray[i] = scanner.nextInt();
		}
		System.out.println(calculateAverage(intArray));
	}

	// Write a method called calculateAverage to calculate and return the average of
	// all the scores. It should take one parameter and return a number value.
	public static double calculateAverage(int[] intArray) {
		double total = 0;
		for (int i = 0; i < intArray.length; i++) {

			total = total + intArray[i];
		}
		return total / intArray.length;
	}
}
// To ensure that the method for calculating scores works, we are going to write
// a test method.
// Write a method called public static void testCalculateAverage().
// In the method, declare and initialize an array of four ints whose average
// will divide evenly - no decimal place.
// Call the calculateAverage method and store the result in a variable.
// Use an if statement to check if the result is what you expected. If so, print
// the message Passed. If not, print the message Failed with the value that you
// expected and the value returned from the method.
// Call the testCalculateAverage method from main. Fix any errors in
// calculateAverage. Once the method works, comment out the call to
// testCalculateAverage.
// Now that we know calculating the average works, call the calculateAverage
// method in main and print the average for the user to see.
