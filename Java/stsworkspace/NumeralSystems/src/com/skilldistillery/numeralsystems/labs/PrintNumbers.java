package com.skilldistillery.numeralsystems.labs;

public class PrintNumbers {
	// Create a program with a method that takes an int parameter. The method should
	// loop from 1 to that number, printing each number in hexadecimal, decimal, and
	// octal. Call this method from main.
	public static void main(String[] args) {
		int k = 66;
		printNumbers(k);
	}

	// Modify your program to print the numbers in fixed-width columns. Hexadecimal
	// numbers should be padded with leading zeros and be prefixed 0x. Binary
	// numbers should be prefixed with 0b. Octal numbers should be prefixed with a
	// single 0.
	
	private static void printNumbers(int k) {
		for (int i = 0; i <= k; i++) {
			System.out.printf(("|x%016x |%016d |0%016o " +Integer.toBinaryString(i) + "\n"  ) , i , i , i );
		}
	}

}
