package solutions;

import java.util.Scanner;

public class SwitchInvestigation {

	public static void main(String[] args) {
		System.out.println("We are going to investigate what break; "
				+"and default: do in a switch statement");
		investigate();

	}
	
	public static void investigate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a grade: ");
		String grade = sc.next();

		// 1. Comment out the break; statements for case "A" and "B".
		//    Run the program. What output do you notice?
		// 2. Move the entire default case before case "A":
		//    Run the program. What output do you notice?
		switch (grade) {
		default:
			System.out.println("That's not a grade");
		case "A":
			System.out.println("Keep it up");
			//break;
		case "B":
			System.out.println("Good job");
			//break;
		case "C":
			System.out.println("Doing alright");
			break;
		case "D":
			System.out.println("Let's talk");
			break;
		case "F":
			System.out.println("You should come to class");
			break;
		}
		
		sc.close();
	}

}
