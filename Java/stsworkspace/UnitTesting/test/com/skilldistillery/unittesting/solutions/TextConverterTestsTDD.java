package com.skilldistillery.unittesting.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Test methods for the TextConverter method toCaps are already complete.
 * 
 * Uncomment each test method in sequence.
 * 
 * As you uncomment a test method, add functionality to TextConverter to
 * meet the test method's requirement.
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
    assertNull(tc.removeOuterWhitespace(null));
  }
  
  @Test
  public void test_removeOuterWhitespace_returns_String_with_outer_whitespace_removed() {
    assertEquals("a string", tc.removeOuterWhitespace("\t a string   "));
  }
  
  @Test
  public void test_removeOuterWhitespace_returns_String_with_inner_whitespace_intact() {
    assertEquals("a \t string", tc.removeOuterWhitespace("\t a \t string   "));
  }
  
  @Test
  public void test_concatStrings_returns_null_for_null_input() {
    assertNull(tc.concatStrings(null));
  }
  
  @Test 
  public void test_concatStrings_returns_empty_String_for_no_input() {
    String expected = "";
    assertEquals(expected, tc.concatStrings());
  }
  
  @Test
  public void test_concatStrings_returns_empty_String_for_empty_String_input() {
    String expected = "";
    assertEquals(expected, tc.concatStrings());
  }
  
  @Test
  public void test_concatStrings_returns_single_String_same_length_as_input() {
    String input = "input";
    String output = tc.concatStrings(input);
    assertNotNull(output);
    assertEquals(5, output.length());
  }
  
  @Test
  public void test_concatStrings_returns_two_Strings_concatenated_without_extra_whitespace() {
    String input1 = "input 1";
    String input2 = "input 2";
    String output = tc.concatStrings(input1, input2);
    assertEquals("input 1input 2", output);
  }
  
  @Test
  public void test_concatStrings_returns_two_Strings_concatenated_with_whitespace_intact() {
    String input1 = " input 1 ";
    String input2 = " input 2 ";
    String output = tc.concatStrings(input1, input2);
    assertEquals(" input 1  input 2 ", output);
  }
  
}
