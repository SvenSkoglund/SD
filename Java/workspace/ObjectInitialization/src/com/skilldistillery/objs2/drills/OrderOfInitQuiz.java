package com.skilldistillery.objs2.drills;

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
     */

  }

}
