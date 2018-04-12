package com.skilldistillery.innerclasses.examples;

// Anonymous Inner Class
public class Outer3 {
  private int outerField;

  public void aMethod() {
    final int localVar = 0;

    Object in = new Object() { // Assignment statement starts here...
      private int innerField;

      public String toString() {
        return "o: " + outerField + " i: " + innerField
            + " l: " + localVar;
      }
    }; // <-- Note the semicolon to end the assignment statement.

    System.out.println(in);
  }

  public static void main(String[] args) {
    Outer3 out = new Outer3();
    out.aMethod();
  }
}