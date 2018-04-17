package com.skilldistillery.states.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.states.data.State;
import com.skilldistillery.states.data.StateDAO;

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

	@RequestMapping(path = "nextState.do",  method = RequestMethod.GET)
	public ModelAndView nextState(String stateAbbr, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		System.out.println(stateAbbr);
		String abbr = (String) session.getAttribute("stateAbbr");
		if(abbr == null) {
			session.setAttribute("stateAbbr", stateAbbr);
		}
		ArrayList<State> states =  (ArrayList) stateDAO.getStates();
		State state = stateDAO.getStateByAbbreviation(stateAbbr);
		int index = states.indexOf(state);
		System.out.println(index);
		State nextState = states.get(index + 1);
		System.out.println(nextState);
		mv.addObject("state", nextState);
		mv.setViewName("WEB-INF/result.jsp");
		return mv;
	}
	@RequestMapping(path = "previousState.do",  method = RequestMethod.GET)
	public ModelAndView previousState(String stateAbbr, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		System.out.println(stateAbbr);
		String abbr = (String) session.getAttribute("stateAbbr");
		if(abbr == null) {
			session.setAttribute("stateAbbr", stateAbbr);
		}
		ArrayList<State> states =  (ArrayList) stateDAO.getStates();
		State state = stateDAO.getStateByAbbreviation(stateAbbr);
		int index = states.indexOf(state) -1;
		System.out.println(index);
		if (index < 0) {
			index = 49;
		}
		State nextState = states.get(index);
		
		System.out.println(nextState);
		mv.addObject("state", nextState);
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

}
