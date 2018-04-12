package com.skilldistillery.datesandtimes.solutions.drills;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class IntervalDrill {

  public static void main(String[] args) {
    IntervalDrill drill = new IntervalDrill();
    drill.launch();
  }

  private void launch() {
    // Create a LocalDate representing the start date of your cohort.
    LocalDate cohortStart = LocalDate.of(2018, Month.FEBRUARY, 26);
    // Create a LocalDate representing today.
    LocalDate today = LocalDate.now();
    // Print out both dates.
    System.out.println(cohortStart+" - " + today);
    // Create a Period object representing the interval between the two dates, and print it.
    Period daysSoFar = Period.between(cohortStart, today);
    System.out.println(daysSoFar);
    
    // Create a LocalTime representing when you arrived today.
    LocalTime gotHere = LocalTime.of(8, 15);
    // Create a LocalTime representing now.
    LocalTime now = LocalTime.now();
    // Print out both times.
    System.out.println(gotHere + " - " + now);
    // Create a Duration object for the interval between now and when you arrived, and print it.
    Duration howLong = Duration.between(gotHere, now);
    System.out.println(howLong);
    
    // What happens if you try to create a Duration representing
    // the interval between your cohort start date and today?
    // This compiles:
    Duration d = Duration.between(cohortStart, today);
    // ... but throws a runtime exception: a Duration represents
    // seconds and nanoseconds; a LocalDate has no time information,
    // only year, month, and day.
    System.out.println(d);
  }

}
