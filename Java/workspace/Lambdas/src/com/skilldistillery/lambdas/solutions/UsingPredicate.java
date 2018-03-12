package com.skilldistillery.lambdas.solutions;

import java.util.function.Predicate;

public class UsingPredicate {

  public static void main(String[] args) {
    // Declare and define a Predicate<String> that tests whether
    // an input String ends with "!!"
    
    Predicate<String> isLoud = s -> s.endsWith("!!");
    
    // Declare and define a Predicate<String> that tests whether
    // an input String is all uppercase.
    Predicate<String> allCaps = s -> {
      String upperCase = s.toUpperCase();
      return s.equals(upperCase);
    };
    
    // Test your two Predicates by calling their test methods with some Strings.
    System.out.println(isLoud.test("Pssst!"));
    System.out.println(isLoud.test("Pssst!!!"));
    
    System.out.println(allCaps.test("Hi"));
    System.out.println(allCaps.test("HI"));
  }

}
