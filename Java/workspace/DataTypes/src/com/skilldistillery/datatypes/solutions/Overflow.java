package com.skilldistillery.datatypes.solutions;

public class Overflow {
  public static void main(String[] args) {
      int big = 2_147_483_647;
      int bigger = big + 1;

      System.out.println("Big:    " + big);
      System.out.println("Bigger: " + bigger);
      
      // Adding 1 to the largest possible int 01111...111
      // causes all the bits to "carry the 1" and overflow
      // into the Most Significant Bit, leaving 1000...000.
      // This is the most negative value for an int.
  }
}
