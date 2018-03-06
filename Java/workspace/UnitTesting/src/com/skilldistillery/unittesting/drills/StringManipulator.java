package com.skilldistillery.unittesting.drills;

public class StringManipulator {
  public String addExclamations(String str, int numExc) {
    return addCharacters(str, '!', numExc);
  }
  
  public String addCharacters(String str, char c, int numChars) {
    String output = str;
    if(str == null) {
      output = "";
    }
    for(int i = 0; i < numChars; i++) {
      output += c;
    }
    return output;
  }
  
  public String[] convertToArray(String inStr, String split) {
    if(inStr == null || split == null) {
      return new String[0];
    }
    return inStr.split(split);
  }
}
