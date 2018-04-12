package labs;

import java.util.Scanner;

public class PowerMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base number");
		double base = scanner.nextDouble();
		System.out.println("Enter the exponent");
		double exp = scanner.nextDouble();
		
		System.out.println(base + " raised to " + exp + " equals " +calcPower(base,exp));
	}
	public static double calcPower(double base, double exp) {
		return Math.pow(base,exp);
	}
}
