package com.skilldistillery.equalsandhashcode.solutions;

public class ColorTriangle2 extends Triangle2 {
  RGBColor2 color;
  
  public ColorTriangle2(int b, int h, RGBColor2 c) {
    super(b, h);
    this.color = c;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    ColorTriangle2 other = (ColorTriangle2) obj;
    if (color == null) {
      if (other.color != null)
        return false;
    }
    else if (!color.equals(other.color))
      return false;
    return true;
  }
  
  

//  public boolean equals(Object obj) {
//    if (this == obj) return true;
//    if (obj == null) {
//      return false;
//    }
//    if (!super.equals(obj))
//      return false;
//    if (obj.getClass() != this.getClass()) {
//      return false;
//    }
//    ColorTriangle2 other = (ColorTriangle2) obj;
//    if (this.color == null) {
//      if (other.color != null)
//        return false;
//    }
//    else if (!color.equals(other.color))
//      return false;
//    return true;
//  }

  
}
