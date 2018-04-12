package com.skilldistillery.interfaces.solutions.shapes;

public abstract class Shape implements Drawable {
  private int xCoordinate;
  private int yCoordinate;
  
  // Shape is already abstract, so it doesn't need to
  // implement draw().
  
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
