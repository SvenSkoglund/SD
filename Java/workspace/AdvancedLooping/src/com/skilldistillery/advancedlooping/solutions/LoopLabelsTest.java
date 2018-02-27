package com.skilldistillery.advancedlooping.solutions;

public class LoopLabelsTest {

  public static void main(String[] args) {
    
    // declare variables outside loops, so they'll be visible after the loops finish.
    int i=0, j=0;
    outer:
    for (i=0; i < 3; i++) {
      inner:
      for (j=3; j > 0; j--) {
        if (i < j) {
          continue outer;
        }
        else {
          break inner;
        }
      }     
    }
    System.out.println("i="+i+", j="+j);

  }

}
