package com.skilldistillery.polymorphism.labs.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehicleTests {

  @Test
  public void test_calculateRegistrationFee_returns_0() {
    Vehicle v = new Vehicle(1000.00);
    //assertEquals(0.0, v.calculateRegistrationFee(0.15), 0.0);
  }

}
