package com.skilldistillery.unittesting.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Test methods for the TextConverter method toCaps are already complete.
 * 
 * Uncomment each test method in sequence.
 * 
 * As you uncomment a test method, add functionality to TextConverter to
 * meet the test method's requirement. DO NOT ADD EXTRA FUNCTIONALITY.
 * 
 * Note that getting one test to pass may cause subsequent tests to pass. This is fine.
 *
 */
public class TextConverterTestsTDD {
  private TextConverter tc;
  
  @Before
  public void setUp() {
    tc = new TextConverter();
  }
  
  @After
  public void tearDown() {
    tc = null;
  }
  
  @Test
  public void test_toCaps_returns_null_for_null_input() {
    String actual = tc.toCaps(null);
    assertNull(actual);
  }
  
  @Test
  public void test_toCaps_returns_all_caps_version_of_input() {
    String input = "I'm a String ";
    String expected = "I'M A STRING ";
    String actual = tc.toCaps(input);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test_removeOuterWhitespace_returns_null_for_null_input() {
    fail("Implement");
  }
  
//  @Test
//  public void test_removeOuterWhitespace_returns_String_with_outer_whitespace_removed() {
//    
//  }
  
//  @Test
//  public void test_removeOuterWhitespace_returns_String_with_inner_whitespace_intact() {
//    
//  }
  
//  @Test
//  public void test_concatStrings_returns_null_for_null_input() {
//    
//  }
  
//  @Test 
//  public void test_concatStrings_returns_empty_String_for_no_input() {
//    
//  }
  
//  @Test
//  public void test_concatStrings_returns_empty_String_for_empty_String_input() {
//    
//  }
  
//  @Test
//  public void test_concatStrings_returns_single_String_same_length_as_input() {
//    
//  }
  
//  @Test
//  public void test_concatStrings_returns_two_Strings_concatenated_without_extra_whitespace() {
//    
//  }
  
//  @Test
//  public void test_concatStrings_returns_two_Strings_concatenated_with_whitespace_intact() {
//    
//  }
  
}
