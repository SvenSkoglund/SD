package com.skilldistillery.casting.solutions;

public class Ceiling {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.print("Please enter a floating point number: ");
    double num = keyboard.nextDouble();
    keyboard.close();

    int ceiling = (int)num;
    // Special case of positive number:
    // If the number is greater than zero, truncating removes remainder, so add 1
    //   but only if it's not a whole number already
    if(num > 0 
        && (num % ceiling != 0)) {
      ceiling = ceiling + 1;
    }
    System.out.println("The ceiling of " + num + " is " + ceiling);
  }
}
