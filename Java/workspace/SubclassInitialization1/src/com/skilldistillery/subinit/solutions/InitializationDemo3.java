package com.skilldistillery.subinit.solutions;

public class InitializationDemo3 {

  public static void main(String[] args) {
    System.out.println("main start.");
    
    SubClass2 sub = new SubClass2();
    
    System.out.println("Field values:");
    System.out.println("superStatic: "+sub.getSuperStatic());
    System.out.println("superInstance: "+sub.getSuperInstance());
    System.out.println("staticField: "+sub.getStaticField());
    System.out.println("instanceField: "+sub.getInstanceField());
    
    System.out.println("main end.");

  }

}
