package labs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// (Optional) Write a program to print the reverse of any integer value. For
		// example, for the integer 123, the program should print 321.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer to be printed in reverse order");
		String input = scanner.nextLine();
		char [] stringArray = input.toCharArray();
		char [] reverseArray = new char [stringArray.length];
		int j = 0;
		for (int i = stringArray.length - 1 ; i >= 0 ; i-- ) {
			//System.out.print(stringArray[i]);
			reverseArray[j] = stringArray[i];
			j++;
		}
		try {
		int reverseNum = Integer.parseInt(String.valueOf(reverseArray));
		System.out.println(reverseNum);
		} catch (NumberFormatException e) {
			System.out.println(String.valueOf(reverseArray));
		}
	}

}
