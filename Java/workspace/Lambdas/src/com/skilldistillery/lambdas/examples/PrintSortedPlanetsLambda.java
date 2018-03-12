package com.skilldistillery.lambdas.examples;

import java.util.Collections;
import java.util.List;

public class PrintSortedPlanetsLambda {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities.getPlanets();

    /*
    // Passing anonymous instance
    Collections.sort(planets, new Comparator<Planet>() {
      public int compare(Planet a, Planet b) {
        return a.getOrbit() > b.getOrbit() ? 1 : -1;
      }
    });
    */
    
    // Passing lambda
    Collections.sort(planets,
        (Planet a, Planet b) -> { return a.getOrbit() > b.getOrbit() ? 1 : -1; } );

    for (Planet planet : planets) {
      System.out.println(planet);
    }
  }
}