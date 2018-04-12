package com.skilldistillery.characters.solutions;

public class SuppChars {

  public static void main(String[] args) {
    // Write the String "\uD83C\uDCA1" to the screen.
    System.out.println("\uD83C\uDCA1");
    
    // Add the statement System.out.println(Character.toChars(0x1f0a1));
    System.out.println(Character.toChars(0x1f0a1));
    
    // Use Character.toChars() to output the code points 0x1F600 through 0x1F64F
    // Add a newline every 16 characters.
    int count = 0;
    for (int i = 0x1F600; i <= 0x1F64F; i++) {
      System.out.print(Character.toChars(i));
      count++;
      if(count % 16 == 0) {
        System.out.println();
        count = 0;
      }
    }
    
  }

}
