package solutions;

public class Precedence {

	public static void main(String[] args) {
		// The methods in this program have bugs. Uncomment methods one at a time to see output.
		// Change the statements in each method to produce the expected result.
		// You can only use parentheses.
		
		result1Method();
		result2Method();
		result3Method();
	}
	
	// Group expressions with parentheses to get the expected result.
	
	static void result1Method() {
		int result = (2 + 1) * 4;
		// Expected: 12
		System.out.println(result);
	}
	
	static void result2Method() {
		int a = 2, b = 1, c = 3; 
		int result = a * (c + 3) % 2;
		// Expected: 0
		System.out.println(result);
	}
	
	static void result3Method() {
		int a = 2, b = 1, c = 3; 
		boolean result = c % a == 0 && (c > 2 || b > 0) ;
		// Expected: false
		System.out.println(result);
	}

}
