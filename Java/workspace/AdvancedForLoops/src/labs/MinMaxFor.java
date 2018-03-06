package labs;

import java.util.Scanner;

public class MinMaxFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Write a program that declares an array of five integers, int[] numbers = {
		// 28, 33, 55, 21, 35 };. Use a for loop to determine the smallest and largest
		// number in the array, and print them.
		
		int[] intArray = new int [5];
		for (int i = 0 ; i < intArray.length ; i++) {
			System.out.println("Please enter an integer");
			intArray[i] = scanner.nextInt();
		}

		int min = intArray[0];
		int max = intArray[0];
		// FOR EACH
		for (int num : intArray) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println(min);
		System.out.println(max);

		min = intArray[0];
		max = intArray[0];
		// FOR
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

		min = intArray[0];
		max = intArray[0];
		// WHILE
		int i = 0;
		while (i < intArray.length) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (intArray[i] < min) {
				min = intArray[i];
			}
			i++;
		}
		System.out.println(min);
		System.out.println(max);
	}

}
