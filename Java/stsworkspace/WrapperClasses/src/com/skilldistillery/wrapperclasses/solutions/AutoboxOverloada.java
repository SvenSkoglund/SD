package com.skilldistillery.wrapperclasses.solutions;

public class AutoboxOverloada {
  public static void method(Object o) { System.out.println("In Object method"); }
  // a.: The method call compiles even though no method takes int.
  //     The int value is autoboxed to Integer, which is a subclass of Number.
  public static void method(Number n) { System.out.println("In Number method"); }
  //     Java will NOT both widen the int to long, then autobox to Long.
  public static void method(Long l)   { System.out.println("In Long method"); }

  public static void main(String[] args) {
    int var = 17;
    method(var);
  }
}
