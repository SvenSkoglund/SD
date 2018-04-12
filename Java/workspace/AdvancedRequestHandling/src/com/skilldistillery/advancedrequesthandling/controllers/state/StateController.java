package com.skilldistillery.advancedrequesthandling.controllers.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.advancedrequesthandling.data.State;
import com.skilldistillery.advancedrequesthandling.data.StateDAO;

@Controller
public class StateController {
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

	// TODO : Implement a request handler for:
	// path "NewState.do"
	// method POST
	// command object : State
	// return : ModelAndView
	// view : "WEB-INF/result.jsp"
	// behavior: add state to dao
	@RequestMapping(path = "Newstate.do", method = RequestMethod.POST)
	public ModelAndView getState(State state) {
		ModelAndView mv = new ModelAndView();
		stateDAO.addState(state);
		mv.setViewName("WEB-INF/result.jsp");
		return mv;
	}
	// -------------------

	// TODO : Implement another request handler for:
	// path "NewState.do"
	// method POST
	// command object : State
	// return : ModelAndView
	// view : "redirect:stateAdded.do"
	// behavior : add state to dao, add state to flashAttributes
	// Note: Comment out the other "NewState.do" request handler method

	// TODO : Implement a request handler for:
	// path "stateAdded.do"
	// method GET
	// command object : State
	// return : ModelAndView
	// view : "WEB-INF/result.jsp"; "result" if using InternalResourceViewResolver
	// with prefix/suffix
	// Note: fix other request handler methods to use InternalResourceViewResolver

}
