package solutions;

public class ThermometerDriver {

  public static void main(String[] args) {
    run();
  }

  public static void run() {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Enter a scale, C or F: ");
    String scaleString = sc.next();
    // get the first character of the String as a char with charAt(0)
    char scale = scaleString.charAt(0);

    System.out.print("Enter a temperature: ");
    double temp = sc.nextDouble();

    // make a Thermometer instance
    Thermometer therm = new Thermometer();
    therm.currentTemp = temp;
    therm.scale = scale;

    // Get its data and print to screen.
    double tempCelc = therm.getTempAsCelsius();
    double tempF = therm.getTempAsFahrenheit();

    System.out.println(tempCelc + " Celsius");
    System.out.println(tempF + " Fahrenheit");

    sc.close();
  }

}
