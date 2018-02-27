package solutions;

import java.util.Scanner;

public class TriangleCalcStringTest {
	public static void main(String[] args) {
		//Call the method to get user data
//		int num = getNumber();
//		
//		//Use the data to get triangle
//		int triangle = calculateTriangle(num);
//		
//		//Output the triangle
//		System.out.println("The triangle of " + num + " is " + triangle);
//		
//		//Calculate the String and output it
//		String addString = calculateTriangleString(num);
//		System.out.println(addString);
		
		//Calculate a value
		int val = calculateTriangle(5);
		//See if they're equal
		testEquals(15, val);
		//Make sure testEquals works
		testEquals(99, val);
		
		val = calculateTriangle(6);
		testEquals(21, val);
		testEquals(99, val);
		
		String sVal = calculateTriangleString(5);
		String expected = "1 + 2 + 3 + 4 + 5";
		testEquals(expected, sVal);
		testEquals("XXX", sVal);

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
	
	public static String calculateTriangleString(int n) {
		String output = "";
		int counter = 1;
		
		//count up from 1 to n
		while(counter <= n) {
			// concatenate the number
			output = output + counter;
			
			// add a " + " if there are more numbers
			if(counter < n) {
				output = output + " + ";
			}
			
			counter = counter + 1;
		}
		return output;
	}
	
	public static boolean testEquals(int expected, int value) {
		if(expected == value) {
			System.out.println("Passed");
			return true;
		}
		else {
			System.out.println("Failed, expected " + expected + " but was " + value);
			return false;
		}
	}
	
	public static boolean testEquals(String expected, String value) {
		if(expected.equals(value)) {
			System.out.println("Passed");
			return true;
		}
		else {
			System.out.println("Failed, expected " + expected + " but was " + value);
			return false;
		}
	}
}
