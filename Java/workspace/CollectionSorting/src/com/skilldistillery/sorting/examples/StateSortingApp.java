package com.skilldistillery.sorting.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StateSortingApp {

  public static void main(String[] args) {
    Map<String,USState> states = new TreeMap<>();
    states.put("CO", new USState("CO","Colorado","Denver","Aug 1 1876",5_607_154));
    states.put("CA", new USState("CA","California","Sacramento","Sep 9 1850",39_536_653));
    states.put("NC", new USState("NC","North Carolina","Raleigh","Nov 21 1789",10_273_419));
    states.put("ND", new USState("ND","North Dakota","Bismarck","Nov 2 1889",755_393));
    states.put("NY", new USState("NY","New York","Albany","Jul 26 1788",19_849_399 ));
    states.put("NJ", new USState("NJ","New Jersey","Trenton","Dec 18 1787", 9_005_644));
    states.put("TX", new USState("TX","Texas","Austin","Dec 29 1845", 28_304_596));
    states.put("AK", new USState("AK","Alaska","Juneau","Jan 3 1959",739_795));
    states.put("WY", new USState("WY","Wyoming","Cheyenne","Jul 10 1890",579_315));

    printStates(states);
    
    Set<String> abbrevs = states.keySet();
    // A Set can't be sorted, but a List can
    List<String> keys = new ArrayList<>(abbrevs);
    // Pass map reference to the comparator's constructor
    Comparator<String> comp = new USStatePopulationComparator(states);
    // Sort keys with the comparator.
    keys.sort(comp);

    // Use the sorted keys to access the values
    System.out.println("== Sorted by population ==");
    for (String abbrev : keys) {
      USState state = states.get(abbrev);
      System.out.println(abbrev+": "+state.getName() +", population "+state.getPopulation());
    }
  }

  private static void printStates(Map<String, USState> states) {
    Set<String> keys = states.keySet();
    for (String key : keys) {
      USState state = states.get(key);
      System.out.println(key+": "+state.getName()+", population "+state.getPopulation());
    }
  }
  

}
