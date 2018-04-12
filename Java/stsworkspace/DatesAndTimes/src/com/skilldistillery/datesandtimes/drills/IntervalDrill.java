package com.skilldistillery.datesandtimes.drills;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.UnsupportedTemporalTypeException;

public class IntervalDrill {

	public static void main(String[] args) {
		IntervalDrill drill = new IntervalDrill();
		drill.launch();
	}

	private void launch() {
		// Create a LocalDate representing the start date of your cohort.
		LocalDate start = LocalDate.of(2018, 2, 26);
		// Create a LocalDate representing today.
		LocalDate today = LocalDate.now();
		// Print out both dates.
		System.out.println(start);
		System.out.println(today.getDayOfWeek());
		// Create a Period object representing the interval between the two dates, and
		// print it.
		Period timeInSchool = Period.between(start, today);
		System.out.println(timeInSchool);
		// Create a LocalTime representing when you arrived today.
		LocalTime arrrivedToday = LocalTime.of(8, 30);
		// Create a LocalTime representing now.
		LocalTime now = LocalTime.now();
		// Print out both times.
		System.out.println(arrrivedToday);
		System.out.println(now);
		// Create a Duration object for the interval between now and when you arrived,
		// and print it.
		Duration timeAtSchoolToday = Duration.between(arrrivedToday, now);
		System.out.println(timeAtSchoolToday);
		// What happens if you try to create a Duration representing
		// the interval between your cohort start date and today?
		Serializable timeInSchool2;
		try {
			timeInSchool2 = Duration.between(start, today);
		}
		catch (UnsupportedTemporalTypeException e) {
			timeInSchool2 = Period.between(start, today);
		}
		System.out.println(timeInSchool2);
	}

}
