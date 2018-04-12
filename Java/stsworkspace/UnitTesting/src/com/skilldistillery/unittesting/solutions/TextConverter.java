package com.skilldistillery.unittesting.solutions;

public class TextConverter {
  // To learn more about String methods, go to
  // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
  
  public String toCaps(String input) {
    return input == null ? input : input.toUpperCase();
  }
  
  public String removeOuterWhitespace(String input) {
    // This will use String trim() method to remove whitespace
    if(input == null) {
      return null;
    }
    return input.trim();
  }
  
  public String concatStrings(String... strings) {
    // This will use String concat(String) method on the strings array
    if(strings == null) {
      return null;
    }
    String result = "";
    for (String string : strings) {
      result = result.concat(string);
    }
    return result;
  }
}
