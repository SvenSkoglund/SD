package com.skilldistillery.objs2.solutions;

public class InitClassOne {
  // Constructor
  InitClassOne() {
    initCallout("\tconstructor - line 6");
  }
  
  boolean instance1 = initCallout("\tinstance field - line 9");
  
  static boolean staticOne = initCallout("static field - line 11");
  
  {
    initCallout("\tinstance init block - line 14");
  }
  
  static {
    initCallout("static init block - line 18");
  }
  
  boolean instance2 = initCallout("\tinstance field - line 21");
  
  static boolean initCallout(String fieldName) {
    System.out.println("InitClassOne " + fieldName);
    return false;
  }
  
  static void aStaticMethod() {
    // ...
  }
}
