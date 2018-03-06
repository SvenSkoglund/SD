package com.skilldistillery.abstractclasses.solutions.shapes;

import static java.lang.Math.*;

public class Circle extends Shape {
  double radius;

  @Override
  public double getArea() {
    return PI * pow(radius,2);
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle() {
    super();
  }

  public Circle(int xCoordinate, int yCoordinate) {
    super(xCoordinate, yCoordinate);
  }
  
  public Circle(int xCoordinate, int yCoordinate, double radius) {
    super(xCoordinate, yCoordinate);
    this.radius = radius;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Circle [radius=").append(radius).append("]");
    return builder.toString();
  }

}
