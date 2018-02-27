package com.skilldistillery.advancedarrays.solutions;

public class MultiForEach {

  public static void main(String[] args) {
    String string2d[][] = new String[3][];
    
    string2d[0] = new String[] {"Robert", "Jimmy", "John", "John Paul"};
    string2d[1] = new String[] {"Bruce", "Nicko", "Janick", "Adrian", "Dave", "Steve"};
    string2d[2] = new String[] {"Axl", "Slash", "Izzy", "Steven", "Duff"};
    
    // Call printBands.
    printBands(string2d);
  }
  
  // Add a method called printBands that takes one parameter and 
  // prints each array using nested foreach loops.
  public static void printBands(String[][] bands) {
    for (String[] band : bands) {
      for (String member : band) {
        System.out.print(member + " ");
      }
      System.out.println();
    }
  }
}
