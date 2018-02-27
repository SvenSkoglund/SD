package com.skilldistillery.advancedlooping.solutions;

public class BreakTestDrill {

  public static void main(String[] args) {
    BreakTestDrill drill = new BreakTestDrill();
    drill.go();
  }

  private void go() {
    this.breakTest();
  }

  private void breakTest() {
    int i = 0, j = 5;
    label1:
    for (;; i++) {
      for (;; j--) {
        if (i > j) {
          break label1;
        }
      }
    }
    System.out.println("i=" + i + ", j=" + j);
  }
  // i j
  // 0 5 - Before loop
  // 0 5 - Entering outer loop
  // 0 5 - Entering inner loop
  // 0 5 - if (i > j): false
  // 0 4 - Inner loop decrement expression
  // 0 4 - if (i > j): false
  // 0 3 - Inner loop decrement expression
  // 0 3 - if (i > j): false
  // 0 2 - Inner loop decrement expression
  // 0 2 - if (i > j): false
  // 0 1 - Inner loop decrement expression
  // 0 1 - if( i > j): false
  // 0 0 - Inner loop decrement expression
  // 0 0 - if (i > j): STILL false, iterate inner loop again
  // 0 -1 - Inner loop decrement expression
  // 0 -1 - if (i > j): true. break both loops, leaving i unchanged.
  // i=0, j=-1


}
