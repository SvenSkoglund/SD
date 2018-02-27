package com.skilldistillery.characters.solutions;

import java.util.Scanner;

public class AlphaNumCheck2 {

  public static void main(String[] args) {
    run();
  }
  
  public static void run() {
    Scanner sc = new Scanner(System.in);
    
    // Make an instance of this class
    AlphaNumCheck2 anc = new AlphaNumCheck2();
    
    System.out.print("Enter a word or sentence: ");
    String input = anc.getSentence(sc);
    
    boolean result = anc.checkAlphaNumSpaceSentence(input);

    if(result) {
      System.out.println("The sentence contains only letters, numbers, or space.");
    }
    else {
      System.out.println("The sentence contains non-letters, numbers, or space.");
    }
    sc.close();
  }
  
  public String getSentence(Scanner sc) {
    return sc.nextLine();
  }
  
  public boolean checkAlphaNumSpaceSentence(String input) {
    char[] chars = input.toCharArray();
    boolean result = true;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if(c >= 65 && c <= 90 
          || c >= 'a' && c <= 'z'
          || c == 32
          || c >= '0' && c <= '9') {
        continue;
      }
      result = false;
      break;
    }
    
    return result;
  }

}
