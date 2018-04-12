package com.skilldistillery.equalsandhashcode.drills;

public class Triangle {
  private int base;
  private int height;
  
  public Triangle(int b, int h) {
    this.base = b;
    this.height = h;
  }

  public boolean equals(Object obj) {
	  if (this == obj) {
		  return true;
	  }
	  if (obj == null) {
		  return false;
	  }if (this.getClass() != obj.getClass()) {
		  return false;
	  }
	  Triangle compared = (Triangle) obj;
	  if ( this.base != compared.base) {
		  return false;
	  }if (this.height != compared.height) {
		  return	 false;
	  }
	  return true;
	  
  }
}
