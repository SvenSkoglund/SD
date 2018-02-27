package solutions;

public class LoopFahrCels {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    double fahrenheit = 0.0;
    double celsius = 0.0;
    double number = 0.0;
    String scale = "";
    int i;

    for (i = 0; i < 5; i = i + 1) {

      System.out.print("Please enter your temperature: ");
      number = scanner.nextDouble();

      System.out.print("Please enter the scale: ");
      scale = scanner.next();

      if (scale.equals("F") || scale.equals("f")) {
        fahrenheit = number;
        celsius = (fahrenheit - 32) / 1.8;
      }
      else if (scale.equals("C") || scale.equals("c")) {
        celsius = number;
        fahrenheit = (celsius * 1.8) + 32;
      }
      else {
        System.err.println("Invalid scale specified.  Use 'F' or 'C'.");
        scanner.close();
        return;
      }

      System.out.print(fahrenheit + " degrees Fahrenheit is ");
      System.out.println(celsius + " degrees Celsius.");
    }
    System.out.println("Finished.");
    scanner.close();
  }
}
