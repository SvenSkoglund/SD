package com.skilldistillery.abstractclasses.solutions.shapes;

public class ShapeTester {

  public static void main(String[] args) {
    ShapeTester tester = new ShapeTester();
    tester.runTest();
  }

  private void runTest() {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Rectangle(2.0,4.0);
    shapes[1] = new Rectangle(5.0,8.0);
    shapes[2] = new Circle(2.5);
    printShapes(shapes);
  }

  private void printShapes(Shape[] shapes) {
    for (Shape shape : shapes) {
      System.out.println(shape.getClass().getSimpleName() + " area: " + shape.getArea());
    }
    
  }
  
  

}
