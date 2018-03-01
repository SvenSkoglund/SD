package labs;

public class LoopFahrCels {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		double fahrenheit = 0.0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Please enter a temperature in degrees Fahrenheit: ");
			fahrenheit = scanner.nextDouble();

			System.out.print(fahrenheit + " degrees Fahrenheit is equivelant to ");
			System.out.println(((fahrenheit - 32) / 1.8) + " degrees Celsius.");
		}
		scanner.close();
	}

}
