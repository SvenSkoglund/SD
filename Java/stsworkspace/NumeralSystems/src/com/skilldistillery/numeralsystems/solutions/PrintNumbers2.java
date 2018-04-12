package com.skilldistillery.numeralsystems.solutions;

public class PrintNumbers2 {

  public static void main(String[] args) {
    printNumberTable(66000);

  }
  
  public static void printNumberTable(int howHigh) {
    for (int i=0; i<=howHigh; i++) {
      System.out.printf("%x %d %o %s %n", i, i, i, Integer.toBinaryString(i));
    }
  }


}
