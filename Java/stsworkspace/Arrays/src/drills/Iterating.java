package drills;

public class Iterating {

	public static void main(String[] args) {
		// Iterate through the names array to print the index of the name,
		// and the name, e.g. 0 : Mike.
		String[] names = { "Mike", "Davey", "Peter", "Mickey" };

		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}

		// Iterate through the precip array, but only print
		// values greater than 2.5.
		double[] precip = new double[] { 3.2, 0.5, 1.7, 2.8, 2.0, 3.1, 0.0, 0.2, 9.0 };

		for (int i = 0; i < precip.length; i++) {
			if (precip[i] > 2.5) {
				System.out.println(precip[i]);
			}
		}

		// Iterate through the daysOfWeek array, but do not print
		// Sunday or Saturday.
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 0; i < daysOfWeek.length; i++) {
			if (i != 0 && i != 6) {
				System.out.println(daysOfWeek[i]);
			}
		}

		for (int j = 1; j < daysOfWeek.length - 1; j++) {
			System.out.println(daysOfWeek[j]);
		}

		for (int i = 0; i < daysOfWeek.length; i++) {
			if (daysOfWeek[i].charAt(0) != 'S') {
				System.out.println(daysOfWeek[i]);
			}
		} // After iterating, print the daysOfWeek array itself:
		System.out.println(daysOfWeek);
		// Note the format, and what doesn't get printed.
	}

}
