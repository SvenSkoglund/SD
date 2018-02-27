package com.skilldistillery.advancedarrays.drills;

public class VarArgsBand {

  public static void main(String[] args) {
    
    // Run the program, passing a band name and list of members. 
    // Is the output what you expected?
    
    // Can you call the method with zero parameters? Why or why not?

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
