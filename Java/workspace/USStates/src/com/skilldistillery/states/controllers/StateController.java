package com.skilldistillery.states.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class StateController {
	// TODO : Autowire a StateDAO and create getters and setters

	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "name"
	// method GET
	// return : ModelAndView
	// view : "WEB-INF/result.jsp"
	// object : "state", StateDAO.getStateByName

	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "abbr"
	// method GET
	// return : ModelAndView
	// view : "WEB-INF/result.jsp"
	// object : "state", StateDAO.getStateByAbbreviation

}
