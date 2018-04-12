package com.skilldistillery.objs2.drills;

public class InitClassProgram {
  static {
    System.out.println("InitClassProgram static");
  }

  public static void main(String[] args) {
    // instance of one
    InitClassOne one = new InitClassOne();
    
    // instance of two
    InitClassTwo two = new InitClassTwo();
    
    // TODO: Create an instance of InitClassOne
    InitClassOne oneTwo = new InitClassOne();
  }
  

}
