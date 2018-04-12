package com.skilldistillery.equalsandhashcode.solutions;

public class ColorTriangle extends Triangle {
  RGBColor2 color;
  
  public ColorTriangle(int b, int h, RGBColor2 c) {
    super(b, h);
    this.color = c;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) {
      return false;
    }
    if (!super.equals(obj))
      return false;
    if (obj.getClass() != this.getClass()) {
      return false;
    }
    ColorTriangle other = (ColorTriangle) obj;
    if (this.color == null) {
      if (other.color != null)
        return false;
    }
    else if (!color.equals(other.color))
      return false;
    return true;
  }

  
}
