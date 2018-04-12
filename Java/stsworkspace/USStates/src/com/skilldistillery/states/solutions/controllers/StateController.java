package com.skilldistillery.states.solutions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.states.solutions.data.State;
import com.skilldistillery.states.solutions.data.StateDAO;

@Controller
public class StateController {
	// TODO : Autowire a StateDAO and create getters and setters
  
  @Autowired
  private StateDAO stateDAO;
  
  public void setStateDAO(StateDAO stateDAO) {
    this.stateDAO = stateDAO;
  }

	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "name"
	// method GET
	// return : ModelAndView
	// view : "WEB-INF/result.jsp"
	// object : "state", StateDAO.getStateByName
  @RequestMapping(path="GetStateData.do", params="name", method=RequestMethod.GET)
  public ModelAndView getStateByName(String name) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByName(name);
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/solutions/result.jsp");
    return mv;
  }

	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "abbr"
	// method GET
	// return : ModelAndView
	// view : "WEB-INF/result.jsp"
	// object : "state", StateDAO.getStateByAbbreviation
  @RequestMapping(path="GetStateData.do", params="abbr", method=RequestMethod.GET)
  public ModelAndView getStateByAbbreviation(String abbr) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByAbbreviation(abbr);
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/solutions/result.jsp");
    return mv;
  }
  
}
