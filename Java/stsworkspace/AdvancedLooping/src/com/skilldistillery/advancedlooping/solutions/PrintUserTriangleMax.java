package com.skilldistillery.advancedlooping.solutions;

import java.util.Scanner;

public class PrintUserTriangleMax {
  public static void main(String[] args) {
    int max = 20;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int count = input.nextInt();
    
    outer:
    for (int i = 1; i <= count; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("#");
        if (j >= max) {
          System.out.println();
          continue outer;
        }
      }
      System.out.println();
    }

    input.close();
  }

}
