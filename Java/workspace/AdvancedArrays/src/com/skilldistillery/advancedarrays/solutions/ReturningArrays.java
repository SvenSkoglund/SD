package com.skilldistillery.advancedarrays.solutions;

public class ReturningArrays {
  public static void main(String[] args) {
    
    // Call the createBand method from main() and store the array reference in a variable.
    PopStar[] sync = createBand();
    
    // Pass the array to the allSing method.
    // Call the method allSing
    allSing(sync);
  }
  
  // TODO: 
  // Add a method called
  // public static PopStar[] createBand().
  public static PopStar[] createBand() {
    // Move the code that creates and fills a PopStar array into this method.
    // Be sure to return the array from the method 
    // (since it's return type is PopStar[]).
    
    // Instantiate an Array to hold PopStar objects
    PopStar[] sync = new PopStar[5];
    
    // Create PopStar instances and add them to the array
    PopStar jt = new PopStar();
    jt.name = "Justin";
    
    PopStar l = new PopStar();
    l.name = "Lance";
    
    PopStar jc = new PopStar();
    jc.name = "JC";
    
    PopStar jf = new PopStar();
    jf.name = "Joey";
    
    PopStar c = new PopStar();
    c.name = "Chris";
    
    sync[0] = jt;
    sync[1] = l;
    sync[2] = jc;
    sync[3] = jf;
    sync[4] = c;
    
    return sync;
  }
  
  
  public static void allSing(PopStar[] stars) {
    // Loop through the array and call each PopStar's sing() method
    for (int i = 0; i < stars.length; i++) {
      PopStar popStar = stars[i];
      popStar.sing();
    }
  }
}
