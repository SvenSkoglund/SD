package labs;

public class FibNum {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int fib;
		System.out.println("0: " + a);
		System.out.println("1: " + b);
	
//		0: 0
//		1: 1
//		2: 1
//		3: 2
//		4: 3
//		5: 5
//		6: 8
//		7: 13
		
		
		for (int i = 2; i <= 20; i++) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.println(i + ": " + fib);
		}
	}

}
