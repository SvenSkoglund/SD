package com.skilldistillery.advancedarrays.solutions;

public class ArrayOfObjects {

  public static void main(String[] args) {
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
    
    // Call the method allSing
    allSing(sync);
  }
  
  public static void allSing(PopStar[] stars) {
    // Loop through the array and call each PopStar's sing() method
    for (int i = 0; i < stars.length; i++) {
      PopStar popStar = stars[i];
      popStar.sing();
    }
  }

}
