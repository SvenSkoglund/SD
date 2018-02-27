package drills;

public class ClassWithMethodsLoop {
	public static void main(String[] args) {
		System.out.println("Calling method1()");
		method1();	//call the method named "method1"
		System.out.println("main finishing");
	}

	public static void method1() {
		System.out.println("  method1 executing");
	}
}
