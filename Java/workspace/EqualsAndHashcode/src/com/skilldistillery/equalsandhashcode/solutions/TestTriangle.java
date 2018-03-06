package com.skilldistillery.equalsandhashcode.solutions;

public class TestTriangle {

  public static void main(String[] args) {
    TestTriangle tester = new TestTriangle();
    tester.test();
  }
  
  public void test() {
    Triangle t1 = new Triangle(5, 7);
    Triangle t2 = new Triangle(5, 7);
    Triangle t3 = new Triangle(7, 5);
    
    System.out.println(t1.equals("Triangle")); // false
    System.out.println(t1.equals(t2));         // true
    System.out.println(t1.equals(t3));         // false
  }

}
