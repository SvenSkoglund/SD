package com.skilldistillery.generics.examples;

import java.util.ArrayList;

public class DangerousArrayList {

  public static void main(String[] args) {
    ArrayList listOfInts = new ArrayList();
    listOfInts.add(2);
    listOfInts.add(4);
    listOfInts.add(6);
    listOfInts.add(8);
    listOfInts.add("Who do we appreciate?");
    sumList(listOfInts);
  }
  
  public static int sumList(ArrayList list) {
    int sum = 0;
    for (int i=0; i < list.size(); i++) {
      // Cast to Integer because that's what the method expects
      Integer value = (Integer) list.get(i);
    }
    
    return sum;
  }
}
