package com.skilldistillery.equalsandhashcode.drills;

public class ColorTriangle extends Triangle {
  RGBColor color;
  
  public ColorTriangle(int b, int h, RGBColor c) {
    super(b, h);
    this.color = c;
  }

}
