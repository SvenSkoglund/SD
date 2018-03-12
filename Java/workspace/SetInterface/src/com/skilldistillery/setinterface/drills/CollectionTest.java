package com.skilldistillery.setinterface.drills;

import java.util.Collection;

public class CollectionTest {

  public static void main(String[] args) {
    // Assign an ArrayList to c1
    Collection<String> c1 = null;
    
    // Add four Strings to c1 - your choice of Strings.
    
    // Call addAll(c1) on c1; you are trying to add the elements of c1
    // to what is already in c1. Store the result of addAll in a variable
    // and print it to the screen.
    
    // Collection classes have good toString() methods, so we will use
    // System.out.println() to see the contents.
    System.out.println("Contents of c1: " + c1);
    
    
    // Repeat the process with c2, using a HashSet
    Collection<String> c2 = null;

    
    System.out.println("Contents of c2: " + c2);
  }

}
