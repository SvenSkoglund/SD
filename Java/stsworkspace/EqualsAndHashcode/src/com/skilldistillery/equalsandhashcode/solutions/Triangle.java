package com.skilldistillery.equalsandhashcode.solutions;

public class Triangle {
  private int base;
  private int height;
  
  public Triangle(int b, int h) {
    this.base = b;
    this.height = h;
  }
  
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (obj.getClass() != this.getClass()) {
      return false;
    }
    Triangle other = (Triangle) obj;
    if (other.base == this.base
        && other.height == this.height) {
      return true;
    }
    return false;
  }


}
