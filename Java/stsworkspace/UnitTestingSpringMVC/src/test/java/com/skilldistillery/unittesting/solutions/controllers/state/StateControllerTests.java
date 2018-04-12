package com.skilldistillery.unittesting.solutions.controllers.state;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.unittesting.controllers.state.MockStateDAO;
import com.skilldistillery.unittesting.data.State;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"StateControllerTests-context.xml"})
@WebAppConfiguration
public class StateControllerTests {
  @Autowired
  private WebApplicationContext wac;
  
  @Autowired
  private MockStateDAO dao;

  private MockMvc mockMvc;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }
  
  @After
  public void tearDown() {
    // Reset to origin list of states
    dao.reset();
  }
  
  // TODO: Complete the test to check that "WEB-INF/result.jsp" is the result
  //       of modelAndView.getViewName();
  @Test
  public void test_GET_GetStateDO_with_name_param_sets_view_WEBINF_resultJSP() {
    try {
      MvcResult result = mockMvc.perform(
          get("/GetStateData.do")
            .param("name", "Colorado"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      // Complete the test
      assertEquals(modelAndView.getViewName(), "WEB-INF/result.jsp");
      // Same test with Hamcrest matchers.
      assertThat(modelAndView, 
          hasProperty("viewName", is("WEB-INF/result.jsp"))
      );
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  @Test
  public void test_GET_GetStateDO_with_name_param_adds_state_to_model() {
    try {
      MvcResult result = mockMvc.perform(
          get("/GetStateData.do")
            .param("name", "Colorado"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      // Use Hamcrest matchers
      ModelMap map = modelAndView.getModelMap();
      State st = (State) map.get("state");
      assertThat(st, allOf(
          hasProperty("name", is("Colorado")),
          hasProperty("abbreviation", is("CO")),
          hasProperty("capital", is("Denver")),
          hasProperty("latitude", is("39.74001")),
          hasProperty("longitude", is("-104.992259")),
          hasProperty("capitalPopulation", is(600158))
          ));
     
      // without hamcrest matchers
      assertEquals("Colorado", st.getName());
      assertEquals("CO", st.getAbbreviation());
      assertEquals("Denver", st.getCapital());
      assertEquals("39.74001", st.getLatitude());
      assertEquals("-104.992259", st.getLongitude());
      assertEquals(600158, st.getCapitalPopulation());
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  // TODO: add a test for GET with the "abbr" parameter and value "MI"
  //       sets the view WEB-INF/result.jsp
  @Test
  public void test_GET_GetStateDO_with_abbr_param_sets_view_WEBINF_resultJSP() {
    try {
      MvcResult result = mockMvc.perform(
          get("/GetStateData.do")
            .param("abbr", "MI"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      // Use Hamcrest matchers
      assertThat(modelAndView, 
          hasProperty("viewName", is("WEB-INF/result.jsp"))
      );
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  // TODO: add a test for GET with the "abbr" parameter and value "MI"
  //       adds the State to the model.
  //       Use Hamcrest matchers for testing the "state" in the model.
  //
  //       See InMemoryStateDAO for the expected values.
  @Test
  public void test_GET_GetStateDO_with_abbr_param_adds_state_to_model() {
    try {
      MvcResult result = mockMvc.perform(
          get("/GetStateData.do")
            .param("abbr", "MI"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      ModelMap map = modelAndView.getModelMap();
      State st = (State) map.get("state");
      assertThat(st, allOf(
          hasProperty("name", is("Michigan")),
          hasProperty("abbreviation", is("MI")),
          hasProperty("capital", is("Lansing")),
          hasProperty("latitude", is("42.73194")),
          hasProperty("longitude", is("-84.552249")),
          hasProperty("capitalPopulation", is(114297))
          ));
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  // TODO: Complete the test for POSTing a new State object
  //      * @Autowire the StateDAO as a field in this class, StateControllerTests
  //      * Perform a post() to "NewState.do" with all required State parameters
  //      * Return a MvcResult object and test that the view is WEB-INF/result.jsp
  //      * Query the autowired DAO for the newly added State and check its fields
  @Test
  public void test_POST_sets_WEBINFresultJSP_as_view_and_adds_State_to_dao() {
    try {
      MvcResult result = mockMvc.perform(post("/NewState.do")
          .param("abbreviation", "PR")
          .param("name", "Puerto Rico")
          .param("capital", "CapitalCity")
          .param("latitude", "LAT")
          .param("longitude", "LONG")
          .param("capitalPopulation", "1234")
          )
          .andExpect(status().isOk())
          .andReturn();
      
      String viewName = result.getModelAndView().getViewName();
      assertEquals("WEB-INF/result.jsp", viewName);
      
      // Look in DAO
      State state = dao.getStateByAbbreviation("PR");
      assertThat(state, allOf(
          hasProperty("abbreviation", is("PR")),
          hasProperty("name", is("Puerto Rico")),
          hasProperty("capital", is("CapitalCity")),
          hasProperty("latitude", is("LAT")),
          hasProperty("longitude", is("LONG")),
          hasProperty("capitalPopulation", is(1234))
          ));
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
}
