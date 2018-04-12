package com.skilldistillery.sorting.examples;

import java.util.Arrays;

public class ArraySortingApp {

  public static void main(String[] args) {
    String[] animalArray = { "Cat",
        "catfish",
        "caterpillar",
        "Frog",
        "Dog",
        "fruit bat",
        "Giraffe" };
    
    for (String animal : animalArray) {
      System.out.println(animal);
    }
    
    System.out.println("== Sorted ==");
    Arrays.sort(animalArray);
    for (String animal : animalArray) {
      System.out.println(animal);
    }
    
    System.out.println(animalArray);
    // [Ljava.lang.String;@3d4eac69
    System.out.println(Arrays.deepToString(animalArray));
    // [Cat, Dog, Frog, Giraffe, caterpillar, catfish, fruit bat]


  }

}
