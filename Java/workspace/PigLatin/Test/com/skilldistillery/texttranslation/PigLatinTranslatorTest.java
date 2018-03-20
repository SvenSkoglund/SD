package com.skilldistillery.texttranslation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PigLatinTranslatorTest {
	PigLatinTranslator t;

	@Before
	public void setUp() throws Exception {
		t = new PigLatinTranslator();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void test_translateWord_returns_empty_String_for_null_input(){
	  assertEquals("",t.translateWord(null));
	}

	@Test
	public void test_translateWord_for_word_starting_with_consonant_and_vowel_moves_consonant_to_end_of_word_and_adds_ay(){
	  assertEquals("appyHay", t.translateWord("Happy"));
	}

}
