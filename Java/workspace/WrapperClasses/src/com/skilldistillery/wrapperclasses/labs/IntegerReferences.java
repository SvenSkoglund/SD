package com.skilldistillery.wrapperclasses.labs;

public class IntegerReferences {
  public static void main(String[] args) {
    Integer i = new Integer(1000);
    increment(i);
    System.out.println(i);

  }
  private static Integer increment(Integer i) {
    i++;
    return i;
  }
}
