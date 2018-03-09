package com.skilldistillery.equalsandhashcode.drills;

public class ColorTriangle extends Triangle {
  RGBColor color;
  
  public ColorTriangle(int b, int h, RGBColor c) {
    super(b, h);
    this.color = c;
  }
  
  public boolean equals(Object obj) {
	  if(this==obj) {
		  return false;
	  }
	  if (!super.equals(obj)){
		  return false;
	  }if (this.getClass() != obj.getClass()) {
		  return false;
	  }
	  ColorTriangle compare = (ColorTriangle) obj;
	  // Try to compare individual colors
	  if (!compare.color.equals(this.color)) {
		  return false;
	  }
	  return true;
  }

}
