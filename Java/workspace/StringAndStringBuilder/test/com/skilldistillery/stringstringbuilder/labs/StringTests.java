package com.skilldistillery.stringstringbuilder.labs;

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
  
  @Test
  public void test_charAt_4_returns_character_o() {
    fail("not implemented");
  }
  
  @Test
  public void test_endsWith_d_exclamation_returns_true() {
    fail("not implemented");
  }

  @Test
  public void test_endsWith_d_returns_false() {
    fail("not implemented");
  }
  
  @Test
  public void test_indexOf_World_returns_6() {
    fail("not implemented");
  }
  
  @Test
  public void test_indexOf_Planet_returns_minus_1() {
    fail("not implemented");
  }
  
  @Test
  public void test_lastIndexOf_l_returns_10() {
    fail("not implemented");
  }
  
  @Test
  public void test_isEmpty_returns_false() {
    fail("not implemented");
  }
  
  @Test
  public void test_replace_World_Planet_returns_HelloPlanetbang_and_leaves_original_string_unchanged() {
    fail("not implemented");
  }
  
  @Test
  public void test_concat_Planet_returns_HelloWorldbangPlanet_and_leaves_original_string_unchanged() {
    fail("not implemented");
  }
  
  @Test
  public void test_substring_first_index_inclusive_and_second_index_exclusive_and_leaves_original_string_unchanged() {
    fail("not implemented");
  }
  
  @Test
  public void test_substring_with_first_index_returns_to_end_of_string_and_leaves_original_string_unchanged() {
    fail("not implemented");
  }
  
  @Test
  public void test_trim_strips_all_leading_and_trailing_spaces_leaving_internal_spaces_and_leaves_original_string_unchanged() {
    fail("not implemented");
  }
  
}
