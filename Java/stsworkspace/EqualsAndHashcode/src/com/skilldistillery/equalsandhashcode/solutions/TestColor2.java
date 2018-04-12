package com.skilldistillery.equalsandhashcode.solutions;

public class TestColor2 {

  public static void main(String[] args) {
    TestColor2 tester = new TestColor2();
    tester.test();
  }
  
  public void test() {
    RGBColor2 blue1 = new RGBColor2(0, 0, 255);
    RGBColor2 blue2 = new RGBColor2(0, 0, 255);
    RGBColor2 green = new RGBColor2(0, 255, 0);
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
