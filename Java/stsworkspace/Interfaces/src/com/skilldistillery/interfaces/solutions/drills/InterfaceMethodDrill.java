package com.skilldistillery.interfaces.solutions.drills;

public interface InterfaceMethodDrill {
//  default void doStuff1();  // A default method must have a body.
  public void doStuff2();
//  static void doStuff3();   // A static method must have a body.
//  default static void doStuff4() { 
//    System.out.println("Doing stuff.");
//  }                         // A method cannot be both static and default.
  static void doStuff5() {
    System.out.println("Doing stuff");
  }

}
