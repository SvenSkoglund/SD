package com.skilldistillery.numeralsystems.solutions;

public class PrintNumbers {

  public static void main(String[] args) {
    printNumberTable(300);

  }
  
  public static void printNumberTable(int howHigh) {
    for (int i=0; i<=howHigh; i++) {
      System.out.printf("%x %d %o %n", i, i, i);
    }
  }


}
