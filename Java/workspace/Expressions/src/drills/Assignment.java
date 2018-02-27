package drills;

public class Assignment {

	public static void main(String[] args) {
		intAssignment();
		booleanAssignment();
	}

	static void intAssignment() {
		int x = 12;
		System.out.println("x is " + x);
		System.out.println(x = 99); // x is changed and the value of that assignment printed
		System.out.println("x is now " + x);
	}

	static void booleanAssignment() {
		boolean value = false;
		System.out.println("value is " + value);
		System.out.println(value = true);
		System.out.println("value is now " + value);

	}
}
