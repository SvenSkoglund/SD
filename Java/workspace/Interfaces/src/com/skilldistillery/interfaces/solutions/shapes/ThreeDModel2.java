package com.skilldistillery.interfaces.solutions.shapes;

public class ThreeDModel2 implements ThreeDPrintable2 {
  
  // Adding a new abstract method to ThreeDPrintable breaks
  // the contract this class originally implemented, causing
  // compilation to fail.
  
  // When the interface provides a default implementation for
  // the new method, this class is fine again.

  @Override
  public void draw() {
    // Implement abstract method of Drawable
    System.out.println("Drawing ThreeDModel");
  }

  @Override
  public void threeDPrint() {
    // Implement abstract method of ThreeDPrintable
    System.out.println("3D printing ThreeDModel");
  }

}
