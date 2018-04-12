package com.skilldistillery.lambdas.solutions;

import java.util.List;

public class PlanetFilteringLab2 {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities3.getPlanets();

    printPlanets(planets);
    
    List<Planet> aNames = PlanetUtilities3.filterPlanets(planets, p -> p.getName().toUpperCase().contains("A"));
    
    printPlanets(aNames);
  }
  
  private static void printPlanets(List<Planet> planets) {
    System.out.println("********PLANETS********");
    for(Planet p : planets) {
      System.out.println(p);
    }
  }

}
