package com.skilldistillery.setinterface.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NameSeparatorAppTests {

  private NameSeparatorApp sep;

  @Before
  public void setUp() throws Exception {
    sep = new NameSeparatorApp();
  }

  @After
  public void tearDown() throws Exception {
    sep = null;
  }

  @Test
  public void test_parseUniqueNamesFromFile_returns_Set_of_names() {
    Set<String> set = sep.parseUniqueNamesFromFile("names.txt");
    assertNotNull(set);
    assertFalse(set.isEmpty());
  }
  
  @Test
  public void test_getIndexFromLetter_returns_0_for_A_and_25_for_Z() {
    assertEquals(0, sep.getIndexFromLetter('A'));
    assertEquals(25, sep.getIndexFromLetter('Z'));
  }
  
  @Test
  public void test_divideNamesByLetter_returns_nonNull_Set_for_empty_set() {
    List<Set<String>> names = sep.divideNamesByLetter(new HashSet<>());
    assertNotNull(names);
  }
  
  @Test
  public void test_divideNamesByLetter_separates_A_names_to_0() {
    Set<String> set = new HashSet<>();
    set.add("Amie");
    set.add("Alan");
    set.add("Alberto");
    List<Set<String>> names = sep.divideNamesByLetter(set);
    assertNotNull(names);
    assertNotNull(names.get(0));
    Set<String> aNames = names.get(0);
    assertEquals(3, aNames.size());
    
    assertTrue(aNames.contains("Alan"));
    assertTrue(aNames.contains("Amie"));
    assertTrue(aNames.contains("Alberto"));
  }
  
  @Test
  public void test_divideNamesByLetter_separates_A_names_to_0_and_Z_names_to_25() {
    Set<String> set = new HashSet<>();
    set.add("Amie");
    set.add("Alan");
    set.add("Zed");
    set.add("Alberto");
    List<Set<String>> names = sep.divideNamesByLetter(set);
    
    assertNotNull(names);
    assertNotNull(names.get(0));
    Set<String> aNames = names.get(0);
    assertEquals(3, aNames.size());
    
    assertTrue(aNames.contains("Alan"));
    assertTrue(aNames.contains("Amie"));
    assertTrue(aNames.contains("Alberto"));
    
    Set<String> zNames = names.get(25);
    assertEquals(1, zNames.size());
    
    assertTrue(zNames.contains("Zed"));
  }

}
