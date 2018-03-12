package com.skilldistillery.lambdas.drills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTranslation {
  
  private static void printInts(List<Integer> intList, Comparator<Integer> c) {
    Collections.sort(intList, c);
    System.out.println(intList);
  }

  public static void main(String[] args) {
    List<Integer> ints = new ArrayList<>();
    ints.add(-5);
    ints.add(16);
    ints.add(45);
    ints.add(32);
    ints.add(0);
    
    // This comparator reverses the natural order or Integers
    // by comparing the second to the first.
    Comparator<Integer> reverseComparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    };
    printInts(ints, reverseComparator);
    
    Collections.shuffle(ints);
    
    // 1. Create a lambda with the functionality of reverseComparator
    Comparator<Integer> reverseComparatorLambda = null;
    // 2. Call printInts, passing the List and your lambda
    
    /*
     public interface IntegerChecker {
        boolean test(Integer i);
     }
     */
    IntegerChecker isDivisibleBy3Checker = new IntegerChecker() { 
      @Override
      public boolean test(Integer t) {
        return t % 3 == 0;
      }
    };
    
    System.out.println("2 is divisible by 3: " + isDivisibleBy3Checker.test(2));
    System.out.println("12 is divisible by 3: " + isDivisibleBy3Checker.test(12));
    
    // 3. Create a lambda for isDivisibleBy3Predicate
    IntegerChecker isDivBy3Lambda = null;
    
    // 4. Print the results of isDivBy3Lambda.test(376) and isDivBy3Lambda.test(144);
  }
}
