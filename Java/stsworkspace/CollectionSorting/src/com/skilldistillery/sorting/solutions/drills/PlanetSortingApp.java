package com.skilldistillery.sorting.solutions.drills;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class PlanetSortingApp {

  public static void main(String[] args) {
    PlanetSortingApp app = new PlanetSortingApp();
    app.launch();
  }

  private void launch() {
//    Set<Planet> planets = new HashSet<>();
    // When we change this to TreeSet and run it, we get:
    // Exception in thread "main" java.lang.ClassCastException: com.skilldistillery.sorting.solutions.drills.Planet cannot be cast to java.lang.Comparable
    // TreeSet tries to cast the Planet object to Comparable, which fails.
    // Once we modify Planet to implement the Comparable interface,
    // the TreeSet works.
    Set<Planet> planets = new TreeSet<>();
    
    planets.add(new Planet("Earth", 149_600_000, 12_756));
    planets.add(new Planet("Jupiter", 778_330_000, 142_984));
    planets.add(new Planet("Mars", 227_940_000, 6_794));
    planets.add(new Planet("Mercury", 57_910_000, 4_880));
    planets.add(new Planet("Neptune", 4_504_000_000L, 49_532));
    planets.add(new Planet("Saturn", 1_429_400_000, 120_536));
    planets.add(new Planet("Uranus", 2_870_990_000L, 51_118));
    planets.add(new Planet("Venus", 108_200_000, 12_103));
    
    printPlanets(planets);
  }
  
  private void printPlanets(Collection<Planet> planets) {
    for (Planet planet : planets) {
      System.out.println(planet);
    }
  }

}
