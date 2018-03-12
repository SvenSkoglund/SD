package com.skilldistillery.sorting.solutions.labs;

import java.util.Comparator;

public class PlanetReverseOrderComparator implements Comparator<Planet> {

  @Override
  public int compare(Planet o1, Planet o2) {
    long orbit1 = o1.getOrbit();
    long orbit2 = o2.getOrbit();
    // With if-else if-else:
//    if (orbit1 < orbit2) { // return 1 for < instead of >
//      return 1;
//    }
//    else if (orbit1 > orbit2) {
//      return -1;
//    }
//    else {
//      return 0;
//    }
    // With ternary operator:
    return orbit1 < orbit2 ? 1
                           : orbit1 > orbit2 ? -1
                                             : 0;
  }

}
