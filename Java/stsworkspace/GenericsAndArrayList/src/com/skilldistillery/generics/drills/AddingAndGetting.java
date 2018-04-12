package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class AddingAndGetting {

  public static void main(String[] args) {
    AddingAndGetting ag = new AddingAndGetting();
    ag.run();
  }
  
  private void run() {
    ArrayList<String> strings = new ArrayList<>();
    
    // Output the list's size.
    System.out.println(strings.size());
    // Add first names of several of your classmates.
   strings.add("Mark");
   strings.add("Megan");
   strings.add("Drew");
    // Output the list's size again.
   System.out.println(strings.size());
    // Use a for loop and get(index) to iterate through the list and print each name in uppercase letters.
   
   for (int i = 0 ; i < strings.size() ; i++) {
	   System.out.println(strings.get(i).toUpperCase());
   }
    outputLastItem(strings);  // Stretch goal: Finish the method below.
  }
  
  private void outputLastItem(ArrayList<String> list) {
    // Finish this method to output the last item in the list in lowercase.
	  int lastIndex = list.size()-1;
	    System.out.println(list.get(lastIndex).toLowerCase());

  }

}
