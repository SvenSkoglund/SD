package com.skilldistillery.equalsandhashcode.solutions;

public class RGBColor {
  private int redValue;
  private int greenValue;
  private int blueValue;

  public RGBColor(int r, int g, int b) {
    redValue = r;
    greenValue = g;
    blueValue = b;
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
    RGBColor other = (RGBColor) obj;
    if (other.redValue == this.redValue
        && other.greenValue == this.greenValue
        && other.blueValue == this.blueValue) {
      return true;
    }
    return false;
  }

}
