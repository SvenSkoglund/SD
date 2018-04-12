package com.skilldistillery.innerclasses.drills;

public class Outer {
  private int outerField;

  public void aMethod() {
    Inner in = new Inner();
    System.out.println(in.toString());
  }

  protected class Inner {
    private int innerField;

    public String toString() {
      // explicit access to outerField
      // return "o: " + Outer.this.outerField + " i: " + innerField;

      // implicit access to outerField
      return "o: " + outerField + " i: " + innerField;
    }
  }
}
