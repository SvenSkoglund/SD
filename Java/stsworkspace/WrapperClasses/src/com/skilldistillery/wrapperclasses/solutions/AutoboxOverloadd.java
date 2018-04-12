package com.skilldistillery.wrapperclasses.solutions;

public class AutoboxOverloadd {
  public static void method(Object o) { System.out.println("In Object method"); }
  public static void method(Number n) { System.out.println("In Number method"); }
  public static void method(Long l)   { System.out.println("In Long method"); }
  public static void method(long l)   { System.out.println("In long method"); }
  public static void method(Integer i){ System.out.println("In Integer method"); }
  // d.: Of course now Java will choose the method taking int.
  public static void method(int i)    { System.out.println("In int method"); }

  public static void main(String[] args) {
    int var = 17;
    method(var);
  }
}
