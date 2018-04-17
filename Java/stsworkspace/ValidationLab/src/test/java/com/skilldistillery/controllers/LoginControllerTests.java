package com.skilldistillery.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.data.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"LoginControllerTests-context.xml"})
@WebAppConfiguration
public class LoginControllerTests {

  @Autowired
  private WebApplicationContext wac;

  private MockMvc mockMvc;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }
  
  @Test
  public void test_GET_login_sets_WEBINF_loginJSP_with_user_in_model() {
    try {
      MvcResult result = mockMvc.perform(
          get("/login.do"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/login.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  @Test
  public void test_POST_login_invalid_credentials_sets_WEBINF_loginJSP_with_user_in_model() {
    try {
      MvcResult result = mockMvc.perform(
          post("/login.do").param("email", "xxx@xxx.com").param("password", "whatever"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/login.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  @Test
  public void test_POST_login_valid_credentials_sets_WEBINF_profileJSP_with_user_in_model() {
    try {
      MvcResult result = mockMvc.perform(
          post("/login.do").param("email", "admin@admin.com").param("password", "password"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/profile.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(22), u.getAge());
      assertEquals("admin", u.getFirstName());
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
}
