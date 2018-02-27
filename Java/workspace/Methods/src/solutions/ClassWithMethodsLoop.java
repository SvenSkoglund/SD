package solutions;

public class ClassWithMethodsLoop {
	/* 
	 * Change main to call method1 five times. 
	 * 
	 * Instead of copying and pasting method1();, call the method inside a while loop.
	 * Use a variable "counter" to keep track of how many times the loop body has executed. 
	 * Initialize "counter" to 0. The while loop will execute as long as "counter < 5". 
	 * Make sure to increment (add 1 to) "counter" at the end of the while loop.
	 */
	
	public static void main(String[] args) {
		System.out.println("Calling method1()");
		int counter = 0;
		while(counter < 5) {
			method1();	//call the method named "method1"
			counter = counter + 1;
		}
		System.out.println("main finishing");
	}

	public static void method1() {
		System.out.println("  method1 executing");
	}
}
