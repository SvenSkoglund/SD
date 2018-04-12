package com.skilldistillery.advancedarrays.solutions;

public class PopStar {
  public String name;
  public void sing() {
    // Have the PopStar print their name to the screen, as part of some kind of lyric.
    // Be creative.
    System.out.print("My name is " + name);
    int numVowels = name.length();
    System.out.print(", h");
    for(int i = 0; i < numVowels; i++) {
      System.out.print("o");
    }
    System.out.println("!!");
  }
}
