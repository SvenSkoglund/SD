package drills;

import java.util.Scanner;

public class CalculateTemp {

	public static void main(String[] args) {
		// 2. Call the method to calculate temperature.
		// Be sure to pass arguments in the correct order.
		// Print the returned value to the screen.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the temp");
		double temp = scanner.nextDouble();
		System.out.println("Please enter c for celsius or f for fahrenheit");
		String cOrF = scanner.next().toLowerCase();
		char cOrFChar = cOrF.charAt(0);
		
		calculateTemp(temp, cOrFChar);
		System.out.println();

	}
	// 1. Define a method with the following signature:
	// name: calculateTemp
	// return type: double
	// parameter 1: floating point temperature
	// parameter 2: a character denoting the temperature scale,
	//              where 'C' means Celsius and 'F' means Fahrenheit
	//
	// Be sure to put "public static" in front of the method return type and name
	// 
	// The method will calculate the alternate temperature 
	// using the formulas
	// 
	// celsius = (fahrenheit - 32) / 1.8
	// fahrenheit = (celsius * 1.8) + 32
	//
	// If the scale is not 'C' or 'F', print a message to the screen and
	// return the value -999.
	public static double calculateTemp(double temp , char cOrF) {
		double returnTemp;
		if (cOrF == 'c') {
			returnTemp = ((temp * 1.8) + 32);
			System.out.println(temp + " degrees C equals " + returnTemp + " degrees F");
			return returnTemp;
		}
		if (cOrF == 'f') {
			returnTemp = (temp - 32) / 1.8;
			System.out.println(temp + " degrees F equals " + returnTemp + " degrees C");
			return returnTemp;
		}
		else {
			System.out.println("Invalid entry");
			return -999;
		}
	}
	
	

}
