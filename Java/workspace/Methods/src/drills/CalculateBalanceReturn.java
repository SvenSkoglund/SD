package drills;

public class CalculateBalanceReturn {
	public static void main(String[] args) {
		double cost = 307.32;
		double balance = cost;

		double payment1 = 42.40;
		balance = balance - payment1;

		printHeader();
		System.out.println(balance);
		System.out.println();

		double payment2 = 39.31;
		balance = balance - payment2;
    
		printHeader();
		System.out.println(balance);
		System.out.println();
	}
	
	/*
	 * Refactor printHeader():
	 * 	Remove its System.out.println statements.
	 *	Call buildHeader() and assign its return value to a variable.
	 *	Output that variable to the screen.
	 */
	public static void printHeader() {
		System.out.println("/////////////////");
		System.out.println("//// BALANCE ////");
		System.out.println("/////////////////");
	}
	
	//Create a method called buildHeader that returns a String
}
