package com.skilldistillery.equalsandhashcode.solutions;

public class Triangle2 {
  private int base;
  private int height;
  
  public Triangle2(int b, int h) {
    this.base = b;
    this.height = h;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + base;
    result = prime * result + height;
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
    Triangle2 other = (Triangle2) obj;
    if (base != other.base)
      return false;
    if (height != other.height)
      return false;
    return true;
  }
  
//  public boolean equals(Object obj) {
//    if (obj == this) {
//      return true;
//    }
//    if (obj == null) {
//      return false;
//    }
//    if (obj.getClass() != this.getClass()) {
//      return false;
//    }
//    Triangle2 other = (Triangle2) obj;
//    if (other.base == this.base
//        && other.height == this.height) {
//      return true;
//    }
//    return false;
//  }


}
