package com.skilldistillery.daopattern.solutions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.daopattern.drills.President;
import com.skilldistillery.daopattern.drills.PresidentDAO;
import com.skilldistillery.daopattern.drills.PresidentProcessor;

public class PresidentProcessorTests {
  
  PresidentProcessor p;

  @Before
  public void setUp() throws Exception {
    // Change null to an instance of your mock object
    PresidentDAO dao = new MockPresidentDAO();
    p = new PresidentProcessor(dao);
  }

  @After
  public void tearDown() throws Exception {
    p = null;
  }

  @Test
  public void test_filterByParty_returns_all_Whigs_presidents() {
    List<President> presidents = p.filterByParty("Whig");
    assertEquals(2, presidents.size());
    assertEquals(2, presidents.get(0).getTermNumber());
    assertEquals(3, presidents.get(1).getTermNumber());
  }
  
  // Write a test for filterByParty to see if it returns an empty
  // list when no presidents are found.
  @Test
  public void test_filterByParty_returns_empty_list_when_no_Presidents_found() {
    List<President> presidents = p.filterByParty("XXXX");
    assertNotNull(presidents);
    assertEquals(0, presidents.size());
  }
  
  // Write a test for filterByLastName to see if it returns all 
  // Presidents with last name.
  @Test
  public void test_filterByLastName_returns_C_lastName() {
    List<President> presidents = p.filterByLastName("C");
    assertEquals(1, presidents.size());
    assertEquals(1, presidents.get(0).getTermNumber());
  }
  
  // Write a test for filterByName to see if it returns an empty
  // list when no presidents are found.
  @Test
  public void test_filterByLastName_returns_empty_list_when_no_Presidents_found() {
    List<President> presidents = p.filterByLastName("XXXX");
    assertNotNull(presidents);
    assertEquals(0, presidents.size());
  }
}
