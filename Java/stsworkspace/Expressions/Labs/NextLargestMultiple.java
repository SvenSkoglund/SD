import java.util.Scanner;

public class NextLargestMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, j;
		
		System.out.println("Please enter the first integer: ");
		i = scanner.nextInt();
		System.out.println("Please enter the second integer: ");
		j = scanner.nextInt();
		
		int nextMultiple = i + j - i % j;
		
		System.out.println("The next largest multiple is " +nextMultiple);
	}

}
