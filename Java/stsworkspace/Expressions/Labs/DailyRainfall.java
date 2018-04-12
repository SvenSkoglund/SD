import java.util.Scanner;

//Write a program that accepts numeric values for the total daily rainfall for a week. Print the daily rainfall and calculate and print the total rainfall for the week, as well as the average rainfall for the week.
public class DailyRainfall {

	public static void main(String[] args) {

		print(prompt());

	}

	public static double[] prompt() {

		double[] week = new double[7];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter the rainfall on Day " + (i + 1) + ": ");
			week[i] = scanner.nextDouble();
		}
		return week;
	}

	public static void print(double[] week) {
		double total = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println("Day " + (i + 1) + ": " + week[i]);
			total = total + week[i];
		}

		System.out.println("Total: " + total);
		System.out.println("Average: " + (total / 7));
	}
}
