package com.skilldistillery.sorting.examples;

import java.util.Comparator;
import java.util.Map;

public class USStatePopulationComparator implements Comparator<String> {
  // Field to store a reference to a map
  private Map<String,USState> states;
  
  // Constructor requires a Map<String,USState reference to put in the field
  public USStatePopulationComparator(Map<String,USState> states) {
    this.states = states;
  }

  @Override
  public int compare(String abbr1, String abbr2) {
    // compare uses keys to access objects whose properties define the order
    USState state1 = states.get(abbr1);
    USState state2 = states.get(abbr2);
    if (state1.getPopulation() > state2.getPopulation()) {
      return 1;
    }
    else if (state1.getPopulation() < state2.getPopulation()) {
      return -1;
    }
    return 0;
  }
}
