package com.skilldistillery.stringstringbuilder.drills;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SSNMaskerTests {
  SSNMasker masker;

  @Before
  public void setUp() throws Exception {
    masker = new SSNMasker();
  }

  @After
  public void tearDown() throws Exception {
    masker = null;
  }

  @Test
  public void test_maskSSN_returns_ssn_with_first_five_digits_masked_with_X() {
    String ssn = "123-45-6789";
    String masked = masker.maskSSN(ssn);
    String expected = "XXX-XX-6789";
    assertEquals(expected, masked);
    ssn = "666-55-4321";
    masked = masker.maskSSN(ssn);
    expected = "XXX-XX-4321";
  }

}
