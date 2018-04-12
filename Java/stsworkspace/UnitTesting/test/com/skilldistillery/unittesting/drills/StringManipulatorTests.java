package com.skilldistillery.unittesting.drills;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringManipulatorTests {

  @Test
  public void test_addExclamations_add_correct_number_of_exclamations() {
    StringManipulator sm = new StringManipulator();
    String input = "hello";
    String expected = "hello!!!";
    String output = sm.addExclamations(input, 3);
    assertEquals(expected, output);
  }
  
  @Test
  public void test_addCharacters_add_correct_number_of_character() {
    StringManipulator sm = new StringManipulator();
    String input = "hello";
    String expected = "hello!!!";
    String output = sm.addCharacters(input, '!', 3);
    assertEquals(expected, output);
  }
  
  @Test
  public void test_convertToArray_splits_String_into_array_on_char() {
    fail("implement");
  }
  
  @Test
  public void test_convertToArray_returns_empty_array_for_null_String() {
    fail("implement");
  }

}
