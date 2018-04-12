package com.skilldistillery.exceptionsjunit.solutions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.exceptionsjunit.reference.BadInputException;
import com.skilldistillery.exceptionsjunit.reference.StringReplacer;

public class StringReplacerTests {
	StringReplacer sr;
	
	@Before
	public void setUp(){
		sr = new StringReplacer();
	}
	
	@After
	public void tearDown(){
		sr = null;
	}
	
	@Test
	public void test_replaceString_replaces_input(){
		String input = "I am a String and an Object";
		String matchStr = "a ";
		String replacement = "###";
		String expected = "I am ###String and an Object";
		
		try {
			String output = sr.replaceString(input, matchStr, replacement);
			assertEquals(expected, output);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
  public void test_replaceChar_replaces_input(){
    String input = "I am a String and an Object";
    char match = 'a';
    char replacement = '#';
    String expected = "I #m # String #nd #n Object";
    
    try {
      String output = sr.replaceChar(input, match, replacement);
      assertEquals(expected, output);
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
	
	@Test
  public void test_replaceString_throws_BadInputException_on_null_inputs() {
    try {
      sr.replaceString("", "", null);
      fail("Expected exception");
    }
    catch (BadInputException e) {}
    try {
      sr.replaceString("", null, "");
      fail("Expected exception");
    }
    catch (BadInputException e) {}
    try {
      sr.replaceString(null, "", "");
      fail("Expected exception");
    }
    catch (BadInputException e) {}
  }
	
	@Test(expected=BadInputException.class)
	public void test_replaceChar_throws_BadInputException_on_null_input() throws BadInputException {
	  sr.replaceChar(null, 'a', 'b');
	}
}
