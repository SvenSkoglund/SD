package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class ChangingArrayList {
  public static void main(String[] args) {
    ChangingArrayList cal = new ChangingArrayList();
    cal.run();
  }
  
  private void run() {
    ArrayList<String> namesList = new ArrayList<>();
    
    namesList.add("Alice");
    namesList.add("Queen of Hearts");
    namesList.add("Cheshire Cat");
    namesList.add("Mad Hatter");
    namesList.add("Tweedle Dee");
    namesList.add("Tweedle Dum");
    
    System.out.println("There are " + namesList.size() + " elements in the list.");
    System.out.println(namesList);  // calls toString() for each element
    
    // Remove Queen of Hearts and store the String in a variable.
    
    // Output the contents of namesList with System.out.println()
    
    // Output the size of namesList

    // Insert Queen of Hearts between Tweedle Dee and Tweedle Dum
    
    // Output the contents of namesList
    
    // Replace Mad Hatter with Dormouse
    
    // Output the contents of namesList
    
    // Remove Cheshire Cat
    
    System.out.println(namesList);
    
    printMessage(namesList);
  }
  
  // This method uses the contents of your ArrayList
  private void printMessage(ArrayList<String> list) {
    if(list.size() != 5) {
      return;
    }
    String output = "";
    int i = 0, index[] = {0,7,4,2,7};
    int delta[] = {5,0,1,-1,0};
    for (String string : list) {
      output += (char)(string.charAt(index[i]) + delta[i++]);
    }
    for (int j=0; j < list.size(); j++) {
      char c = '\u0000';
      switch(j) {
        case 0: c = (char)(list.get(j).charAt(0) + 24); break;
        case 1: c = list.get(j).charAt(4); break;
        case 2: c = (char)(list.get(j).charAt(1) - 2); break;
        case 3: c = (char)(list.get(j).charAt(1) - 3); break;
        case 4: c = (char)(list.get(j).charAt(12 - 5)); break;
      }
      output += c;
    }
    i=0;
    index = new int[] {2,7,3,11,0};
    delta = new int[] {-33,0,-4,3,-38};
    for(String s : list) {
      output += (char)(s.charAt(index[i]) + delta[i++]);
    }
    System.out.println(output);
  }
}
