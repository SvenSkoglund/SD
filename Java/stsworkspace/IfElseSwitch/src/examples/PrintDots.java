package examples;

import java.util.Scanner;

public class PrintDots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose between 1 and 5 dots: ");
		int dots = sc.nextInt();
		
		switch(dots) {
		case 5: printSingleDot();
		case 4: printSingleDot();
		case 3: printSingleDot();
		case 2: printSingleDot();
		case 1: printSingleDot();
		}
		sc.close();
	}

	private static void printSingleDot() {
		System.out.print(".");
	}

}
