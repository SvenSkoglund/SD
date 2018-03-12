package com.skilldistillery.exceptions.solutions.shapes;

import static java.lang.Math.*;

public class Circle2 extends Shape {
  double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) throws Exception {
    if ( radius <= 0) {
//      throw new IllegalArgumentException("Radius must be greater than zero.");
      throw new Exception("Radius must be greater than zero.");
      // setRadius must now
    }
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return PI * pow(radius,2);
  }

  public Circle2(double radius) throws Exception {
    super();
    this.setRadius(radius);
  }

  public Circle2() {
    super();
  }

  public Circle2(int xCoordinate, int yCoordinate) {
    super(xCoordinate, yCoordinate);
  }
  
  public Circle2(int xCoordinate, int yCoordinate, double radius) throws Exception {
    super(xCoordinate, yCoordinate);
    this.setRadius(radius);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Circle [radius=").append(radius).append("]");
    return builder.toString();
  }

}
