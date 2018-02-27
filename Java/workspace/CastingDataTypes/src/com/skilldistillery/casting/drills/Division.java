package com.skilldistillery.casting.drills;

public class Division {

  public static void main(String[] args) {
    // This drill is divided into methods so that you can run one at a time.

    // For each method, add answers to the questions 
    // "Necessary variable type?" and "Expected value?"
    // Then uncomment the arithmetic operation and change "xxx" to the type you expect.
    // Was your type legal?
    // Uncomment the print statements and run the program to see the actual value.
    // Note: necessary data type means the smallest necessary type.
    
    method1();
    
    //method2(); 
    
    //method3();
  }
  
  static void method1() {
    short s1 = 5;
    byte b1 = 3;
    // xxx result1 = s1 / b1;
    // System.out.println("result1 is " + result1);
    // Necessary variable type? 
    // Expected value?
    // Actual value:
    // Promotion that occurred: 
  }
  
  static void method2() {
    char c2 = 3;
    byte b2 = 6;
    // xxx result2 = c2 / b2;
    // System.out.println("result2 is " + result2);
    // Necessary variable type? 
    // Expected value?
    // Actual value:
    // Promotion that occurred:
  }
  
  static void method3() {
    // This operation does not require you to choose a result type.
    int i3 = 4;
    int i4 = 8;
    double result3 = i3 / i4;
    System.out.println("result3 is " + result3);
    // Expected value?
    // Actual value:
    // Promotion that occurred:
  }

}
