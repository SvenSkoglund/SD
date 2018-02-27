package com.skilldistillery.debugging;

public class ExampleProgram {

  public static void main(String[] args) {
    System.out.println("Example program starting");
    
    ExampleProgram ep = new ExampleProgram();
    ep.start();
  }
  
  public void start() {
    int aVariable = 12;
    String aStringVar = "Hello World" + aVariable;
    
    int resultVar = aMethod(aVariable);
    System.out.println(aStringVar + resultVar);
  }
  
  public int aMethod(int param1) {
    int result = param1;
    for(int i = 0; i < 5; i++) {
      result += i;
    }
    return result;
  }

}
