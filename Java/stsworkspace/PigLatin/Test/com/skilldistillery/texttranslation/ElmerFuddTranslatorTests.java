package com.skilldistillery.texttranslation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElmerFuddTranslatorTests {
	ElmerFuddTranslator eft;

	@Before
	public void setUp() throws Exception {
		eft = new ElmerFuddTranslator();
	}

	@After
	public void tearDown() throws Exception {
		eft = null;
	}

	@Test
	public void test_tanslateWord_null_input_returns_empty_string() {
		String input = null;
		String expected = "";
		String actual = eft.translateWord(input);
		assertEquals(expected, actual);
	}

	@Test
	public void test_translateWord_with_word_containing_r_converts_to_w() {
		String input = "rabbit";
		String expected = "wabbit";
		String actual = eft.translateWord("rabbit");
		assertEquals(expected, actual);
	}

	@Test
	public void test_translateWord_with_word_containing__no_r_returns_unchanged() {
		String input = "duck";
		String expected = "duck";
		String actual = eft.translateWord("duck");
		assertEquals(expected, actual);
	}

	@Test
	public void test_translateWord_with_word_containing_l_converts_to_w() {
		String input = "follow";
		String expected = "fowwow";
		String actual = eft.translateWord("follow");
		assertEquals(expected, actual);

	}
	@Test
	public void test_translateWord_with_word_containing_l_and_w_converts_to_w() {
		String input = "rascal";
		String expected = "wascaw";
		String actual = eft.translateWord("rascal");
		assertEquals(expected, actual);

	}
	@Test
	public void test_translateText_with_word_containing_l_and_w_converts_to_w() {
		String input = "Curse you rascally rabbit";
		String expected = "Cuwse you wascawwy wabbit";
		String actual = eft.translateWord("Curse you rascally rabbit");
		assertEquals(expected, actual);

	}
}
