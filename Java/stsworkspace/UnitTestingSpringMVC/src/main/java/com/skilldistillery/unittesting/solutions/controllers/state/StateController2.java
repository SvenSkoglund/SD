package com.skilldistillery.unittesting.solutions.controllers.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.unittesting.data.State;
import com.skilldistillery.unittesting.data.StateDAO;

@Controller
public class StateController2 {

  @Autowired
  private StateDAO stateDAO;

  public void setStateDAO(StateDAO stateDAO) {
    this.stateDAO = stateDAO;
  }

  @RequestMapping(path = "GetStateData.do", params = "name", method = RequestMethod.GET)
  public ModelAndView getStateByName(String name) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByName(name);
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }

  @RequestMapping(path = "GetStateData.do", params = "abbr", method = RequestMethod.GET)
  public ModelAndView getStateByAbbreviation(String abbr) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByAbbreviation(abbr);
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }

  /*
  @RequestMapping(path = "NewState.do", method = RequestMethod.POST)
  public ModelAndView newState(State state) {
    stateDAO.addState(state);
    ModelAndView mv = new ModelAndView();
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }
  */
  
  @RequestMapping(path = "NewState.do", method = RequestMethod.POST)
  public String newState(State state, RedirectAttributes redir) {
    stateDAO.addState(state);
    redir.addFlashAttribute("state", state);
    return "redirect:stateAdded.do";
  }

  // Note: This does not use an InternalResourceViewResolver
  @RequestMapping("stateAdded.do")
  public ModelAndView stateAdded() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }
  
  

}
