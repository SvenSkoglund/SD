package com.skilldistillery.wrapperclasses.solutions;

public class AutoboxOverloadc {
  public static void method(Object o) { System.out.println("In Object method"); }
  public static void method(Number n) { System.out.println("In Number method"); }
  public static void method(Long l)   { System.out.println("In Long method"); }
  public static void method(long l)   { System.out.println("In long method"); }
  // c.: Even with a method that takes Integer available, Java still chooses
  //     to widen int to long instead of autoboxing.
  public static void method(Integer i){ System.out.println("In Integer method"); }

  public static void main(String[] args) {
    int var = 17;
    method(var);
  }
}
