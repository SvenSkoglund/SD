package com.skilldistillery.exceptions.solutions.shapes;

public class ShapeTester {
  private Shape[] shapes;

  public static void main(String[] args) {
    ShapeTester tester = new ShapeTester();
    tester.test();
  }

  private void test() {
    shapes = new Shape[10];
    
    shapes[0] = new Circle(2.2);
    shapes[1] = new Rectangle(2.0, 4.0);
    shapes[2] = new Circle(0);  // Exception in thread "main" java.lang.IllegalArgumentException: Radius must be greater than zero.
    // Execution stops, and the exception propagates to main() and then to the JVM, which exits.
    shapes[3] = new Rectangle(3.0, -5.0);
    shapes[4] = new Rectangle(17.7, 31.1);
    
    printShapes(shapes);
  }

  private void printShapes(Shape[] shapes) {
    for (Shape shape : shapes) {
      if (shape != null) {
        System.out.println(shape + ", area="+shape.getArea());
      }
    }
  }

}
