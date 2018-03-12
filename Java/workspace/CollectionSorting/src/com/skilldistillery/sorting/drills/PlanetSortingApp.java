package com.skilldistillery.sorting.drills;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PlanetSortingApp {

  public static void main(String[] args) {
    PlanetSortingApp app = new PlanetSortingApp();
    app.launch();
  }

  private void launch() {
    Set<Planet> planets = new HashSet<>();
    
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
