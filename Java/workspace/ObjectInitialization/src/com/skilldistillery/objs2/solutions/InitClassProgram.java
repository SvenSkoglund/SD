package com.skilldistillery.objs2.solutions;

public class InitClassProgram {
  static {
    // 1
    System.out.println("InitClassProgram static");
  }

  public static void main(String[] args) {
    // instance of one - its class will be initialized before InitClassTwo
    InitClassOne one = new InitClassOne();
    
    // instance of two - now its class will be initialized
    InitClassTwo two = new InitClassTwo();
    
    // Create an instance of InitClassOne
    // InitClassOne static fields and initializers have already run
    // so only instance initializers run for this new instance
    new InitClassOne();
  }
  

}
