package com.skilldistillery.setinterface.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

  public static void main(String[] args) {
    // Assign an ArrayList to c1
    Collection<String> c1 = new ArrayList<>();
    
    // Add four Strings to c1 - your choice of Strings.
    c1.add("Java");
    c1.add("Forever");
    c1.add("Mother");
    c1.add("Father");
    
    // Call addAll(c1) on c1; you are trying to add the elements of c1
    // to what is already in c1. Store the result of addAll in a variable
    // and print it to the screen.
    boolean result = c1.addAll(c1);
    System.out.println("Result of addAll is " + result);
    
    // Collection classes have good toString() methods, so we will use
    // System.out.println() to see the contents.
    System.out.println("Contents of c1: " + c1);
    
    
    // Repeat the process with c2, using a HashSet
    Collection<String> c2 = new HashSet<>();
    c2.add("A");
    c2.add("B");
    c2.add("C");
    c2.add("D");
    
    result = c2.addAll(c2);
    System.out.println("Result of addAll is " + result);
    
    System.out.println("Contents of c2: " + c2);
  }

}
