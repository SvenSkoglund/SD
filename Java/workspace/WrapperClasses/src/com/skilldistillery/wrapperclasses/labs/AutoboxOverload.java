package com.skilldistillery.wrapperclasses.labs;

public class AutoboxOverload {
  public static void method(Object o) { System.out.println("In Object method"); }
  public static void method(Number n) { System.out.println("In Number method"); }
  public static void method(Long l)   { System.out.println("In Long method"); }

  public static void main(String[] args) {
    int var = 17;
    method(var);
  }
}
