package solutions;

public class PassByValue {

	public static void main(String[] args) {
		int x = 42;
		System.out.println("In main, x is " + x);
		
		// Call the changeIt method, passing local variable x and another value.
		changeIt(x, 100);
		// Add a System.out.println statement to output this method's
		// local variable x.
		System.out.println("In main, x is " + x);
		

	}
	
	public static void changeIt(int x, int y) {
		System.out.println("In changeIt, x is " + x);
		x = y;
		System.out.println("In changeIt, x is now " + x);
	}

}
