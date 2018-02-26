
public class ScannerInput {

	public static void main(String[] args) {
		// Add a prompt to the code so that the user knows to enter data. Output the data.
		int yearBorn;
		boolean cont = true;
		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		while(cont){
		System.out.print("Please enter the year you were born: ");
		yearBorn = keyboard.nextInt();

		System.out.println("You were born in the year " + yearBorn);
		System.out.println("Do you wish to continue? true or false: ");
		cont = keyboard.nextBoolean();
		System.out.println("You entered: " + cont);
	}
		keyboard.close();
	}

}
