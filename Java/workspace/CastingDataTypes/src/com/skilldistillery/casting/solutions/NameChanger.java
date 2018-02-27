package com.skilldistillery.casting.solutions;

public class NameChanger {

  /**
   * Calculate a numeric value for the sum of the input String's characters.
   * 
   * @param input a word
   * @return a numeric value - the sum of this String's characters
   */
  public int calculateNumericValue(String input) {
    int sum = 0;
    char[] charArray = input.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      char c = charArray[i];
      sum += c;
    }
    return sum;
  }
  
  /** 
   * Add 3 to each character in the input String. For example Ann is transformed to
   * 285.
   * @param input
   * @return
   */
  public String transformString(String input) {
    String result = "";
    char[] charArray = input.toCharArray();
    for (char c : charArray) {
      c = (char)(c + 3);
      result += c;
    }
    return result;
  }
}
