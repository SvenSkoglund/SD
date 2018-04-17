package com.skilldistillery.controllers;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

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
  public void test_POST_registerDO_invalid_email_sets_Email_error_code_on_email_property() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "XXX")
          .param("password", "password")
          .param("firstName", "Dave")
          .param("lastName", "Bave")
          .param("age", "35")
          )
          .andExpect(status().isOk())
          .andExpect(model().errorCount(1))
          .andExpect(model().attributeHasFieldErrorCode("user", "email", is("Email")))
          .andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(35), u.getAge());
      assertEquals("XXX", u.getEmail());
     
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  // TODO: New method to test for password too short sets Size error code on password property.
  //       Make sure other data is valid so there is an
  //       accurate error count.
  @Test
  public void test_POST_registerDO_password_too_short_sets_Size_error_code_on_password() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "email@aaa.com")
          .param("password", "pa")
          .param("firstName", "Dave")
          .param("lastName", "Bave")
          .param("age", "35")
          )
          .andExpect(status().isOk())
          .andExpect(model().errorCount(1))
          .andExpect(model().attributeHasFieldErrorCode("user", "password", is("Size")))
          .andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(35), u.getAge());
      assertEquals("email@aaa.com", u.getEmail());
     
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  // TODO: test for firstName too short
  @Test
  public void test_POST_registerDO_firstName_too_short_sets_Size_error_code_on_firstName() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "email@aaa.com")
          .param("password", "passwo")
          .param("firstName", "Da")
          .param("lastName", "Bave")
          .param("age", "35")
          )
          .andExpect(status().isOk())
          .andExpect(model().errorCount(1))
          .andExpect(model().attributeHasFieldErrorCode("user", "firstName", is("Size")))
          .andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(35), u.getAge());
      assertEquals("email@aaa.com", u.getEmail());
     
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  
  // TODO: test for lastName too short
  @Test
  public void test_POST_registerDO_lastName_too_short_sets_Size_error_code_on_lastName() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "email@aaa.com")
          .param("password", "passwo")
          .param("firstName", "Dave")
          .param("lastName", "Ba")
          .param("age", "35")
          )
          .andExpect(status().isOk())
          .andExpect(model().errorCount(1))
          .andExpect(model().attributeHasFieldErrorCode("user", "lastName", is("Size")))
          .andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(35), u.getAge());
      assertEquals("email@aaa.com", u.getEmail());
     
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  // TODO: test for age below Min
  @Test
  public void test_POST_registerDO_age_too_small_sets_Min_error_code_on_age() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "email@aaa.com")
          .param("password", "passwo")
          .param("firstName", "Dave")
          .param("lastName", "Bave")
          .param("age", "15")
          )
          .andExpect(status().isOk())
          .andExpect(model().errorCount(1))
          .andExpect(model().attributeHasFieldErrorCode("user", "age", is("Min")))
          .andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(15), u.getAge());
      assertEquals("email@aaa.com", u.getEmail());
     
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
  }
  // TODO: test for email is not unique.
  //       Look in RegistrationController for the error code that is set.
  @Test
  public void test_POST_registerDO_email_not_unique_sets_error_dot_email_error_code_on_email() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do")
          .param("email", "admin@admin.com")
          .param("password", "passwo")
          .param("firstName", "Dave")
          .param("lastName", "Bave")
          .param("age", "35")
          )
          .andExpect(status().isOk())
          .andExpect(model().errorCount(1))
          .andExpect(model().attributeHasFieldErrorCode("user", "email", is("registration.email")))
          .andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertEquals(Integer.valueOf(35), u.getAge());
      assertEquals("admin@admin.com", u.getEmail());
     
    }
    catch (Exception e) {
      e.printStackTrace();
      fail(e.toString());
    }
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
  public void test_POST_registerDO_invalid_email_sets_WEBINF_registerJSP_with_user_in_model() {
    try {
      MvcResult result = mockMvc.perform(
          post("/register.do").param("email", "admin@admin.com").param("password", "whatever"))
          .andExpect(status().isOk()).andReturn();
      ModelAndView modelAndView = result.getModelAndView();
      
      assertEquals("WEB-INF/register.jsp", modelAndView.getViewName());
      
      ModelMap map = modelAndView.getModelMap();
      User u = (User) map.get("user");
      assertNotNull(u);
      assertThat(u, allOf(
          hasProperty("email", is("admin@admin.com")),
          hasProperty("password", is("whatever"))
          ));
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
