package com.skilldistillery.sorting.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PlanetListingApp {

  public static void main(String[] args) {
    PlanetListingApp app = new PlanetListingApp();
    app.launch();
  }

  private void launch() {
    List<Planet> planets = new ArrayList<>();
    
    planets.add(new Planet("Earth", 149_600_000, 12_756));
    planets.add(new Planet("Jupiter", 778_330_000, 142_984));
    planets.add(new Planet("Mars", 227_940_000, 6_794));
    planets.add(new Planet("Mercury", 57_910_000, 4_880));
    planets.add(new Planet("Neptune", 4_504_000_000L, 49_532));
    planets.add(new Planet("Saturn", 1_429_400_000, 120_536));
    planets.add(new Planet("Uranus", 2_870_990_000L, 51_118));
    planets.add(new Planet("Venus", 108_200_000, 12_103));
    
    System.out.println("== Original Order ==");
    printPlanets(planets);
    
    Collections.sort(planets);
    System.out.println("== Sorted by Natural Sort Order ==");
    printPlanets(planets);
    
    PlanetDiameterComparator comp = new PlanetDiameterComparator();
    Collections.sort(planets, comp);

    System.out.println("== Sorted Using PlanetDiameterComparator ==");
    printPlanets(planets);

    System.out.println("== Sorted Using PlanetReverseDiameterComparator ==");
    planets.sort(new PlanetReverseDiameterComparator());
    printPlanets(planets);
    
    System.out.println("== Sorted by Natural Sort Order ==");
    Collections.sort(planets);
    printPlanets(planets);
    
    System.out.println("== Rotated by Three Elements ==");
    // Move three elements from the end of the list to the beginning
    Collections.rotate(planets, 3);
    printPlanets(planets);

    System.out.println("== Reversed ==");
    Collections.reverse(planets);
    printPlanets(planets);
    
    System.out.println("== Shuffled ==");
    Collections.shuffle(planets);
    printPlanets(planets);
    

    


  }
  
  private void printPlanets(List<Planet> planets) {
    for (Planet planet : planets) {
      System.out.println(planet);
    }
  }

}
