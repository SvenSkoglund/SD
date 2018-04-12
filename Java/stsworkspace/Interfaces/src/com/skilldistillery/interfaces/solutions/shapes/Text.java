package com.skilldistillery.interfaces.solutions.shapes;

public class Text implements Drawable {
  private String value;

  @Override
  public void draw() {
    System.out.println(value);
    
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Text(String value) {
    super();
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value;
  }

}
