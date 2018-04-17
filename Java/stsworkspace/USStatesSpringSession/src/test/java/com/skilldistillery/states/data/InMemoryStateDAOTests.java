package com.skilldistillery.states.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
  
  @Test
  public void test_getNextState_returns_next_State() {
    State st = new State("AL", "Alabama", null, null, null, 1);
    State s = dao.getNextState(st);
    assertNotNull(s);
    assertEquals("AK", s.getAbbreviation());
    assertEquals("Alaska", s.getName());
  }
  
  @Test
  public void test_getNextState_returns_first_State_when_at_end() {
    State st = new State("WY", "Wyoming", null, null, null, 1);
    State s = dao.getNextState(st);
    assertNotNull(s);
    assertEquals("AL", s.getAbbreviation());
    assertEquals("Alabama", s.getName());
  }
  
  @Test
  public void test_getPreviousState_returns_prev_State() {
    State st = new State("AK", "Alaska", null, null, null, 1);
    State s = dao.getPreviousState(st);
    assertNotNull(s);
    assertEquals("AL", s.getAbbreviation());
    assertEquals("Alabama", s.getName());
  }
  
  @Test
  public void test_getPreviousState_returns_last_State_when_at_beginning() {
    State st = new State("AL", "Alabama", null, null, null, 1);
    State s = dao.getPreviousState(st);
    assertNotNull(s);
    assertEquals("WY", s.getAbbreviation());
    assertEquals("Wyoming", s.getName());
  }
}
