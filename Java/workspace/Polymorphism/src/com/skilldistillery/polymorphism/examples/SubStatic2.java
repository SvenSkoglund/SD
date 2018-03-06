package com.skilldistillery.polymorphism.examples;

public class SubStatic2 extends SuperStatic {
  static int staticField = 12; // Field hides superclass String; does not have to be same type
  
  // method hides superclass static method
  static void staticMethod(String data) {
    System.out.println("SubStatic2.staticMethod " + data);
  }
  public static void main(String[] args) {
    System.out.println("staticField value is " + staticField);
    staticMethod("called from SubStatic2.main");
  }
}
