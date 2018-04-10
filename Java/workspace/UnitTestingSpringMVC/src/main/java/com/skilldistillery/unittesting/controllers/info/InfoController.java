package com.skilldistillery.unittesting.controllers.info;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * This class requires an InteralResourceViewResolver configured in the PROJECT-servlet.xml
 * in order to find views in WEB-INF/.
 * <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
 *    <property name="prefix" value="/WEB-INF/"/>
 *    <property name="suffix" value=".jsp"/>
 * </bean>
 */
@Controller
public class InfoController {
  @RequestMapping(path = "GetInfo.do", method = RequestMethod.GET)
  public String getInfo() {
    return "info";
  }

  @RequestMapping(path = "GetInfo.do", method = RequestMethod.GET, params="displayYear")
  public String getInfo(Model model) {
    model.addAttribute("year", 2035);
    model.addAttribute("description", "The world will be conquered by robots...");

    return "info";
  }

  @RequestMapping("nameAndAge.do")
  public ModelAndView displayNameAndAge() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("result");
    mv.addObject("name", "Joe");
    mv.addObject("age", 12);
    return mv;
  }
}