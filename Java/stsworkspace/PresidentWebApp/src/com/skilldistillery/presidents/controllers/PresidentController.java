package com.skilldistillery.presidents.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.PresidentDAO;

@Controller
public class PresidentController {
	@Autowired
	PresidentDAO dao;
	
	@RequestMapping("President.do")
	public ModelAndView president(String term) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("president", dao.getPresidentByTerm(term));
		return mv;
		
	}
}
