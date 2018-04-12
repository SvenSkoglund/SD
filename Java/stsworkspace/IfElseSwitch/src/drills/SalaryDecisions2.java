package drills;

import java.util.Scanner;

public class SalaryDecisions2 {

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
		
		boolean isAcceptableSal = false;
		boolean isDreamy = salary > 10000 + max;
		// TODO: Change this code to use "else if" statements for the other conditions 
		isAcceptableSal = salary >= min && salary <= max;
		if(isAcceptableSal == true) {
			System.out.println("The salary is acceptable.");
		}else if(isDreamy) {
			System.out.println("The salary is more than $10000 over max");
		}
		else if(salary <= min - 5000) {
			System.out.println("This salary is a joke.");
		}else {
			System.out.println("Salary is not acceptable, lets continue negotiation");
		}
		
		// Note that there is a path through this code that does not result in any output
		sc.close();
	}

}
