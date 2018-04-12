package com.skilldistillery.lambdas.solutions;

import java.util.List;

public class FilterPlanets {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities2.getPlanets();
    // Filter the list of Planets for those whose 
    // diameter is less than 40_000.
    List<Planet> filtered = PlanetUtilities2.filterPlanets(planets, p -> p.getDiameter() < 40_000);
    // Print the list of small planets.
    System.out.println(filtered);
  }

}
