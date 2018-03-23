package exceptions;

//"Consider the following code for the main() method:


public class TestClass4 {
	public static void main(String[] args) throws Exception {
		int i = 1, j = 10;
		do {
			if (i++ > --j)
				continue;
		}
		while (i < 5);
		System.out.println("i=" + i + " j=" + j);

		System.out.println(Long.valueOf("123").longValue());	
		}
}
// What will be the output when the above code is executed?"}