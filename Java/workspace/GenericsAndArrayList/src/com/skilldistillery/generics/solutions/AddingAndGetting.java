package com.skilldistillery.generics.solutions;

import java.util.ArrayList;

public class AddingAndGetting {

  public static void main(String[] args) {
    AddingAndGetting ag = new AddingAndGetting();
    ag.run();
  }
  
  private void run() {
    ArrayList<String> strings = new ArrayList<>();
    
    // Output the list's size.
    System.out.println("Size is " + strings.size());
    
    // Add first names of several of your classmates.
    strings.add("Belinda");
    strings.add("Jane");
    strings.add("Charlotte");
    strings.add("Gina");
    
    // Output the list's size again.
    System.out.println("Size is now " + strings.size());
    
    // Use a for loop and get(index) to iterate through the list and print each name in uppercase letters.
    for (int i = 0; i < strings.size(); i++) {
      String n = strings.get(i);
      System.out.println(n.toUpperCase());
    }
    
    outputLastItem(strings);  // Stretch goal: Finish the method below.
     
  }
  
  private void outputLastItem(ArrayList<String> list) {
    // Finish this method to output the last item in the list in lowercase.
    String last = list.get(list.size() - 1);
    System.out.println(last.toLowerCase());
  }

}
