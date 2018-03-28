package com.skilldistillery.advancedlooping.solutions;

public class NestedLoopsDrill {

  public static void main(String[] args) {
    NestedLoopsDrill drill = new NestedLoopsDrill();
    drill.go();
  }

  private void go() {
//    test1();
    test2();
  }

  private void test1() {
    // for: // WILL NOT COMPILE: "for" is a language keyword, so not a valididentifier.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (i + j > 10) {
          // break for;
        }
      }
      System.out.println("looping.");
    }
  }

  // With a valid label:
  private void test2() {
    forLabel: 
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (i + j > 10) {
           break forLabel;
        }
      }
      System.out.println("looping.");
    }
  }
  // With a valid label:
  // i j
  // 0   - Begin outer loop
  // 0 0 - Begin inner loop
  // 0 0 - if (i + j > 10): false, continue inner loop.
  // 0 1 - inner loop increment
  // 0 1 - if (i + j > 10): false, continue inner loop.
  // 0 2 - inner loop increment
  // 0 2 - if (i + j > 10): false, continue inner loop.
  // 0 3 - inner loop increment
  // 0 3 - if (i + j > 10): false, continue inner loop.
  // 0 4 - inner loop increment
  // 0 4 - if (i + j > 10): false, continue inner loop.
  // 0 5 - inner loop increment
  // 0 5 - if (i + j > 10): false, continue inner loop.
  // 0 6 - inner loop increment
  // 0 6 - if (i + j > 10): false, continue inner loop.
  // 0 7 - inner loop increment
  // 0 7 - if (i + j > 10): false, continue inner loop.
  // 0 8 - inner loop increment
  // 0 8 - if (i + j > 10): false, continue inner loop.
  // 0 9 - inner loop increment
  // 0 9 - if (i + j > 10): false, continue inner loop.
  // 0 10 - inner loop increment
  // 0 10 - if (i + j > 10): false, continue inner loop.
  // 0 10 - inner loop condition, j < 10, now false, exit inner loop
  // System.out.println("looping.");
  // 1    - Increment outer loop
  // 1 0  - reinitialize inner loop
  // 1 0 - if (i + j > 10): false, continue inner loop.
  // 1 0 - inner loop increment
  // 1 1 - if (i + j > 10): false, continue inner loop.
  // ...
  // 1 9 - if (i + j > 10): false, continue inner loop.
  // 1 10 - inner loop increment
  // 1 10 - inner loop condition, j < 10, now false, exit inner loop
  // System.out.println("looping.");
  // 2    - Increment outer loop
  // 2 0  - reinitialize inner loop
  // 2 0 - if (i + j > 10): false, continue inner loop.
  // 2 0 - inner loop increment
  // 2 1 - if (i + j > 10): false, continue inner loop.
  // ...
  // 2 9 - if (i + j > 10): true, break to outer loop label, skipping println.
  
  // looping.
  // looping.

}
