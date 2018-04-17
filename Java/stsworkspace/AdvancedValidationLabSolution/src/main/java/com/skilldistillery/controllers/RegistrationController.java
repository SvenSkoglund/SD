package com.skilldistillery.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.data.AuthenticationDAO;
import com.skilldistillery.data.User;

@Controller
public class RegistrationController {
	
	@Autowired
	private AuthenticationDAO authDao;
	
	@RequestMapping(path="register.do", method=RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		User u = new User();
		mv.addObject("user", u);
		mv.setViewName("WEB-INF/register.jsp");
		return mv;
	}
	

	@RequestMapping(path="register.do", method=RequestMethod.POST)
	public String create(@Valid User user, Errors errors) {
		if(errors.hasErrors()) {
	    return "WEB-INF/register.jsp";
	  }
		if(!authDao.isEmailUnique(user.getEmail())) {
	    errors.rejectValue("email", "registration.email", "Email already in use");
	    return "WEB-INF/register.jsp";
	  }
	  
	  authDao.create(user);
	  
		return "WEB-INF/profile.jsp";
	}
}
