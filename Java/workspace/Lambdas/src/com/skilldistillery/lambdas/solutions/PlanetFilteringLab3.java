package com.skilldistillery.lambdas.solutions;

import java.util.List;

public class PlanetFilteringLab3 {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities4.getPlanets();

    printPlanets(planets);
    
    List<Planet> aNames = PlanetUtilities4.filterPlanets(planets, p -> p.getName().toUpperCase().contains("A"));
    
    printPlanets(aNames);
    
    aNames = PlanetUtilities4.filterPlanets(planets, 
        p -> p.getName().toUpperCase().contains("A"),
        p -> p.getName().toUpperCase().contains("Y")
        );
    
    printPlanets(aNames);
  }
  
  private static void printPlanets(List<Planet> planets) {
    System.out.println("********PLANETS********");
    for(Planet p : planets) {
      System.out.println(p);
    }
  }

}
