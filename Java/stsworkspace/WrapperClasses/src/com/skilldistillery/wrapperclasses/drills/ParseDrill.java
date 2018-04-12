package com.skilldistillery.wrapperclasses.drills;

public class ParseDrill {
  
  public static void main(String[] args) {
    ParseDrill drill = new ParseDrill();
    drill.go();
  }

  private void go() {
    // Write statements to determine which strings can be parsed,
    // and if so print the result, when parsed to:
    
    // Example:
    System.out.println(Integer.parseInt("42")); // No problem, 42
    
    // int:
    // "1000000000"
    // "-1000000000"
    // "+1000000000"
    // "  1000000000   "
    // "0x123abc"
    // "1.0"
    // "1,000,000,000"
    // "1_000_000_000"
    // "10000000000"
    // ""
    // null
    
    // long:
    // "1000000000"
    // "10000000000"
    // "10000000000L"

    // float:
    // "10000000000"
    // "10000000000F"
    // "314e-2"
    // "3.14D"
    // "  3.14   \n"
    // null
    
    // boolean:
    // "true"
    // "TrUe"
    // "false"
    // "no"
    // "giraffe"
    // null
    
  }
  
  

}
