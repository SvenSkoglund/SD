package com.skilldistillery.unittesting.solutions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringTests {
  private String s;

  @Before
  public void setUp() {
    s = "Hello World!";
  }

  @Test
  public void test_contains_returns_true_if_input_is_part_of_String() {
    assertTrue(s.contains("Hello"));
  }
  
  @Test
  public void test_contains_returns_false_if_input_is_not_part_of_String() {
    assertFalse(s.contains("hello"));
  }

  @Test
  public void test_length_returns_String_length() {
    assertEquals(12, s.length());
  }

  @Test
  public void test_startsWith_returns_true_when_String_starts_with_input() {
    assertTrue(s.startsWith("Hello"));
  }
  
  @Test
  public void test_startsWith_returns_false_when_String_does_not_start_with_input() {
    assertFalse(s.startsWith("hello"));
  }
  
  @Test
  public void test_toUpperCase_uppercases_String() {
    assertEquals("HELLO WORLD!", s.toUpperCase());
  }
}
