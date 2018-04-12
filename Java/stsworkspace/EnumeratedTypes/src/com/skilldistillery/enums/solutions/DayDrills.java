package com.skilldistillery.enums.solutions;

public class DayDrills {

  // Create a method called printDay that takes a Day argument and
  // prints it to the screen with System.out.println.
  @SuppressWarnings("incomplete-switch")
  private void printDay(Day day) {
    // If the day is FRIDAY, SATURDAY, or SUNDAY, print the message
    // "Weekend!"
    System.out.println(day);
    switch(day) {
      case FRIDAY:
      case SATURDAY:
      case SUNDAY:
        System.out.println("Weekend!");
    }
    
    // or
    if(day == Day.SATURDAY || day == Day.SUNDAY || day.equals(Day.FRIDAY)){
      System.out.println("Equals weekend!");
    }

  }
  private void run() {
    // call printDay with several Day values.
    printDay(Day.WEDNESDAY);
    printDay(Day.SUNDAY);
    printDay(Day.FRIDAY);
  }

  public static void main(String[] args) {
    DayDrills d = new DayDrills();
    d.run();
  }

}
