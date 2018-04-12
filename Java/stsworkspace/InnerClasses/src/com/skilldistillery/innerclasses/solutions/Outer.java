package com.skilldistillery.innerclasses.solutions;

public class Outer {
  private int outerField;

  public void aMethod() {
    Inner in = new Inner();
    System.out.println(in.toString());
  }

  // Changing this member class to protected means it is not visible
  // outside the class, like any field or method, so TestInner
  // cannot use it.
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
