package com.skilldistillery.listinterface.solutions;

import java.util.List;

public class PlanetList {

  public static void main(String[] args) {
    PlanetList p = new PlanetList();
    p.run();
  }

  private void run() {
    List<Planet> planets = PlanetUtilities.getPlanets();
    System.out.println(planets);
    
    // Create a new Planet object using the Planet constructor call below.
    // new Planet("Jupiter", 778_330_000, 142_984)
    Planet p = new Planet("Jupiter", 778_330_000, 142_984);
    
    // Print true or false for whether the List contains this planet
    System.out.println("Planets contains " + p.getName() + ": "  + planets.contains(p));
    
    // If this was not what you expected, change the Planet class to support
    // comparison to other Planets. (Hint: what method does Java use to see if
    // one Object equals another Object?)
    // --> This requires generating equals(Object) in Planet.
    // --> Generating equals(Object) requires generating hashCode().
    
    // Try to find the index of this planet in the List, and print out that index.
    System.out.println("Index is " + planets.indexOf(p));
    
    // Now remove Jupiter by passing the object reference you created, and
    // print true or false for whether removing worked.
    System.out.println("Removing " + p.getName() + " worked: " 
          + planets.remove(p));

    
  }
}
