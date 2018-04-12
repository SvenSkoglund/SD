package com.skilldistillery.interfaces.solutions.shapes;

public class Rectangle extends Shape {
  double width;
  double height;

  @Override
  public void draw() {
    System.out.println("Drawing " + this);
  }

  @Override
  public double getArea() {
    return width * height;
  }

  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }

  public Rectangle() {
    super();
  }

  public Rectangle(int xCoordinate, int yCoordinate) {
    super(xCoordinate, yCoordinate);
  }

  public Rectangle(int xCoordinate, int yCoordinate, double width, double height) {
    super(xCoordinate, yCoordinate);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Rectangle [width=").append(width).append(", height=").append(height).append("]");
    return builder.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(height);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(width);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Rectangle other = (Rectangle) obj;
    if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
      return false;
    if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
      return false;
    return true;
  }

  
}
