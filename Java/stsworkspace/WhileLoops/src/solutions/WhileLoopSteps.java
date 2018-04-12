package solutions;

import java.util.Scanner;

public class WhileLoopSteps {

  public static void main(String[] args) {
    // Write a while loop that will accept a number from a user until the user
    // enters zero.
    // Multiply the value by 2 and print it to the screen.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    // while loop...
    while (num != 0) {
      System.out.println(num * 2);
      System.out.print("Enter a number: ");
      num = sc.nextInt();
    }
    System.out.println("Finished.");
  }

}
