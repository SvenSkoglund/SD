package com.skilldistillery.generics.solutions;

import java.util.ArrayList;

public class GenericContainer {

  public static void main(String[] args) {
    
    // Declare and instantiate a Container to hold a Character object.
    Container<Character> cont = new Container<>();
    
    // Call the object's set method and pass in 'A'.
    cont.set('A');  // autoboxing
    
    // get the Character from the object and pass it to printChar.
    printChar(cont.get());
    
    // Try to set an Integer or String into the object.
    //cont.set("a");          // String will not work
    //cont.set(new Integer(1)); // Integer will not work
    
    // Create an ArrayList to hold Integer objects.
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    // Optional: can you create an ArrayList to hold Container<Character> objects?
    ArrayList< Container<Character> > contList = new ArrayList<>();
  }
  
  private static void printChar(Character c) {
    System.out.println("The character is " +  c);
  }

}
