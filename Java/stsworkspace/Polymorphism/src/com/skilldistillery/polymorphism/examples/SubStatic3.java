package com.skilldistillery.polymorphism.examples;

public class SubStatic3 extends SuperStatic {
  static int staticField = 12; // Field hides superclass String; does not have to be same type
  
  // method hides superclass static method
  static void staticMethod(String data) {
    System.out.println("SubStatic3.staticMethod " + data);
  }
  public static void main(String[] args) {
    System.out.println("staticField value is " + staticField);
    staticMethod("called from SubStatic3.main");
    // Access the hidden static method using the superclass name:
    SuperStatic.staticMethod("Called from SubStatic3 main using superclass name");
  }
}
