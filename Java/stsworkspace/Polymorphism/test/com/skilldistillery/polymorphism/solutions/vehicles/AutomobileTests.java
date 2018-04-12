package com.skilldistillery.polymorphism.solutions.vehicles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutomobileTests {

  private Automobile auto;
  
  @Before
  public void setUp() {
    auto = new Automobile(1000, "Make", "Model", 1995, 4, 100);
  }

  @After
  public void tearDown() {
    auto = null;
  }

  @Test
  public void test_calculateRegistrationFee_returns_rate_times_purchasePrice() {
    assertEquals(100.0, auto.calculateRegistrationFee(0.10), 0.001);
  }

}
