package com.skilldistillery.datesandtimes.drills;

import java.time.*;

public class TimeDrill {

	public static void main(String[] args) {
		// Create a LocalDate and a LocalTime representing the current
		// date and time.
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		// Print both out.
		System.out.println("Today: " + today);
		System.out.println("Time now: " + now);
		// Use the LocalTime above to create a LocalTime for 90 minutes in the future,
		// and print it out.
		LocalTime hourHalfFromNow = now.plusMinutes(90);
		System.out.println("Hour and a half from now: " + hourHalfFromNow);
		// What happens if you use your original LocalTime to create a LocalTime for 22
		// hours in the future?
		LocalTime twentyTwoHrs = now.plusHours(22);
		System.out.println("22 hours from now: " + twentyTwoHrs);

		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		LocalDateTime nowDateTimePlus = nowDateTime.plusHours(24);
		System.out.println(nowDateTimePlus);
	}

}
