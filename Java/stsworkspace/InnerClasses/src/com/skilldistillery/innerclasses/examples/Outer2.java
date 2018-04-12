package com.skilldistillery.innerclasses.examples;

// Local Inner Class
public class Outer2 {
  private int outerField;

  public void aMethod() {
    final int localVar = 0;

    class Inner {
      private int innerField; // Can have fields, like
                              // top-level or member class

      public String toString() {
        return "o: " + outerField + " i: " + innerField
            + " l: " + localVar;
      }
    }

    Inner in = new Inner();   // Class used after declared
    System.out.println(in);
  }

  public static void main(String[] args) {
    Outer2 out = new Outer2();
    out.aMethod();
  }
}
