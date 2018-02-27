import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {
		// TODO write main method
		// TODO create scanner
		Scanner input = new Scanner(System.in);

		System.out.print("This is a prompt! Type something: 		");
		String s = input.nextLine();

		if (s.length() > 0) {
			System.out.print("You said, \"" + s + "\"");
			input.close();
		}
		else {
			System.out.println("You didn't enter anything!");
		}
	}
}