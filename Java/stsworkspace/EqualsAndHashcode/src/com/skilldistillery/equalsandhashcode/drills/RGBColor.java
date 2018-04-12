package com.skilldistillery.equalsandhashcode.drills;

public class RGBColor {
  private int redValue;
  private int greenValue;
  private int blueValue;
  
  public RGBColor(int r, int g, int b) {
    redValue = r;
    greenValue = g;
    blueValue = b;
  }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + blueValue;
	result = prime * result + greenValue;
	result = prime * result + redValue;
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
	RGBColor other = (RGBColor) obj;
	if (blueValue != other.blueValue)
		return false;
	if (greenValue != other.greenValue)
		return false;
	if (redValue != other.redValue)
		return false;
	return true;
}

}
