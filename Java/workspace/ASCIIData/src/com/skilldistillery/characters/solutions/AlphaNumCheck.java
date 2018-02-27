package com.skilldistillery.characters.solutions;

import java.util.Scanner;

public class AlphaNumCheck {

  public static void main(String[] args) {
    run();
  }
  
  public static void run() {
    Scanner sc = new Scanner(System.in);
    
    // Make an instance of this class
    AlphaNumCheck anc = new AlphaNumCheck();
    
    System.out.print("Enter a word or sentence: ");
    String input = anc.getSentence(sc);
    
    boolean result = anc.checkAlphaSentence(input);

    if(result) {
      System.out.println("The sentence contains only letters.");
    }
    else {
      System.out.println("The sentence contains non-letters.");
    }
    sc.close();
  }
  
  public String getSentence(Scanner sc) {
    return sc.nextLine();
  }
  
  public boolean checkAlphaSentence(String input) {
    char[] chars = input.toCharArray();
    boolean result = true;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if(c >= 65 && c <= 90 || c >= 'a' && c <= 'z') {
        continue;
      }
      result = false;
      break;
    }
    
    return result;
  }

}
