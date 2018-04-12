import java.util.Scanner;

public class Circle2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pi = 3.141592653589793;
		
		System.out.print("Please enter the radius of the circle: ");
		double radius = scanner.nextDouble();
		
		double circ = 2*pi*radius;
		double area = pi * radius * radius;
		
		System.out.println("Radius = " + radius);
		System.out.println("Circumference = " + circ);
		System.out.println("Area = " + area);

		
	}

}
