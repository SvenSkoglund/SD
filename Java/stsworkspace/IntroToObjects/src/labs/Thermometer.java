package labs;

public class Thermometer {
	// Create a Thermometer class which has
	// Fields:
	//
	// char scale - (C or F).
	//
	// double currentTemp - the temperature reading.
	//
	// Methods:
	// getTempAsCelsius - return a temperature based on the thermometer's scale.
	// getTempAsFahrenheit - return a temperature based on the thermometer's scale.

	public double currentTemp;
	public char scale;

	public double getTempAsCelsius() {
		if (scale == 'C' || scale == 'c') {
			return currentTemp;

		}
		else if ((scale == 'F' || scale == 'f')){
			return (currentTemp - 32) / 1.8;
		}else {
			System.out.println("Invalid Scale!");
			return 0;
		}
	}

	public double getTempAsFahrenheit() {
		if (scale == 'F' || scale == 'f') {
			return currentTemp;
		}
		else if (scale == 'C' || scale == 'c'){
			return currentTemp * 1.8 + 32;

		}else {
			System.out.println("Invalid Scale!");
			return 0;
		}
	}
}
