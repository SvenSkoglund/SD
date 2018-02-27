package solutions;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min, max, salary;
		
		System.out.println("Let's see if the salary you've been offered is what you expected.");
		System.out.print("Enter your minimum salary requirement: ");
		min = sc.nextInt();
		System.out.print("Enter the maximum you would ask for: ");
		max = sc.nextInt();
		System.out.print("Enter the salary offered: ");
		salary = sc.nextInt();
		
		boolean isExpectedSalary = false;
		// Add code to check if the salary is in the range of min and max and assign that 
		// value to isExpectedSalary
		isExpectedSalary = salary >= min && salary <= max; 
		System.out.println("Is this salary what you expect for the position? " + isExpectedSalary);
		
		// Add code to check and output whether the salary is "dreamy," where dreamy means it is
		// more than $10,000 greater than your max.
		boolean isDreamy = salary > 10000 + max;
		System.out.println("Is the salary more than $10000 over your max? " + isDreamy);
		
		// Add code to check and output whether the salary is "laughable," where laughable means it is
		// at least $5,000 less than your minimum salary requirement.
		boolean isLaughable = salary <= min - 5000;
		System.out.println("Is the salary laughable? " + isLaughable);
		sc.close();
	}

}
