package com.skilldistillery.innerclasses.drills;

import java.time.*;

public class InstanceInitalizerDrill {

  public static void main(String[] args) throws InterruptedException {
    // Paste the anonymous Runnable instantiation here
	  Runnable rTimed = new Runnable() {
		  private LocalDateTime time;

		  // instance initializer
		  {
		    time = LocalDateTime.now(); // Gets the current moment in time
		    System.out.println("Instance created at " + time);

		  }

		  public void run() {
		    // Calculate time between
		    Duration d = Duration.between(time, LocalDateTime.now());
		    System.out.println("Running " + d + " later...");
		  }
		};
    // Call run() on the instance to see what LocalDateTime and 
    // Duration print.
		Thread.sleep(10000);
		Thread.
		rTimed.run();

  }

}
