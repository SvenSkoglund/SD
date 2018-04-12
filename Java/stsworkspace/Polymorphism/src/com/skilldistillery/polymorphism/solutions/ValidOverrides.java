package com.skilldistillery.polymorphism.solutions;

public class ValidOverrides extends ValidOverridesBaseClass {
  // //1 *******
  // //Comments: Simple override - works
  // @Override
  // public void method1(String input) { }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //2 *******
  // //Comments: Covariant returns - works
  // @Override
  // public String method2() { return null; }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //3 *******
  // //Comments: Compiler error - this has the Object parameter type while superclass has String, so it is an overload
  // @Override
  // public String method3(Object s) { return null;}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //4 *******
  // //Comments: Compiler error - superclass returns void
  // @Override
  // public Object method4(Object s) { return null;}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //5 *******
  // //Comments: Compiler error - default visibility "narrows" visibility
  // @Override
  // void method5(String s) {  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //6 *******
  // //Comments: Covariant return and widening visibility - works
  // public String method6() { return null; }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //7 *******
  // //Comments: Compiler error - subclass returns int, superclass returns double - must be same
  // public int method7() { return 1; }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //8 *******
  // //Comments: Compiler error - this is "hiding", not overriding.
  // @Override
  // public static int method8() { return 1; }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // //9 *******
  // //Comments: Compiler error - we cannot try to override a static method with
  // // an instance method, and vice-versa
  // public void method9() { }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  ////10 ******
  // //Comments: The parameters are in a different order, so this is an overload.
  // @Override
  // public void method10(int b, String a) { }
}
