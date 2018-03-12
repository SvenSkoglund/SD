package com.skilldistillery.sorting.drills;

import java.util.Comparator;

public class StringIgnoreCaseComparator implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    // Use String's own compareTo:
    return o1.toUpperCase().compareTo(o2.toUpperCase());
  }

}
