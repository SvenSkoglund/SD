package com.skilldistillery.datatypes.solutions;

import java.util.Scanner;

import com.skilldistillery.datatypes.labs.BitPrinter;

public class BitPrinterDriver {

  static Scanner sc; // static field so it is available to all methods
  
  public static void main(String[] args) {
    sc = new Scanner(System.in);
    BitPrinter bp = new BitPrinter();
    
    while(true) {
      String input = getUserData();
      if("QUIT".equals(input)) {
        break;
      }
      String bits = bp.getDataAsBits(input);
      System.out.println(input + " in bits is " + bits);
    }
    System.out.println("Goodbye.");
    sc.close(); // clean up
  }
  
  public static String getUserData() {
    System.out.print("Enter an int, double, or char value. Type QUIT to exit: ");
    String input = sc.next();
    return input;
  }
  
  
  

}
