package com.skilldistillery.interfaces.solutions.shapes;

public interface ThreeDPrintable2 extends Drawable {
  void threeDPrint();
//  void generateWireframe(); // Adding this abstract method breaks
                              // existing implementors.
  
  // Providing a default implementation for the new methods allows
  // existing implementors to compile without modification.
  default void generateWireframe() {
    System.out.println("Generating wireframe rendering.");
  }
}
