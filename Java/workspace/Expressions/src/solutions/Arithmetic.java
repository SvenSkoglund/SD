package solutions;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// Run this program with several numbers. What happens to the remainder when you do
		// integer division?
		// doDivision();
		// Comment out the call to doDivision();
		// Uncomment the call to doModulus();
		doModulus();
	}
	
	static void doDivision() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Refresher:\n\tDivision:\tquotient = dividend / divisor");
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		int quotient = dividend / divisor;
		System.out.println("quotient = " + quotient);
		sc.close();
	}
	
	static void doModulus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Refresher:\n\tDivision:\tquotient = dividend / divisor");
		System.out.println("\tRemainder: amount left over from division");
		// Complete the method and use the modulus operator to find the remainder.
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		int remainder = dividend % divisor;
		System.out.println("remainder = " + remainder);
		sc.close();
	}

}
