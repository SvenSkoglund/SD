package drills;

import java.util.Scanner;

public class SalaryDecisions3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min, max, salary;
		
		System.out.println("Let's see if the salary you've been offered is acceptable.");
		System.out.print("Enter your minimum salary requirement: ");
		min = sc.nextInt();
		System.out.print("Enter the maximum you would ask for: ");
		max = sc.nextInt();
		System.out.print("Enter the salary offered: ");
		salary = sc.nextInt();
		
		// TODO: add an else statement to print the message "At least I got an offer."
		// What salary range causes the else block to execute? Add it as a comment in your else block.
		boolean isAcceptableSal = false;
		isAcceptableSal = salary >= min && salary <= max;
		if(isAcceptableSal == true) {
			System.out.println("The salary is acceptable.");
		}
		else if(salary > 10000 + max) {
			System.out.println("The salary is more than $10000 over max");
		}
		else if(salary <= min - 5000) {
			System.out.println("This salary is a joke.");
		}else {
			// this code executes if the offer is between 1 and 10000 dollars over
			// or if it is between 1 and 4999 under
			System.out.println("At least I got an offer.");
		}
		sc.close();
	}

}
