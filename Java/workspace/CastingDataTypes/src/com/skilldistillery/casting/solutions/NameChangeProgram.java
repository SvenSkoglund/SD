package com.skilldistillery.casting.solutions;

import java.util.Scanner;

public class NameChangeProgram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Prompt and get the data
    System.out.print("Enter your first name: ");
    String input = getInput(sc); // pass the scanner reference
    
    // Change it
    NameChanger nc = new NameChanger();
    int stringNum = nc.calculateNumericValue(input);
    String transformed = nc.transformString(input);
    
    // Output data
    System.out.println(input + " is " + transformed + " : " + stringNum);
    
    // Clean up
    sc.close();
  }
  
  public static String getInput(Scanner sc) {
    String input = sc.next();
    return input;
  }

}
