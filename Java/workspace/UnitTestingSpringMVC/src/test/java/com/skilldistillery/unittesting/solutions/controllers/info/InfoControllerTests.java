package com.skilldistillery.unittesting.solutions.controllers.info;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import com.skilldistillery.unittesting.controllers.info.InfoController;

public class InfoControllerTests {

  @Test
  public void test_GET_getInfo_sets_info_view_and_adds_year_and_description_to_model() {
    InfoController controller = new InfoController();
    
    // Create a Model implementation object to pass to the method
    Model model = new BindingAwareModelMap();
    
    // Controller method call
    String view = controller.getInfo(model);
    
    assertEquals("info", view);
    
    // Get the model as a map of key-value pairs
    Map<String, Object> map = model.asMap();
    assertNotNull(map);
    assertEquals("The world will be conquered by robots...", map.get("description"));
    assertEquals(2035, map.get("year"));
  }
  
  @Test
  public void test_GET_getInfo_sets_info_view() {
    InfoController controller = new InfoController();
    
    // Controller method call
    String view = controller.getInfo();
    
    assertEquals("info", view);
  }
  
}
