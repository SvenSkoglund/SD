import java.util.Scanner;

public class DeafGrandma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandma();
	}

	public static void grandma() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// The user is prompted to say something to Grandma.
			System.out.println("Say somethin' to Grandma");
			String saidToGrandma = scanner.nextLine();
			String upperCase = saidToGrandma.toUpperCase();

			// Grandma can only hear the user if the user yells (writes in capital letters).
			// When you yell goodbye at Grandma she yells back "SMELL YOU LATER!"
			if (saidToGrandma.equals("GOODBYE")) {
				System.out.println("\"SMELL YOU LATER!\"");
				break;
			}
			// When Grandma does hear you, she yells "NO, NOT SINCE THE WAR".
			else if (saidToGrandma.equals(upperCase)) {
				System.out.println("\"NO, NOT SINCE THE WAR\"");
			} // When Grandma doesn't hear you, she yells "HUH? SPEAK UP BILLY!"
			else {
				System.out.println("\"HUH? SPEAK UP BILLY!\"");
			}
		}
	}
}
