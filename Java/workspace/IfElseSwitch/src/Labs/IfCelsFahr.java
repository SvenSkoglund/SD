package Labs;

import java.util.Scanner;

public class IfCelsFahr {

	public static void main(String[] args) {
		double temp, celsius, fahrenheit;
		String scale;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		temp = scanner.nextDouble();
		System.out.print("Please enter f for fahrenheit or c for celsius: ");
		scale = scanner.next();

		if (scale.equalsIgnoreCase("f") || scale.equalsIgnoreCase("fahrenheit")) {
			celsius = 5.0 / 9.0 * (temp - 32);
			System.out.println(temp + " degrees fahrenheit is equal to " + celsius + " degrees celsius");
		}
		else if (scale.equalsIgnoreCase("c") || scale.equalsIgnoreCase("celsius")) {
			fahrenheit = (9.0 / 5.0 * temp) + 32;
			System.out.println(temp + " degrees celsius is equal to " + fahrenheit + " degrees fahrenheit");
		}else {
			System.out.println("Invalid entry");
		}

	}

}
