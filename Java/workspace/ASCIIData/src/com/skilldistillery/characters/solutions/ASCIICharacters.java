package com.skilldistillery.characters.solutions;

public class ASCIICharacters {

  public static void main(String[] args) {
    // In a for loop, iterate through the number 0 to 127, 
    // printing each number and the char representation 
    // of that number (by casting it to a char) on a separate line.

    for(int i=0; i<128; i++) {
      System.out.println(i + " " + (char)i);
    }
  }

}
