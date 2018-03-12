package com.skilldistillery.innerclasses.drills;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PrintSortedPlanetsLocal {

  public void printPlanets() {
    // Change this class to use a local class, rather than a member class
    Set<Planet> planets = new TreeSet<>(new PlanetComparator());

    planets.add(new Planet("Mercury", 57_910_000, 4_880));
    planets.add(new Planet("Venus", 108_200_000, 12_103));
    planets.add(new Planet("Earth", 149_600_000, 12_756));
    planets.add(new Planet("Mars", 227_940_000, 6_794));
    planets.add(new Planet("Jupiter", 778_330_000, 142_984));
    planets.add(new Planet("Saturn", 1_429_400_000, 120_536));
    planets.add(new Planet("Uranus", 2_870_990_000L, 51_118));
    planets.add(new Planet("Neptune", 4_504_000_000L, 49_532));

    for (Planet planet : planets) {
      System.out.println(planet);
    }
  }

  private class PlanetComparator implements Comparator<Planet> {
    public int compare(Planet a, Planet b) {
      if (a.getDiameter() < b.getDiameter())
        return -1;
      else if (a.getDiameter() > b.getDiameter())
        return 1;
      else
        return a.getName().compareTo(b.getName());
    }
  }

  public static void main(String[] args) {
    PrintSortedPlanetsLocal p = new PrintSortedPlanetsLocal();
    p.printPlanets();
  }
}
