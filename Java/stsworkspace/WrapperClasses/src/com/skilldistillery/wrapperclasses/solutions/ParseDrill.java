package com.skilldistillery.wrapperclasses.solutions;

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
    System.out.println(Integer.parseInt("1000000000")); // No problem, 1000000000
    // "-1000000000"
    System.out.println(Integer.parseInt("-1000000000")); // No problem, -1000000000
    // "+1000000000"
    System.out.println(Integer.parseInt("+1000000000")); // No problem, 1000000000
    // "  1000000000   "
//    System.out.println(Integer.parseInt("  1000000000   ")); // NumberFormatException
    // "0x123abc"
//    System.out.println(Integer.parseInt("0x123abc")); // NumberFormatException
    // Note that a hexadecimal (or other base integer) can be parsed by passing
    // a radix to the overloaded Integer.parseInt; omit the "0x" prefix.
    System.out.println(Integer.parseInt("123abc",16)); // NumberFormatException
    // "1.0"
//    System.out.println(Integer.parseInt("1.0")); // NumberFormatException
    // "1,000,000,000"
//  System.out.println(Integer.parseInt("1,000,000,000")); // NumberFormatException
    // "1_000_000_000"
//  System.out.println(Integer.parseInt("1_000_000_000")); // NumberFormatException
    // "10000000000"
//  System.out.println(Integer.parseInt("10000000000")); // NumberFormatException
    // ""
//  System.out.println(Integer.parseInt("")); // NumberFormatException
    // null
//  System.out.println(Integer.parseInt(null)); // NumberFormatException
    
    // long:
    // "1000000000"
    System.out.println(Long.parseLong("1000000000")); // No problem, 1000000000
    // "10000000000"
    System.out.println(Long.parseLong("10000000000")); // No problem, 10000000000
    // "10000000000L"
    // 'l' or 'L' as a type indicator are not permitted here, unlike a literal
//    System.out.println(Long.parseLong("10000000000L")); // NumberFormatException

    // float:
    // "10000000000"
    System.out.println(Float.parseFloat("10000000000")); // No problem, 1.0E10
    // "10000000000F"
    System.out.println(Float.parseFloat("10000000000F")); // No problem, 1.0E10
    // "314e-2"
    System.out.println(Float.parseFloat("314e-2")); // No problem, 3.14
    // "3.14D"
    System.out.println(Float.parseFloat("3.14D")); // No problem, 3.14
    // "  3.14   \n"
    System.out.println(Float.parseFloat("  3.14   \n")); // No problem, 3.14
    // null
//    System.out.println(Float.parseFloat(null)); // NullPointerException
   
    // boolean:
    // "true"
    System.out.println(Boolean.parseBoolean("true")); // No problem, true
    // "TrUe"
    System.out.println(Boolean.parseBoolean("TrUe")); // No problem, true
    // "false"
    System.out.println(Boolean.parseBoolean("false")); // No problem, false
    // "no"
    System.out.println(Boolean.parseBoolean("no")); // No problem, false
    // "giraffe"  
    System.out.println(Boolean.parseBoolean("giraffe")); // No problem, false
    // null  
    System.out.println(Boolean.parseBoolean(null)); // No problem, false
    
  }
  
  

}
