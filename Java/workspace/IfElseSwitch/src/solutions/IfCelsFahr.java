package solutions;

public class IfCelsFahr {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double fahrenheit = 0.0;
        double celsius = 0.0;
        double number = 0.0;
        String scale = "";

        System.out.print("Please enter your temperature: ");
        number = scanner.nextFloat();

        System.out.print("Please enter the scale: ");
        scale = scanner.next();
        scanner.close();

        if (scale.equals("F") || scale.equals("f")
        		|| scale.equals("Fahrenheit") || scale.equals("fahrenheit")) {
            fahrenheit = number;
            celsius = (fahrenheit - 32) / 1.8;
            System.out.print(fahrenheit + " degrees Fahrenheit is ");
            System.out.println(celsius + " degrees Celsius.");
        } 
        else if (scale.equals("C") || scale.equals("c")
        		|| scale.equals("Celsius") || scale.equals("celsius")) {
            celsius = number;
            fahrenheit = (celsius * 1.8) + 32;
            System.out.print(celsius + " degrees Celsius is ");
            System.out.println(fahrenheit + " degrees Fahrenheit.");
        } 
        else {
            System.err.println("Invalid scale. Use 'F' or 'C'.");
        }

    }
}
