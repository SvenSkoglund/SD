package drills;

import java.util.Scanner;

public class UnreachableExamble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Please enter an even number to exit the loop: ");
			int x = scanner.nextInt();
			
			if (x % 2 != 0) {
				continue;
			}
			System.out.println("Thanks!");
			break;
		}
	}

}
