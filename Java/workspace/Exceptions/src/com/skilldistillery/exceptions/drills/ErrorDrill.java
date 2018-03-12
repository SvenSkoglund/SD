package com.skilldistillery.exceptions.drills;

public class ErrorDrill {
  private static int callCount;

  public static void main(String[] args) {
    ErrorDrill drill = new ErrorDrill();
    drill.callMe();
  }

  private void callMe() {
    // 1. Increment callCount
    // 2. Print out callCount
    // 3. Call callMe()
    // 4. Print "callMe finished."
  }

}
