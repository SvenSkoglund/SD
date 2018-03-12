package com.skilldistillery.listinterface.solutions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.skilldistillery.listinterface.drills.Planet;

public class LinkedListAdding {

  public static void main(String[] args) {
    LinkedListAdding app = new LinkedListAdding();
    app.run();
  }
  
  private void run() {
    // Run the program with ArrayList, and note the time taken.
    // Then change myList refer to a LinkedList, and run again.
    //List<Planet> myList = new ArrayList<>();
    List<Planet> myList = new LinkedList<>();
    fillLargeList(myList);
  }
  
  
  /**
   * This method will fill a List, alternating between adding to the
   * beginning and end. It will also calculate and print the time this
   * operation takes.
   */
  private void fillLargeList(List<Planet> list){
    
    // Get the start time
    LocalDateTime start = LocalDateTime.now();  // You will learn about this class
    
    // fill the list, alternating between beginning and end.
    int numElements = 100_000;
    System.out.println("Adding to " + list.getClass().getSimpleName() + "...");
    for(int i=0; i < numElements; i++) {
      if(i % 2 == 0) {
        list.add(0, new Planet("EvenPlanet", 100, 100));
      }
      else {
        list.add(new Planet("OddPlanet", 100, 100));
      }
    }
    
    // Get the end time
    LocalDateTime end = LocalDateTime.now();
    
    // Duration can calculate time elapsed
    Duration d = Duration.between(start, end);
    System.out.println(d.toMillis() + " milliseconds");
  }
}
