package com.skilldistillery.exceptions.labs.shapes;

public class ShapeTester {

  public static void main(String[] args) {
    ShapeTester tester = new ShapeTester();
    tester.test();
  }

  private void test() {
    Shape[] shapes = new Shape[10];
    shapes[0] = new Circle(2.2);
    shapes[2] = new Circle(0);
    shapes[1] = new Rectangle(2.0, 4.0);
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
