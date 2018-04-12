package com.skilldistillery.polymorphism.examples;

public class SubStatic extends SuperStatic {
  public static void main(String[] args) {
    System.out.println("staticField value is " + staticField);
    staticMethod("called from SubStatic.main");
  }
}
