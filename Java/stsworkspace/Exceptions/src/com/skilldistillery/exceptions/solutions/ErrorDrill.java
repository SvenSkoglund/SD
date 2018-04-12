package com.skilldistillery.exceptions.solutions;

public class ErrorDrill {
  private static int callCount;

  public static void main(String[] args) {
    ErrorDrill drill = new ErrorDrill();
    drill.callMe();
  }

  private void callMe() {
    // 1. Increment callCount
    callCount++;
    // 2. Print out callCount
    System.out.println(callCount);
    // 3. Call callMe()
    this.callMe();
    // 4. Print "callMe finished."
    System.out.println("callMe finished.");
    // This recursive call - a method calling itself - in this example
    // is unlimited by our program logic.  Before the first call to callMe()
    // can finish, the second call must finish, so the first one is waiting
    // on the call stack.  The second call can't finish until the third, and
    // so on.
    // So before we ever get to the first call's "callMe finished", the JVM
    // runs out of space on the method call stack and generates an Error.
  }

}
