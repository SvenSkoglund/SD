package com.skilldistillery.generics.drills;

import java.util.ArrayList;

import com.skilldistillery.generics.solutions.Container;

public class GenericContainer {

  public static void main(String[] args) {
    // Declare and instantiate a Container to hold a Character object.
    Container <Character> charCont = new Container <>();
    // Call the object's set method and pass in 'A'.
   charCont.set('a');
    // get the Character from the object and pass it to printChar.
   printChar(charCont.get());
    // Try to set an Integer or String into the object.
/*    charAL = 5;
    charAL = "S";*/
    // Create an ArrayList to hold Integer objects.
    ArrayList <Integer> AL = new ArrayList<>();
    // Optional: can you create an ArrayList to hold Container<Character> objects?
    ArrayList <Container<Character>> arrayListOfCharacterContainers = new ArrayList <>();
  }
  
  private static void printChar(Character c) {
    System.out.println("The character is " +  c);
  }

}
