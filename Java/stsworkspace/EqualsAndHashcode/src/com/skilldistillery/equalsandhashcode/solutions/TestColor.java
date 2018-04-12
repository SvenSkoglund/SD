package com.skilldistillery.equalsandhashcode.solutions;

public class TestColor {

  public static void main(String[] args) {
    TestColor tester = new TestColor();
    tester.test();
  }
  
  public void test() {
    RGBColor blue1 = new RGBColor(0, 0, 255);
    RGBColor blue2 = new RGBColor(0, 0, 255);
    RGBColor green = new RGBColor(0, 255, 0);
    String blueStr = new String("blue");
    
    System.out.println(blue1 == blue1);        // always true
    System.out.println(blue1.equals(blue1));   // should be true
    System.out.println(blue1.equals(null));    // should be false
    System.out.println(blue1.equals(blueStr)); // should be false

    System.out.println(blue1 == blue2);      // should be false
    System.out.println(blue1.equals(blue2)); // should be true
    
    System.out.println(blue1 == green);      // should be false
    System.out.println(blue1.equals(green)); // should be false
    
    System.out.println(blue1.hashCode());
    System.out.println(blue2.hashCode()); // should match blue1.hashCode()
    System.out.println(green.hashCode());
    System.out.println(blueStr.hashCode());

  }

}
