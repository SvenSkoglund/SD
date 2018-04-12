package com.skilldistillery.exceptions.solutions.shapes;

public class ShapeTester3 {
  private Shape[] shapes;

  public static void main(String[] args) {
    ShapeTester3 tester = new ShapeTester3();
    tester.test();
  }

  private void test() {
    shapes = new Shape[10];

    try { shapes[0] = new Circle(2.2); }
    catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
    try { shapes[1] = new Rectangle(2.0, 4.0); }
    catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
    try { shapes[2] = new Circle(0); }
    catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
    try { shapes[3] = new Rectangle(3.0, -5.0); }
    catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
    try { shapes[4] = new Rectangle(17.7, 31.1); }
    catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }

    printShapes(shapes);
  }

  private void printShapes(Shape[] shapes) {
    for (Shape shape : shapes) {
      if (shape != null) {
        System.out.println(shape + ", area=" + shape.getArea());
      }
    }
  }

}
