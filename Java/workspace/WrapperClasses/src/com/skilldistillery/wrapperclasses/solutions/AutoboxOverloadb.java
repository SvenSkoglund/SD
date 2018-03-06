package com.skilldistillery.wrapperclasses.solutions;

public class AutoboxOverloadb {
  public static void method(Object o) { System.out.println("In Object method"); }
  public static void method(Number n) { System.out.println("In Number method"); }
  public static void method(Long l)   { System.out.println("In Long method"); }
  // b.: Java chooses the method taking long, preferring to widen the int to long
  //     rather than autoboxing to an Integer object.
  public static void method(long l)   { System.out.println("In long method"); }

  public static void main(String[] args) {
    int var = 17;
    method(var);
  }
}
