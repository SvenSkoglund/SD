package solutions;

import java.util.Scanner;

public class TriangleCalc {

	public static void main(String[] args) {
		//Call the method to get user data
		int num = getNumber();
		
		//Use the data to get triangle
		int triangle = calculateTriangle(num);
		
		//Output the triangle
		System.out.println("The triangle of " + num + " is " + triangle);

	}
	
	public static int calculateTriangle(int n) {
		int counter = 1;
		int sum = 0;
		
		//count up from 1 to n
		while(counter <= n) {
			sum = sum + counter;
			counter = counter + 1;
		}
		
		return sum;
	}
	
	public static int getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive whole number: ");
		int input = scan.nextInt();
		scan.close();
		return input;
	}

}
