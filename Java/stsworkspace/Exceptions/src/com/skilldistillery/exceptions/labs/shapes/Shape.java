package com.skilldistillery.exceptions.labs.shapes;

public abstract class Shape {
  private int xCoordinate;
  private int yCoordinate;
  
  public abstract double getArea();
  
  public Shape() {}
  public Shape(int xCoordinate, int yCoordinate) {
    super();
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }

  public int getxCoordinate() {
    return xCoordinate;
  }

  public void setxCoordinate(int xCoordinate) {
    this.xCoordinate = xCoordinate;
  }

  public int getyCoordinate() {
    return yCoordinate;
  }

  public void setyCoordinate(int yCoordinate) {
    this.yCoordinate = yCoordinate;
  }

}
