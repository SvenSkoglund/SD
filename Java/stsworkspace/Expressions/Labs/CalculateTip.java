import java.util.Scanner;

public class CalculateTip {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How much was the bill? $");
		double bill = scanner.nextDouble();
		
		printTipTable(bill);
	}
	public static void printTipTable(double bill) {
		System.out.println();
		System.out.println("Possible Tip Values");
		System.out.println("-------------------");
		System.out.println("20% = $" + bill*.2);
		System.out.println("15% = $" + bill*.15);
		System.out.println("10% = $" + bill*.1);

	}
}
