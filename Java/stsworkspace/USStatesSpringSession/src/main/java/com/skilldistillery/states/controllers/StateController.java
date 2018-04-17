package com.skilldistillery.states.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.states.data.State;
import com.skilldistillery.states.data.StateDAO;

@Controller
@SessionAttributes("modelState")
public class StateController {
  @Autowired
  private StateDAO stateDAO;
  
  @ModelAttribute("modelState")
  public State initSessionState() {
    return stateDAO.getStateByName("Alabama");
  } 
  
  public void setStateDAO(StateDAO stateDAO) {
    this.stateDAO = stateDAO;
  }

  
  
  @RequestMapping(path="index.do", method=RequestMethod.GET)
  public ModelAndView welcomePage(@ModelAttribute("modelState") State s) {
    ModelAndView mv = new ModelAndView();
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/result.jsp");
   // track the current state in sessio
    return mv;
  }
  
    @RequestMapping(path="GetStateData.do", params="name", method=RequestMethod.GET)
    public ModelAndView getStateByName(String name, HttpSession session) {
    	ModelAndView mv = new ModelAndView();
    	State s = stateDAO.getStateByName(name);
    	// mv.addObject("state", s);
    	mv.setViewName("WEB-INF/result.jsp");
    	
    	// track the current state in session
    	session.setAttribute("state", s);
    	return mv;
  }

  @RequestMapping(path="GetStateData.do", params="abbr", method=RequestMethod.GET)
  public ModelAndView getStateByAbbreviation(String abbr, HttpSession session) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByAbbreviation(abbr);
    // mv.addObject("state", s);
    mv.setViewName("WEB-INF/result.jsp");
    
    // track the current state in session, also for display on the page
    session.setAttribute("state", s);
    return mv;
  }
  
  @RequestMapping(path="navState.do", params="next")
  public ModelAndView navStateNext(HttpSession session) {
    ModelAndView mv = new ModelAndView();
    
    // get the current state from session
    State current = getCurrentStateFromSession(session);
    
    // get next
    State s = stateDAO.getNextState(current);
    session.setAttribute("state", s);
    
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }
  
  @RequestMapping(path="navState.do", params="prev")
  public ModelAndView navStatePrev(HttpSession session) {
    ModelAndView mv = new ModelAndView();
    
    // get the current state from session
    State current = getCurrentStateFromSession(session);
    
    // get previous
    State s = stateDAO.getPreviousState(current);
    session.setAttribute("state", s);
    
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }
  
  private State getCurrentStateFromSession(HttpSession session) {
    State current = (State) session.getAttribute("state");
    
    return current;
  }
  
}
