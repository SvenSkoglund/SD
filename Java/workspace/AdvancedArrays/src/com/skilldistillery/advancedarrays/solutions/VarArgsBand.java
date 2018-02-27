package com.skilldistillery.advancedarrays.solutions;

public class VarArgsBand {

  public static void main(String[] args) {
    
    // Run the program, passing a band name and list of members. 
    // Is the output what you expected?
    bandMembers("The Copyrightles", "George", "Paul", "Ringo", "John");
    
    // Can you call the method with zero parameters? Why or why not?
    // No. The first parameter is a String, so there must always be at least
    // one String. There can be zero or more members.
    int numMembers = bandMembers("Nobody"); // Passing zero members after the bandName
    System.out.println("The number of members in Nobody is " + numMembers);
  }
  
  public static int bandMembers(String bandName, String... members) {
    int numMembers = members.length;
    System.out.println("Members of " + bandName);
    for (String m : members) {
      System.out.println("\t" + m);
    }
    return numMembers;
  }

}
