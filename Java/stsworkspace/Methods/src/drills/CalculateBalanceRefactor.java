package drills;

public class CalculateBalanceRefactor {
	public static void main(String[] args) {
		double cost = 307.32;
		double balance = cost;

		double payment1 = 42.40;
		balance = balance - payment1;

		printHeader(5);
		System.out.println(balance);
		System.out.println();
		
		double payment2 = 39.31;
		balance = balance - payment2;
    

		printHeader(0);
		System.out.println(balance);
		System.out.println();
	}
	public static void printHeader(int prints) {
		int j = 0;
		while (j<prints) {
		System.out.println("/////////////////");
		System.out.println("//// BALANCE ////");
		System.out.println("/////////////////");
		j++;
		}

	}
}
