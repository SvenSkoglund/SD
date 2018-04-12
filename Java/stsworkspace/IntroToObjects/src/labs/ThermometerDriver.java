package labs;

import java.util.Scanner;

public class ThermometerDriver {

	public static void main(String[] args) {
		// Create a ThermometerDriver class. It will prompt a user for a temperature and
		// scale, then print the temperature (in both Celsius and Fahrenheit) to the
		// screen.
		//
		// (Hint: Remember that the String "C" and char 'C' are not the same. Use the
		// String method charAt(0) to convert the String "C" or "F" into a char.)
		//
		// (Solution: ThermometerDriver.java)
		//
		// Optional: Place the user interaction in an infinite loop. If the user types Q
		// for the scale, exit the program.
		Thermometer therm = new Thermometer();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Please enter a temp: ");
			therm.currentTemp = sc.nextDouble();

			System.out.print("Please enter the scale (c or f) or 'q' to quit: ");
			System.out.println();
			String scale = sc.next();
			
			if (scale.equalsIgnoreCase("q")) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			therm.scale = scale.charAt(0);

			System.out
					.println("Temp in C: " + therm.getTempAsCelsius() + "\nTemp in F: " + therm.getTempAsFahrenheit());
		}
	}

}
