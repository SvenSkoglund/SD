package com.skilldistillery.exceptions.solutions.shapes;

public class ShapeTester4 {
  private Shape[] shapes;

  public static void main(String[] args) {
    ShapeTester4 tester = new ShapeTester4();
    tester.test();
  }

  private void test() {
    shapes = new Shape[10];

    try { shapes[0] = new Circle2(2.2); }
    catch (Exception e) {
      System.err.println(e.getMessage());
    }
    try { shapes[1] = new Rectangle2(2.0, 4.0); }
    catch (Exception e) {
      System.err.println(e.getMessage());
    }
    try { shapes[2] = new Circle2(0); }
    catch (Exception e) {
      System.err.println(e.getMessage());
    }
    try { shapes[3] = new Rectangle2(3.0, -5.0); }
    catch (Exception e) {
      System.err.println(e.getMessage());
    }
    try { shapes[4] = new Rectangle2(17.7, 31.1); }
    catch (Exception e) {
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
