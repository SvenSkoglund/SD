package com.skilldistillery.exceptions.solutions;

public class FinallyDrill {

  public static void main(String[] args) {
    FinallyDrill drill = new FinallyDrill();
    drill.launch();
    System.err.println("main done.");
  }

  private void launch() {
    try {
      runMethod();
    }
    catch (Exception e) {
      System.err.println("launch: Exception caught, returning.");
//      return;
      System.exit(1);
    }
    finally {
      // Even if the catch block returns, we still see the finally block execute.
      // ... But if the catch block exits, the JVM stops, and we never
      //     get here, and main() doesn't complete.
      System.err.println("launch method finally block.");
      return;
    }
    
  }

  private void runMethod() {
    try {
      throw new RuntimeException("KaBOOM!");
    }
    catch (RuntimeException exc) {
      System.err.println("runMethod: exception caught, re-throwing.");
      throw exc;
    }
    finally {
      System.err.println("runMethod finally block");
    }
    
  }

}
