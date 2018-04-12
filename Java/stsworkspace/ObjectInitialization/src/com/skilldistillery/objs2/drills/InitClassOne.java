package com.skilldistillery.objs2.drills;

public class InitClassOne {
  // Constructor
  // 6 - constructors after init blocks and fields
  InitClassOne() {
    initCallout("\tconstructor - line 6");
  }
  
  // 3 - instance init blocks and field declarations, in order
  boolean instance1 = initCallout("\tinstance field - line 9");
  
  // 1 - statics in order
  static boolean staticOne = initCallout("static field - line 11");
  
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
    System.out.println("InitClassOne " + fieldName);
    return false;
  }
  
  static void aStaticMethod() {
    // ...
  }
}
