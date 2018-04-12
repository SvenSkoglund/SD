import java.util.Scanner;

public class FahrToCels {

	public static void main(String[] args) {
		double temp, celsius, fahrenheit;
		String scale;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Please enter the temperature: ");
		temp = scanner.nextDouble();
		System.out.print("Please enter f for fahrenheit or c for celsius: ");
		scale = scanner.next();
		if (scale.equals("f") || scale.equals("c")){
			if (scale.equals("f")) {
				celsius = 5.0 / 9.0 * (temp - 32);
				System.out.println(temp + " degrees fahrenheit is equal to " + celsius + " degrees celsius");
			}
			if (scale.equals("c")) {
				fahrenheit = (9.0/5.0 * temp) + 32;
				System.out.println(temp + " degrees fahrenheit is equal to " + celsius + " degrees celsius");
			}
		}
		
	}

}
