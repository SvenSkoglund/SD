package com.skilldistillery.sorting.drills;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class StringComparingApp {

  public static void main(String[] args) {
    Set<String> animals = new TreeSet<>(); // Natural sort order
//    Comparator<String> comp = new StringIgnoreCaseComparator();
//    Set<String> animals = new TreeSet<>(comp); // our sort order
    
    animals.add("Cat");
    animals.add("catfish");
    animals.add("caterpillar");
    animals.add("Frog");
    animals.add("Dog");
    animals.add("fruit bat");
    animals.add("Giraffe");

    printAnimals(animals);
  }

  private static void printAnimals(Collection<String> animals) {
    for (String animal : animals) {
      System.out.println(animal);
    }
    
  }
  

}
