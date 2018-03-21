package com.skilldistillery.junit5.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTests {
	String s;

	@BeforeEach
	void setUp() throws Exception {
		s = "abcdefg";
	}

	@AfterEach
	void tearDown() throws Exception {
		s = null;
	}

	// Test that "abcdefg".substring(1, 5) returns "bcde".
	@DisplayName("Test that abcdefg.substring(1, 5) returns bcde")
	@Test
	void test() {

		assertEquals("bcde", s.substring(1, 5));
	}

	// Test that "abcdefg".substring(0, 7) returns "abcdefg".
	@DisplayName("abcdefg = s.substring(0,7)")
	@Test
	void test2() {

		assertEquals("abcdefg", s.substring(0, 7));
	}
//	Test that substring throws IndexOutOfBoundsException
//	if the beginIndex is negative.
//	if endIndex is larger than the length of this String object.
//	if beginIndex is larger than endIndex.
	@DisplayName("Test that substring throws IndexOutOfBoundsException")
	@Test
	void test3() {
		Exception e = assertThrows (IndexOutOfBoundsException.class, () -> s.substring(-1,4));
assertEquals("StringIndexOutOfBoundsException", e.getClass().getSimpleName());
		e = assertThrows (IndexOutOfBoundsException.class, () -> s.substring(1,20));
		assertEquals("StringIndexOutOfBoundsException", e.getClass().getSimpleName());
		e = assertThrows (IndexOutOfBoundsException.class, () -> s.substring(3,1));
		assertEquals("StringIndexOutOfBoundsException", e.getClass().getSimpleName());
	}
}
