package com.skilldistillery.sorting.examples;

import java.util.Comparator;

public class PlanetReverseDiameterComparator implements Comparator<Planet> {
  public int compare(Planet a, Planet b) {
    if (a.getDiameter() < b.getDiameter())
      return 1; // Change these to reverse the sort
    else if (a.getDiameter() > b.getDiameter())
      return -1;
    else
      return a.getName().compareTo(b.getName());
  }
}
