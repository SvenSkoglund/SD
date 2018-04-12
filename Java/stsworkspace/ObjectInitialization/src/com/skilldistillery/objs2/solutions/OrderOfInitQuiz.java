package com.skilldistillery.objs2.solutions;

public class OrderOfInitQuiz {

  public static void main(String[] args) {
    InitClassOne one = null;
    
    InitClassTwo.staticTwo = true;  // initialize a non-constant field
    
    InitClassTwo two = new InitClassTwo();
    InitClassTwo twoAgain = new InitClassTwo();
    
    InitClassOne.aStaticMethod(); // static method call
    
    /*
     * What do you expect the order of initialization to be? Write the classes
     * and their members (static, instance, constructor) below.
     * 
     * An InitClassOne variable is declared on line 6, but not used, so the 
     * class is not loaded.
     * 
     * InitClassTwo must be loaded once, then two instances created.
     * InitClassTwo
     *   static fields and blocks in order
     * InitClassTwo
     *   instance fields and blocks in order
     *   constructor
     * InitClassTwo
     *   instance fields and blocks in order
     *   constructor
     * InitClassOne
     *   static fields and blocks in order
     */

  }

}
