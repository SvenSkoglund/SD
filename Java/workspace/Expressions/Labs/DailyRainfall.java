import java.util.Scanner;

//Write a program that accepts numeric values for the total daily rainfall for a week. Print the daily rainfall and calculate and print the total rainfall for the week, as well as the average rainfall for the week.
public class DailyRainfall {

	public static void main(String[] args) {

		promptAndPrint();
		
	}

	public static void promptAndPrint() {
		double monday, tuesday, wednesday, thursday, friday, saturday, sunday, average, total;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the rainfall on Monday: ");
		monday = scanner.nextDouble();
		System.out.println("Enter the rainfall on Tuesday: ");
		tuesday = scanner.nextDouble();
		System.out.println("Enter the rainfall on Wednesday: ");
		wednesday = scanner.nextDouble();
		System.out.println("Enter the rainfall on Thursday: ");
		thursday = scanner.nextDouble();
		System.out.println("Enter the rainfall on Friday: ");
		friday = scanner.nextDouble();
		System.out.println("Enter the rainfall on Saturday: ");
		saturday = scanner.nextDouble();
		System.out.println("Enter the rainfall on Sunday: ");
		sunday = scanner.nextDouble();
		
		total = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
		average = total / 7;
		
		System.out.println("Monday: " + monday);
		System.out.println("Tuesday: " + tuesday);
		System.out.println("Wednesday: " + wednesday);
		System.out.println("Thursday: " + thursday);
		System.out.println("Friday: " + friday);
		System.out.println("Saturday: " + saturday);
		System.out.println("Sunday: " + sunday);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
	}
}
