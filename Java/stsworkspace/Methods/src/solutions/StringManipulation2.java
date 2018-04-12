package solutions;

public class StringManipulation2 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter a word or phrase: ");
		String phrase = scanner.nextLine();
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		/*
		 * (Optional) Add third parameter String charToAdd to addCharacter.
		 * Concatenate this character instead of !
		 * In main, prompt the user for a character to add, 
		 * and pass the String to addCharacter.
		 */
		System.out.print("Enter the character to add: ");
		String charToAdd = scanner.next();
		String concatenated = addCharacter(phrase, num, charToAdd);
		
		System.out.println(concatenated);
	}
	
	public static String addCharacter(String input, int numExc, String charToAdd) {
		String output = input;
		int counter = 0;
		while (counter < numExc) {
			output = output + charToAdd;
			counter = counter + 1;
		}
		
		// return "output" instead of "input"
		return output;
	}

}
