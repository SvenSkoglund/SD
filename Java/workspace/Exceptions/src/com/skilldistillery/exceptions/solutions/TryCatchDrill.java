package com.skilldistillery.exceptions.solutions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDrill {

  public static void main(String[] args) {
    TryCatchDrill drill = new TryCatchDrill();
    Scanner scanner = new Scanner(System.in);
    drill.launch(scanner);
    scanner.close();

  }

  private void launch(Scanner scanner) {
    String keepGoing = "Y";
    while (keepGoing.toUpperCase().equals("Y")) {
      System.out.print("Enter a whole number: ");
      try {
        int number = scanner.nextInt();
        if ( number % 2 == 0) {
          System.out.println(number + " is even.");
        }
        else {
          System.out.println(number + " is odd.");
        }
      }
      catch (InputMismatchException e) {
        System.out.println("Invalid input.");
        scanner.nextLine(); // Clear input buffer 
      }
      System.out.print("Keep going? (Y/N)");
      keepGoing = scanner.next();
    }
    
  }

}
