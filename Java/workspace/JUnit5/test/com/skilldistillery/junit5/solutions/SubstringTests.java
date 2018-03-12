package com.skilldistillery.junit5.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SubstringTests {

  @Test
  @DisplayName("substring returns chars 1 to 5 (exclusive)")
  void testSubstring() {
    String s = "abcdefg";
    assertEquals("bcde", s.substring(1, 5));
  }
  
  @Test
  @DisplayName("Test that beginIndex is inclusive and endIndex is exclusive")
  void testSubstringEnd() {
    assertEquals("abcdefg", "abcdefg".substring(0, 7));
  }
  
  @Test
  @DisplayName("beginIndex negative, endIndex larger than length, beginIndex > endIndex throws Exception")
  void testExceptionThrowing() {
    String s = "abcdefg";
    
    assertThrows(IndexOutOfBoundsException.class, () -> {s.substring(-1, 0);} );
    assertThrows(IndexOutOfBoundsException.class, () -> s.substring(0, 8) );
    Exception e = assertThrows(IndexOutOfBoundsException.class, () -> {s.substring(2, 1);} );
    assertEquals("StringIndexOutOfBoundsException", e.getClass().getSimpleName());
  }

}
