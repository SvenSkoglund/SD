package com.skilldistillery.listinterface.solutions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.skilldistillery.listinterface.drills.Planet;

public class LinkedListPositionalAccess {

  public static void main(String[] args) {
    LinkedListPositionalAccess app = new LinkedListPositionalAccess();
    app.run();

  }
  
  private void run() { 
    // Run the program with ArrayList, and note the time taken.
    // Then change myList refer to a LinkedList, and run again.
    //List<Planet> list = new ArrayList<>();
    List<Planet> list = new LinkedList<>();
    
    fillLargeList(list);
    
    // Get an element
    getFromList(list);
  }
  
  private void getFromList(List<Planet> list) {
    int size = list.size();
    int index = size * 3 / 4;
    System.out.println("Getting element from " 
          + list.getClass().getSimpleName() 
          + " index " + index);
    
    // Get the start time
    LocalDateTime start = LocalDateTime.now();  // You will learn about this class
    
    list.get(index);
    
    // Get the end time
    LocalDateTime end = LocalDateTime.now();
    
    // Duration can calculate time elapsed
    Duration d = Duration.between(start, end);
    System.out.println(list.getClass().getSimpleName() + " " + d.toMillis() + " milliseconds");
  }
  
  private void fillLargeList(List<Planet> list) {
    int numElements = 10_000_000;
    System.out.println("Adding to " + list.getClass().getSimpleName() + "...");
    for(int i=0; i < numElements; i++) {
        list.add(new Planet("Planet", 100, 100));
    }
  }

}
