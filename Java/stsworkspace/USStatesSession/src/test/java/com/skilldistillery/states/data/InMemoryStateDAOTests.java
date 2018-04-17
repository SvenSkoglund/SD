package com.skilldistillery.states.data;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InMemoryStateDAOTests {
  
  private InMemoryStateDAO dao = new InMemoryStateDAO();
  
  @Before
  public void setUp(){
    dao = new InMemoryStateDAO();
  }

  @Test
  public void test_getStateByAbbreviation_returns_State() {
    State st = dao.getStateByAbbreviation("AR");
    assertEquals("AR", st.getAbbreviation());
    assertEquals("Arkansas", st.getName());
  }
  
  @Test
  public void test_getStateByName_returns_State() {
    State st = dao.getStateByName("Arkansas");
    assertEquals("AR", st.getAbbreviation());
    assertEquals("Arkansas", st.getName());
  }
}
