package com.skilldistillery.datesandtimes.solutions.drills;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDrill2 {

  public static void main(String[] args) {
    // Create a LocalDate and a LocalTime representing the current
    // date and time.
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();
    
    // Print both out.
    System.out.println(today + ", " + now);
    
    // Use the LocalTime above to create a LocalTime for 90 minutes in the future, and print it out.
    LocalTime later = now.plusMinutes(90);
    System.out.println(later);

    // What happens if you use your original LocalTime to create a LocalTime for 22 hours in the future?
    // Answer: LocalTime wraps the hours around the clock.
    later = now.plusHours(22);
    System.out.println(later);
    
    // Create a `LocalDateTime` for the current date and time.
    LocalDateTime rightNow = LocalDateTime.now();
    System.out.println(rightNow);
    // What happens if you use the `LocalDateTime` above to create a `LocalDateTime` for 22 hours in the future?
    LocalDateTime tomorrow = rightNow.plusHours(22);
    // Answer: LocalDateTime wraps around the clock to the next day.
    System.out.println(tomorrow);
    
  }

}
