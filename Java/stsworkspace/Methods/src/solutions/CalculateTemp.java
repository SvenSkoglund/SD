package solutions;

public class CalculateTemp {

	public static void main(String[] args) {
		
		// 2. Call the method to calculate temperature.
		// Be sure to pass arguments in the correct order.
		// Print the returned value to the screen.
		double converted = 0.0;
		converted = calculateTemp(32.0, 'F');
		System.out.println(converted);
		converted = calculateTemp(212.0, 'F');
		System.out.println(converted);
		converted = calculateTemp(100.0, 'C');
		System.out.println(converted);
		converted = calculateTemp(0.0, 'C');
		System.out.println(converted);
		converted = calculateTemp(-50.0, 'K');
		System.out.println(converted);
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
	
	public static double calculateTemp(double temp, char celsOrFahr) {
		double converted = -999;
		if('C' == celsOrFahr) {
			converted = (temp * 1.8) + 32;
		}
		else if('F' == celsOrFahr) {
			converted = (temp - 32) / 1.8;
		}
		else {
			System.out.println("Temperature scale " + celsOrFahr + " not recognized.");
		}
		return converted;
	}
	
	
	

}
