import java.util.Scanner;

public class FahrToCels {

	public static void main(String[] args) {
		double fahrenheit, celsius;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Please enter the temperature in Fahrenheit: ");
		fahrenheit = scanner.nextDouble();
		
		celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		System.out.println(fahrenheit + " degrees fahrenheit is equal to " + celsius + " degrees celsius");
	}

}
