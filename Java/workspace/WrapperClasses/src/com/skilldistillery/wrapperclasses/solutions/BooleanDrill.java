package com.skilldistillery.wrapperclasses.solutions;

public class BooleanDrill {

  public static void main(String[] args) {
    System.out.println(Boolean.parseBoolean(" true ")); // false
    System.out.println(Boolean.parseBoolean("true"));   // true
    System.out.println(Boolean.parseBoolean(null));     // false
    System.out.println(Boolean.valueOf(true));          // true
    System.out.println(Boolean.valueOf("trUE"));        // true
    System.out.println(Boolean.TRUE);                   // true
  }

}
