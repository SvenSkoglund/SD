package com.skilldistillery.exceptions.drills;

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
      int number = scanner.nextInt();
      if ( number % 2 == 0) {
        System.out.println(number + " is even.");
      }
      else {
        System.out.println(number + " is odd.");
      }
      System.out.print("Keep going? (Y/N)");
      keepGoing = scanner.next();
    }
    
  }

}
