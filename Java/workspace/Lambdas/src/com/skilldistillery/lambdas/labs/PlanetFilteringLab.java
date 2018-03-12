package com.skilldistillery.lambdas.labs;

import java.util.List;


public class PlanetFilteringLab {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities.getPlanets();

    printPlanets(planets);
        
  }
  
  private static void printPlanets(List<Planet> planets) {
    System.out.println("********PLANETS********");
    for(Planet p : planets) {
      System.out.println(p);
    }
  }

}
