package com.skilldistillery.exceptions.labs.shapes;

import static java.lang.Math.*;

public class Circle extends Shape {
  double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return PI * pow(radius,2);
  }

  public Circle(double radius) {
    super();
    this.setRadius(radius);
  }

  public Circle() {
    super();
  }

  public Circle(int xCoordinate, int yCoordinate) {
    super(xCoordinate, yCoordinate);
  }
  
  public Circle(int xCoordinate, int yCoordinate, double radius) {
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
