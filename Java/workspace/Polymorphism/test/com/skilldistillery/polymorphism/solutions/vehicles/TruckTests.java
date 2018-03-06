package com.skilldistillery.polymorphism.solutions.vehicles;

import static org.junit.Assert.*;

import org.junit.Test;

public class TruckTests {

  @Test
  public void test_calculateRegistrationFee_returns_rate_times_purchasePrice_for_under_six_wheels() {
    Truck t = new Truck(1000.00, "Make", "Model", 2000, 5, 40, 50);
    assertEquals(100.00, t.calculateRegistrationFee(0.1), 0.001);
  }
  
  @Test
  public void test_calculateRegistrationFee_returns_rate_times_1_point_5_purchasePrice_for_six_or_more_wheels() {
    Truck t = new Truck(1000.00, "Make", "Model", 2000, 6, 40, 50);
    assertEquals(150.00, t.calculateRegistrationFee(0.1), 0.001);
    //Test even more wheels
    t.setNumberOfWheels(8);
    assertEquals(150.00, t.calculateRegistrationFee(0.1), 0.001);
  }

}
