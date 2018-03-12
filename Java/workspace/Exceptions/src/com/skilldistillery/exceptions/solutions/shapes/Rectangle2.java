package com.skilldistillery.exceptions.solutions.shapes;

public class Rectangle2 extends Shape {
  double width;
  double height;

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) throws Exception {
    if ( width <= 0) {
      throw new Exception("Width must be greater than zero.");
    }
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if ( height <= 0) {
      throw new IllegalArgumentException("Height must be greater than zero.");
    }
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  public Rectangle2(double width, double height) throws Exception {
    super();
    this.setWidth(width);
    this.setHeight(height);
  }

  public Rectangle2() {
    super();
  }

  public Rectangle2(int xCoordinate, int yCoordinate) {
    super(xCoordinate, yCoordinate);
  }

  public Rectangle2(int xCoordinate, int yCoordinate, double width, double height) throws Exception {
    super(xCoordinate, yCoordinate);
    this.setWidth(width);
    this.setHeight(height);
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
    Rectangle2 other = (Rectangle2) obj;
    if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
      return false;
    if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
      return false;
    return true;
  }

  
}
