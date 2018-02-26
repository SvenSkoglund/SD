
public class ScannerInputSolution {

	public static void main(String[] args) {
		// Add a prompt to the code so that the user knows to enter data. Output the data.
		int yearBorn;
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		// add a prompt...
		System.out.print("Enter the year you were born: ");
		yearBorn = keyboard.nextInt();
		
		// output the data...
		System.out.println("You were born in " + yearBorn + "? Wow, you're old!");
		// Run the program.
		
		keyboard.close();
	}

}
