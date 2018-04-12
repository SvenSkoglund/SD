package com.skilldistillery.handlingrequests.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {
  @RequestMapping(path = "GetInfo.do", method = RequestMethod.GET)
  public String getInfo() {
    return "WEB-INF/info.jsp";
  }

  @RequestMapping(path = "GetInfo.do", method = RequestMethod.GET, params="displayYear")
  public String getInfo(Model model) {
    /*
     * Spring will add an instance of Model as an argument when it invokes the
     * request handler
     */
    model.addAttribute("year", 2035);
    model.addAttribute("description", "The world will be conquered by robots...");

    return "WEB-INF/info.jsp";
  }

  @RequestMapping("nameAndAge.do")
  public ModelAndView displayNameAndAge() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("WEB-INF/result.jsp");
    mv.addObject("name", "Joe");
    mv.addObject("age", 12);
    return mv;
  }
}