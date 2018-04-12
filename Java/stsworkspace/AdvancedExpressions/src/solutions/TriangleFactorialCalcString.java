package solutions;

import java.util.Scanner;

public class TriangleFactorialCalcString {
  public static void main(String[] args) {
    // Call the method to get user data
    int num = getNumber();

    // Use the data to get triangle
    int triangle = calculateTriangle(num);

    // Output the triangle
    System.out.println("The triangle of " + num + " is " + triangle);

    // Calculate the String and output it
    String addString = calculateTriangleString(num);
    System.out.println(addString);

    // 4. Add a method to calculate factorial of a number and call it from main.
    int factorial = calculateFactorial(num);
    System.out.println("The factorial of " + num + " is " + factorial);
    // 5. Print the factorial string
    addString = calculateFactorialString(num);
    System.out.println(addString);
  }

  private static int calculateFactorial(int n) {
    int counter = 0;
    int factorial = 1;
    while (++counter <= n) {
      factorial *= counter;
    }
    return factorial;
  }

  public static String calculateFactorialString(int n) {
    String output = "";
    int counter = 0;
    while (counter++ < n) {
      output += counter;
      if (counter < n) {
        output += " * ";
      }
    }
    return output;
  }

  public static int calculateTriangle(int n) {
    // int counter = 1;
    int counter = 0;
    int sum = 0;

    // count up from 1 to n
    // 3. Change loop to use ++ in the loop expression
    // Could also use while (counter++ < n)
    while (++counter <= n) {
      // 1. Change calculation to use operate-equals
      // sum = sum + counter;
      sum += counter;
      // counter = counter + 1;
    }

    return sum;
  }

  public static int getNumber() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive whole number: ");
    int input = scan.nextInt();
    scan.close();
    return input;
  }

  public static String calculateTriangleString(int n) {
    String output = "";
    // int counter = 1;
    int counter = 0;

    // count up from 1 to n
    while (counter++ < n) {
      // concatenate the number
      // 2. Change string concatenation to use operate-equals
      // output = output + counter;
      output += counter;

      // add a " + " if there are more numbers
      if (counter < n) {
        output += " + ";
      }

      // counter = counter + 1;
    }
    return output;
  }
}
