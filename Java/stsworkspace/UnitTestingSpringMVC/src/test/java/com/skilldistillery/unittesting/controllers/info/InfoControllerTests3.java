package com.skilldistillery.unittesting.controllers.info;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;
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
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.unittesting.controllers.info.InfoController;

@RunWith(SpringJUnit4ClassRunner.class)
//Default file name is class with '-context.xml'
@ContextConfiguration(locations={"InfoControllerTests-context.xml"})
@WebAppConfiguration
public class InfoControllerTests3 {
  @Autowired
  WebApplicationContext wac;

  private MockMvc mockMvc;

  @Autowired
  InfoController controller;

  @Before
  public void setUp() throws Exception {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
  }
  
  @Test
  public void test_GET_GetInfoDO_with_displayYear_sets_info_view_and_adds_year_and_description_to_model() {
    try{
      MvcResult result = mockMvc.perform(get("/GetInfo.do").param("displayYear", "true"))
          .andExpect(status().isOk())
          .andReturn();
      ModelAndView mv = result.getModelAndView();
      // assertEquals("info", mv.getViewName());
      assertThat(mv, allOf(
          hasProperty("viewName", is("info")),
          hasProperty("model")
          )
      );
      
      ModelMap modelMap = mv.getModelMap();
      
      String desc = (String) modelMap.get("description");
      Integer year = (Integer) modelMap.get("year");
      assertThat(desc,
          is("The world will be conquered by robots...")
      );
      
      assertThat(year, is(2035));
    }
    catch(Exception e){
      e.printStackTrace();
      fail(e.toString());
    }
  }
}
