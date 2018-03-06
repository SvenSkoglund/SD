package com.skilldistillery.equalsandhashcode.solutions;

public class RGBColor2 {
  private int redValue;
  private int greenValue;
  private int blueValue;

  public RGBColor2(int r, int g, int b) {
    redValue = r;
    greenValue = g;
    blueValue = b;
  }
  
  public int hashCode() {
    int result = 17;
    result *= result + redValue;
    result *= result + greenValue;
    result *= result + blueValue;
    return result;
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
    RGBColor2 other = (RGBColor2) obj;
    if (other.redValue == this.redValue
        && other.greenValue == this.greenValue
        && other.blueValue == this.blueValue) {
      return true;
    }
    return false;
  }

}
