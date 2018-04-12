package com.skilldistillery.interfaces.solutions.drills;

interface SomeInterface {
  int value = 0;
}
public class SomeClass implements SomeInterface {

  public static void main(String[] args) {
    SomeClass c = new SomeClass();
    c.doStuff();
  }

  private void doStuff() {
//    value = 1; // This will not compile: the final field value cannot be assigned.
    System.out.println("Doing stuff: " + value);
  }

}
