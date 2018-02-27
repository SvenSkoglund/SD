package solutions;

public class StringManipulation {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter a word or phrase: ");
		String phrase = scanner.nextLine();
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		// 2. Call addCharacter, passing phrase and num, and assign its return
		// value to a local variable.
		String concatenated = addCharacter(phrase, num);
		// 3. Output the value of the local variable.
		System.out.println(concatenated);
	}
	
	public static String addCharacter(String input, int numExc) {
		// 1. Declare a local variable "output". Initialize it to the parameter input..
		String output = input;
		// Using a loop, concatenate _numExc_ "!" characters to  the local variable output.
		int counter = 0;
		while (counter < numExc) {
			output = output + "!";
			counter = counter + 1;
		}
		
		// return "output" instead of "input"
		return output;
	}

}
