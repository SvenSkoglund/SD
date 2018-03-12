package com.skilldistillery.exceptionsjunit.solutions;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.exceptionsjunit.reference.Calculator;

public class CalculatorTests {
  private Calculator calc;
  
  @Before
  public void setUp() {
    calc = new Calculator();
  }
  
  @After
  public void tearDown() {
    calc = null;
  }
  
  // Integer division by zero is illegal and will throw ArithmeticException.
  // Add a test case for this to CalculatorTests using expected.
  @Test(expected=ArithmeticException.class)
  public void test_division_by_zero_throws_ArithmeticException() {
    calc.divide(5, 0);
  }
  
  // Add the same test using try/catch
  public void test_division_by_zero_throws_ArithmeticException_try_catch() {
    try {
      calc.divide(5, 0);
      fail("Expected ArithmeticException");
    }
    catch (Exception e) {}
    
    try {
      calc.divide(-5, -0); // we can put a - in front of zero
      fail("Expected ArithmeticException");
    }
    catch (Exception e) {}
  }
  
  @Test
  public void test_add_adds_two_numbers() {
    assertEquals(6, calc.add(1, 5));
  }
  
  @Test
  public void test_subtract_subtracts_second_from_first() {
    assertEquals(7, calc.subtract(4, -3));
    assertEquals(2, calc.subtract(5, 3));
  }
  
  @Test
  public void test_multiply_multiplies_both_numbers() {
    assertEquals(12, calc.multiply(3, 4));
    assertEquals(-12, calc.multiply(3, -4));
  }
  
  @Test
  public void test_divide_int_divides_numerator_by_denominator() {
    assertEquals(2, calc.divide(6, 3));
    assertEquals(-2, calc.divide(6, -3));
  }
  
  @Test
  public void test_divide_int_loses_remainder() {
    assertEquals(2, calc.divide(7, 3));
  }
  
  @Test
  public void test_divide_double_divides_numerator_by_denominator() {
    assertEquals(2.0, calc.divide(6.0, 3.0), 0.01);
    assertEquals(-2.0, calc.divide(6.0, -3.0), 0.01);
  }
}
