package solutions;

public class FahrToCels {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double fahrenheit = 0.0;

        System.out
                .print("Please enter a temperature in degrees Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        System.out.print(fahrenheit
                + " degrees Fahrenheit is equivelant to ");
        System.out.println(((fahrenheit - 32) / 1.8)
                + " degrees Celsius.");

        scanner.close();
    }
}
