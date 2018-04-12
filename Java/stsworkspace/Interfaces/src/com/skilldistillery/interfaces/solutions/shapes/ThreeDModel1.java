package com.skilldistillery.interfaces.solutions.shapes;

public class ThreeDModel1 implements ThreeDPrintable1 {

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
