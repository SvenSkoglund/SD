package com.skilldistillery.enums.solutions;

public class DayMethods {

  public static void main(String[] args) {
    // Iterate through the Day constants, printing each Day name.

    for (Day d : Day.values()) {
      // If the name contains the letter R, add a "*" next to it.
      // ternary in parens because it has low precedence
      System.out.println(d + (d.toString().contains("R") ? "*" : ""));
    }
  }

}
