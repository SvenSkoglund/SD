package com.skilldistillery.numeralsystems.solutions;

public class PrintNumbers3 {

  public static void main(String[] args) {
    printNumberTable(300);

  }
  
  public static void printNumberTable(int howHigh) {
    for (int i=0; i<=howHigh; i++) {
      System.out.printf("0x%08x | %10d | 0%-12o | 0b%-32s %n", i, i, i, Integer.toBinaryString(i));
    }
  }


}
