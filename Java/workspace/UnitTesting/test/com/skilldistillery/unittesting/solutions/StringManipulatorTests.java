package com.skilldistillery.unittesting.solutions;

import static org.junit.Assert.*;

import org.junit.Test;

import com.skilldistillery.unittesting.drills.StringManipulator;

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
  public void test_convertToArray_splits_String_into_array_on_space() {
    StringManipulator sm = new StringManipulator();
    String input = "I am a String.";
    String[] expectedArr = { "I", "am", "a", "String." };
    String[] outArr = sm.convertToArray(input, " ");
    assertNotNull(outArr);
    for (int i = 0; i < outArr.length; i++) {
      assertEquals(expectedArr[i], outArr[i]);
    }
  }
  
  @Test
  public void test_convertToArray_returns_empty_array_for_null_Strings() {
    StringManipulator sm = new StringManipulator();
    String[] outArr = sm.convertToArray(null, " ");
    assertNotNull(outArr);
    assertEquals(0, outArr.length);
    
    outArr = sm.convertToArray("", null);
    assertNotNull(outArr);
    assertEquals(0, outArr.length);
  }

}
