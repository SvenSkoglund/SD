package com.skilldistillery.polymorphism.solutions;

public class ValidOverridesBaseClass {
  // 1 **************
  public void method1(String input) { }
  
  // 2 **************
  public Object method2() { return null; }
  
  // 3 **************
  public String method3(String s) { return null;}
  
  // 4 **************
  public void method4(Object s) { }
  
  // 5 **************
  public void method5(String s) {  }
  
  // 6 **************
  protected Object method6() { return null; }
  
  // 7 **************
  protected double method7() { return 1.0; }
  
  // 8 **************
  public static int method8() { return 1; }
  
  // 9 **************
  public static void method9() { }
  
  //10 *************
  public void method10(String a, int b) { }
}
