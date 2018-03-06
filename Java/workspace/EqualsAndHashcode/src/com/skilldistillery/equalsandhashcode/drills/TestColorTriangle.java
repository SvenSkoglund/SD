package com.skilldistillery.equalsandhashcode.drills;

public class TestColorTriangle {

  public static void main(String[] args) {
    TestColorTriangle tester = new TestColorTriangle();
    tester.test();
  }
  
  public void test() {
    ColorTriangle blueTriangle1 = new ColorTriangle(5, 7, new RGBColor(0,0,255));
    ColorTriangle blueTriangle2 = new ColorTriangle(5, 7, new RGBColor(0,0,255));
    ColorTriangle blueTriangle3 = new ColorTriangle(7, 5, new RGBColor(0,0,255));
    ColorTriangle greenTriangle = new ColorTriangle(5, 7, new RGBColor(0,255,0));
    
    System.out.println(blueTriangle1.equals("Triangle"));            // false
    System.out.println(blueTriangle1.equals(blueTriangle2));         // true
    System.out.println(blueTriangle1.equals(blueTriangle3));         // false
    System.out.println(blueTriangle1.equals(greenTriangle));         // false
  }

}
