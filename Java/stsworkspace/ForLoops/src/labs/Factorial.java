package labs;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(1 + ": " + 1);
		for (int i = 1; i <= 16; i++) {
			int factorialHolder = i;

			for (int j = i - 1; j > 0; j--) {
				factorialHolder = factorialHolder * j;
				if (j == 1) {
					System.out.println(i + ": " + factorialHolder);
				}
			}

		}

	}

}
