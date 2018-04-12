package com.skilldistillery.lambdas.solutions;

import java.util.List;

public class PlanetFilteringLab {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities.getPlanets();

    printPlanets(planets);
    
    List<Planet> aNames = PlanetUtilities.filterPlanets(planets, p -> p.getName().toUpperCase().contains("A"));
    
    printPlanets(aNames);
  }
  
  private static void printPlanets(List<Planet> planets) {
    System.out.println("********PLANETS********");
    for(Planet p : planets) {
      System.out.println(p);
    }
  }

}
