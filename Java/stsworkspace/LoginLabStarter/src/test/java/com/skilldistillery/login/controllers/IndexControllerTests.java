package com.skilldistillery.login.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"IndexControllerTests-context.xml"})
@WebAppConfiguration
public class IndexControllerTests {
  @Autowired
  private WebApplicationContext wac;
  
  private MockMvc mockMvc;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }
  
  @Test
  public void test_GET_indexDO_view_index() {
    try {
      MvcResult result = mockMvc.perform(
          get("/index.do"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      // Complete the test
      assertEquals(modelAndView.getViewName(), "index");
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
}
