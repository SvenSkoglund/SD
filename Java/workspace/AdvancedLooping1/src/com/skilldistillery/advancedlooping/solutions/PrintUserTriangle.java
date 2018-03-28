package com.skilldistillery.advancedlooping.solutions;

import java.util.Scanner;

public class PrintUserTriangle {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int count = input.nextInt();
    
    for (int i = 1; i <= count; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("#");
      }
      System.out.println();
    }

    input.close();
  }

}
