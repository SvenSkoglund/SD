package com.skilldistillery.casting.solutions;

public class Floor {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.print("Please enter a floating point number: ");
    double num = keyboard.nextDouble();
    keyboard.close();

    int floor = (int) num;
    // Special case of negative number:
    // If the number is less than zero, it must move down to the lower negative number,
    //   but only if it's not a whole number already
    if (num < 0 
        && (num % floor != 0.0)) {
      floor = floor - 1;
    }
    System.out.println("The floor of " + num + " is " + floor);
  }
}
