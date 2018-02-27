package solutions;

import java.util.Scanner;

public class DMVSimulator {

  /*
   * We will make a `DMVSimulator` class. It will:
   * Prompt the user to enter data for a Car.
   * Upon entry of all data, display the Car's information to the screen.
   * Prompt the user to calculate tax (C) or exit (E)
   *  If the user types C, calculate tax, where `tax = purchasePrice * 0.01 * numberOfWheels`. Then the program ends.
   *  If the user types E, print an exit message to the screen, and end the program with the command `System.exit(0)`.
   *  If the user types a different command, prompt the user again.
   * Keep prompting until the user enters C or E.
   */
  public static void main(String[] args) {
    // Get the data
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter all data for a Car:");
    System.out.print("Make: ");
    String make = sc.next();

    System.out.print("Model: ");
    String model = sc.next();

    System.out.print("Color: ");
    String color = sc.next();

    System.out.print("# of wheels: ");
    int numWheels = sc.nextInt();

    System.out.print("Purchase price: ");
    double purchasePrice = sc.nextDouble();

    // Put the data into an object
    Car c = new Car();
    c.color = color;
    c.make = make;
    c.model = model;
    c.numberOfWheels = numWheels;
    c.purchasePrice = purchasePrice;

    // Have the car display itself
    c.displayCar();

    // Put the user in a loop until they enter a valid option
    boolean calcDone = false;
    do {
      System.out.print("Enter (C) to calculate tax for this car, or (E) to exit: ");
      String cOrE = sc.next();
      switch (cOrE) {
        case "C":
          double tax = calculateTax(c.numberOfWheels, c.purchasePrice);
          System.out.println("Tax for a " + c.make + " " + c.model + " is " + tax);
          // Calculation is done, so set this to true to get out of the loop
          calcDone = true;
          break;
        case "E":
          System.out.println("Exiting...");
          System.exit(0);
          break;
      }
    } while (calcDone == false);

    sc.close();
  }

  public static double calculateTax(int numWheels, double purchasePrice) {
    double tax = numWheels * 0.01 * purchasePrice;
    return tax;
  }

}
