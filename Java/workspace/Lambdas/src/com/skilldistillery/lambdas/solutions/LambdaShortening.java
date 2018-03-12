package com.skilldistillery.lambdas.solutions;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

import com.skilldistillery.lambdas.drills.Planet;
import com.skilldistillery.lambdas.drills.PlanetTester;

public class LambdaShortening {

  public static void main(String[] args) {
    
    // -----------------------
    Comparator<Planet> c1 = (Planet p1, Planet p2) -> {
      if(p1.getOrbit() > p2.getOrbit()) {
        return 1;
      }
      else if (p2.getOrbit() > p1.getOrbit()) {
        return -1;
      }
      return 0;
    };
    
    // Replace null with a shortened lambda for c1
    // We can always remove parameter types
    Comparator<Planet> c2 = (p1, p2) -> {
      if(p1.getOrbit() > p2.getOrbit()) {
        return 1;
      }
      else if (p2.getOrbit() > p1.getOrbit()) {
        return -1;
      }
      return 0;
    };
    
    // Or make the long into Long in order to call compareTo
    Comparator<Planet> c3 = (p1, p2) -> {
      return Long.valueOf(p1.getOrbit()).compareTo(p2.getOrbit());
    };
    
    // Or use a ternary (with a secondary ternary.)
    Comparator<Planet> c4 = (p1, p2) -> p1.getOrbit() > p2.getOrbit() ? 
        1 : p1.getOrbit() < p2.getOrbit() ? 
            -1 : 0;
    
    // -----------------------
    Function<Planet, Double> diameterInMiles = (Planet p) -> {
      return p.getDiameter() * 0.621371;
    };
    
    // Remove type and parentheses, and use single statement
    Function<Planet, Double> diam2 = p -> p.getDiameter() * 0.621371;
    
    // -----------------------
    Runnable r = () -> {
      LocalDateTime ldt = LocalDateTime.now();
      System.out.println("Starting at " + ldt);
    };
    
    // Remove the local variable, and put the method call into the System.out.println
    Runnable r2 = () -> System.out.println("Starting at " + LocalDateTime.now());
  
    // ----------------------
    /*
    public interface PlanetTester {
      public boolean test(Planet p);
    }
     */
    PlanetTester planetTester = (Planet p) -> {
      return p.getDiameter() > 40_000;
    };
    
    PlanetTester pt2 = p -> p.getDiameter() > 40_000;
    
    // ----------------------
    /*
    public interface Predicate<T> {
      public boolean test(T p);
    }
     */
    Predicate<Planet> predPlan = (Planet p) -> {
      return p.getDiameter() < 40_000;
    };
    
    PlanetTester predPlan2 = p -> p.getDiameter() < 40_000;
  }

}
