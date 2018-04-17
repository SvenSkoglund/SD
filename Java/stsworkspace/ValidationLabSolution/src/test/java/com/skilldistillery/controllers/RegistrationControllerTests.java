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

import com.skilldistillery.data.AuthenticationDAO;
import com.skilldistillery.data.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"RegistrationControllerTests-context.xml"})
@WebAppConfiguration
public class RegistrationControllerTests {

  @Autowired
  private WebApplicationContext wac;

  private MockMvc mockMvc;
  
  @Autowired
  AuthenticationDAO dao;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }
  
  @Test
  public void test_GET_registerDO_sets_WEBINF_registerJSP_with_user_in_model() {
    try { 
      MvcResult result = mockMvc.perform(
          get("/register.do"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
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
  public void test_POST_register_invalid_email_sets_WEBINF_registerJSP_with_user_in_model() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do").param("email", "admin@admin.com").param("password", "whatever"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
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
  public void test_POST_register_valid_credentials_sets_WEBINF_profileJSP_with_user_in_model_and_in_DAO() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "new@admin.com")
          .param("password", "password")
          .param("firstName", "Dave")
          .param("lastName", "Bave")
          .param("age", "35")
          )
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/profile.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(35), u.getAge());
      assertEquals("Dave", u.getFirstName());
      
      // Find the new user in the DAO
      u = dao.getUserByEmail("new@admin.com");
      assertNotNull(u);
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
}
