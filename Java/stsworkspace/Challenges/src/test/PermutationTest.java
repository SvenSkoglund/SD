package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import problems.StringPermutation;

class PermutationTest {
	StringPermutation sp = new StringPermutation();
	
	@BeforeEach
	void setUp() throws Exception {
		StringPermutation sp = new StringPermutation();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(true, sp.checkForPermutation("12340580", "08504321"));
	}
	@Test
	void test2() {
		assertEquals(false, sp.checkForPermutation("1230580", "08504321"));
	}
	@Test
	void test3() {
		assertEquals(true, sp.checkForPermutation("Sven20394", "9Sv320ne4"));
	}
	@Test
	void test4() {
		assertEquals(false, sp.checkForPermutation(null, "08504321"));
	}
	@Test
	void test5() {
		assertEquals(false, sp.checkForPermutation(null, null));
	}
	@Test
	void test6() {
		assertEquals(false, sp.checkForPermutation("123456789", "1234567899"));
	}
	@Test
	void test7() {
		assertEquals(true, sp.checkForPermutation("!)@(#*%&$#", "#$&%*#(@)!"));
	}
}
