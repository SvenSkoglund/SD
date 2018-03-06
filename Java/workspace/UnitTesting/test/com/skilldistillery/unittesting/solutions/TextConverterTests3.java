package com.skilldistillery.unittesting.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.skilldistillery.unittesting.drills.TextConverter;

public class TextConverterTests3 {
  @Test
  public void test_toCaps_returns_null_for_null_input() {
    TextConverter tc = new TextConverter();
    String actual = tc.toCaps(null);
    assertNull(actual);
    // since assertEquals handles nulls, we could do...
    assertEquals(null, actual);
  }
  
  @Test
  public void test_toCaps_returns_all_caps_version_of_input() {
    TextConverter tc = new TextConverter();
    String input = "I'm a String ";
    String expected = "I'M A STRING ";
    String actual = tc.toCaps(input);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test_removeOuterWhitespace_returns_null_for_null_input() {
    
  }
  
  @Test
  public void test_removeOuterWhitespace_returns_String_with_outer_whitespace_removed() {
    
  }
  
  @Test
  public void test_removeOuterWhitespace_returns_String_with_inner_whitespace_intact() {
    
  }
  
  @Test
  public void test_concatStrings_returns_null_for_null_input() {
    
  }
  
  @Test 
  public void test_concatStrings_returns_empty_String_for_no_input() {
    
  }
  
  @Test
  public void test_concatStrings_returns_empty_String_for_empty_String_input() {
    
  }
  
  @Test
  public void test_concatStrings_returns_single_String_same_length_as_input() {
    
  }
  
  @Test
  public void test_concatStrings_returns_two_Strings_concatenated_without_extra_whitespace() {
    
  }
  
  @Test
  public void test_concatStrings_returns_two_Strings_concatenated_with_whitespace_intact() {
    
  }
}
