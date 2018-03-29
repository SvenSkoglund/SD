import java.sql.Time;
import java.util.Scanner;

public class OverloadedMethod {

	public static void main(String[] args) {
		OverloadedMethod olm = new OverloadedMethod();
		olm.run();
	}

	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to double a");
		System.out.println("1: String");
		System.out.println("2: Integer");
		System.out.println("3: Double");
		System.out.println("4: Char");
		int entry = scanner.nextInt();
		String s = "";
		int i = 0;
		double d = 0;
		Character c = 0;
		System.out.println("Enter the item to be doubled");
		String toBeDoubled = scanner.next();
		switch (entry) {
		case 1:
			s = toBeDoubled;
			System.out.println("Doubled: " + doubler(s));
			break;
		case 2:
			i = Integer.parseInt(toBeDoubled);
			System.out.println("Doubled: " + doubler(i));
			break;
		case 3:
			d = Double.parseDouble(toBeDoubled);
			System.out.println("Doubled: " + doubler(d));
			break;
		case 4:
			c = toBeDoubled.charAt(0);
			System.out.println("Doubled: " + doubler(c));
			break;
		}
	}

	String doubler(String s) {
		s = s + s;
		return s;
	}

	int doubler(int i) {
		i = i + i;
		return i;
	}
	
	int doubler(Integer i) {
		i = i + i;
	}

	double doubler(double d) {
		d = d + d;
		return d;
	}

	String doubler(Character c) {
		String cString = c.toString() + c.toString();
		return cString;
	}

}
