package com.skilldistillery.objs2.solutions;

public class InitClassTwo {
  // Constructor
  // 6 - - constructors after init blocks and fields
  InitClassTwo() {
    initCallout("\tconstructor - line 16");
  }

  // 3 - instance init blocks and fields first, in order
  boolean instance1 = initCallout("\tinstance field - line 9");

  // 1 - statics first, in order
  static boolean staticTwo = initCallout("static field - line 11");

  // 4
  {
    initCallout("\tinstance init block - line 14");
  }

  // 2
  static {
    initCallout("static init block - line 18");
  }

  // 5
  boolean instance2 = initCallout("\tinstance field - line 21");

  static boolean initCallout(String fieldName) {
    System.out.println("InitClassTwo " + fieldName);
    return false;
  }
}
