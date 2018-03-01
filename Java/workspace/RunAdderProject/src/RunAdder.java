import java.util.Scanner;

public class RunAdder {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double total = 0;

		System.out.print("How many segments did you run today?");
		int segments = kb.nextInt();

		for (int i = 1; i <= segments; i++) {
			System.out.print("Enter segment " + i + "'s value: ");
			double value = kb.nextDouble();
			total = total + value;

		}
		System.out.println("Are you a skunk? True or false: ");
		String isSkunk = kb.next().toLowerCase();

		switch (isSkunk) {
		case "t":
		case "true":
		case "tr":
		case "tru":
		case "truee":
			double sk = convertToSk(total);
			System.out.println("You ran " + total + " miles.");
			System.out.println(total + " miles equals " + sk + " skunks");
			break;
		case "f":
		case "false":
		case "fa":
		case "fal":
		case "fals":
		case "falsee":
			System.out.println("Are you Un-American? True or False: ");
			boolean isUnAmerican = kb.nextBoolean();
			if (isUnAmerican) {
				double km = convertToKM(total);
				System.out.println("You ran " + km + " killometers.");
			}
			else {
				System.out.println("You are an American");
				System.out.println("You ran " + total + " miles.");
			}

		}

	}

	public static double convertToKM(double miles) {
		double km = miles * 1.61;
		return km;
	}

	public static double convertToSk(double miles) {
		double sk = miles * 422;
		return sk;
	}

}