package com.skilldistillery.enums.drills;

public class DayDrills {

	// Create a method called printDay that takes a Day argument and
	// prints it to the screen with System.out.println.

	// If the day is FRIDAY, SATURDAY, or SUNDAY, print the message
	// "Weekend!"

	public void printDay(Day day) {
		System.out.println(day);
		switch (day) {
		case FRIDAY:
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekend!");
			break;
		default:
			break;

		}
	}

	private void run() {
//	  printDay(Day.FRIDAY);
//	  printDay(Day.SATURDAY);
//	  printDay(Day.SUNDAY);
//	  printDay(Day.MONDAY);
//	  printDay(Day.WEDNESDAY);
//	  printDay(Day.TUESDAY);
//	  
	  for (int i = 0; i < Day.values().length; i++) {
		  System.out.print(Day.values()[i]);
		  if (Day.values()[i].toString().contains("R")) {
			  System.out.println("*");
		  }else {
			  System.out.println();
		  }
		
	  }
  }

	public static void main(String[] args) {
		DayDrills d = new DayDrills();
		d.run();
	}

}
