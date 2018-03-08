package com.skilldistillery.polymorphism.labs.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoatTests {

  @Test
  public void test_calculateRegistrationFee_returns_rate_times_purchasePrice_for_length_less_than_30() {
    Boat b = new Boat(1000.00, "Boat", 45.0, 29);
    assertEquals(100.0, b.calculateRegistrationFee(0.1), 0.001);
  }


  // Add method for length >= 30
  @Test
 public void test_calculateRegistrationFee_returns_rate_times_double_times_two_times_purchasePrice_for_length_30_or_more() {
	    Boat b = new Boat(1000.00, "Boat", 45.0, 30);
	    assertEquals(200.0, b.calculateRegistrationFee(0.1), 0.001);

 }
}
