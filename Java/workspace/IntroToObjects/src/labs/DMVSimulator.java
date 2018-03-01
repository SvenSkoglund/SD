package labs;
import java.util.Scanner;

public class DMVSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Create a DMVSimulator class. It will:
		//
		// Prompt the user to enter data for a Car.
		// Upon entry of all data, display the Car's information to the screen.
		// Prompt the user to calculate tax (C) or exit (E)
		// If the user types C, calculate tax, where tax = purchasePrice * 0.01 *
		// numberOfWheels. Then the program ends.
		// If the user types E, print an exit message to the screen, and end the program
		// with the command System.exit(0).
		// If the user types a different command, prompt the user again. Keep prompting
		// until the user enters C or E.
		//
		Car userCar = new Car();
		System.out.print("Enter the make: ");
		userCar.make = scanner.next();
		System.out.print("Enter the model: ");
		userCar.model = scanner.next();
		System.out.print("Enter the color: ");
		userCar.color = scanner.next();
		System.out.print("Enter the price: ");
		userCar.price = scanner.nextDouble();

		boolean choice = true;
		while (choice) {

			System.out.println("***************************");
			System.out.println("Enter C to calculate tax or E to exit");
			String entry = scanner.next();

			if (entry.equalsIgnoreCase("c")) {
				System.out.println("Tax = " + (userCar.price * .01 * 4));
				System.out.println("Goodbye!");
				choice = false;
			}
			else if (entry.equalsIgnoreCase("e")) {
				System.out.println("Goodbye!");
				System.exit(0);
				choice = false;
			}
			else {
				System.out.println("Entry not recognized!");
			}
		}
	}

}
