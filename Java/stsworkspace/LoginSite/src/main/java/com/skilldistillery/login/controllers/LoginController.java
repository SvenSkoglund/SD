package com.skilldistillery.login.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.login.data.User;
import com.skilldistillery.login.data.UserDAO;

@Controller
@SessionAttributes("modelUser")
public class LoginController {

	@Autowired
	UserDAO userDAO;

	@ModelAttribute("modelUser")
	public User initSessionUser() {
		return new User();
	}

	// Add a method to display the login.jsp view when a user GETs login.do.
	@RequestMapping(path = "login.do", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("modelUser") User user) {
		boolean loggedIn = false;
		ModelAndView mv = new ModelAndView();
		if (user != null) {
			mv.setViewName("redirect:account.do");
		}else {
			mv.setViewName("WEB-INF/login.jsp");
		}
		return mv;
	}

	// POST login.do attempts to log in the user. If the userName and password match
	// the DAO data, load the User object into session, and redirect to the account
	// page, account.do. If the login fails, display an error on the page with
	// form:errors.
	@RequestMapping(path = "login.do", method = RequestMethod.POST)
	public ModelAndView loginPost(@ModelAttribute("modelUser") @Valid User user, Errors errors, String userName,
			String password, Boolean loggedIn) {
		ModelAndView mv = new ModelAndView();
		if (userDAO.getUserByUserNameAndPassword(userName, password) == null) {
			System.out.println("*****************IN IF");
			mv.setViewName("WEB-INF/login.jsp");
			loggedIn = false;
			mv.addObject("loggedIn", loggedIn);
//			errors.rejectValue("userName", errorCode, errorArgs, defaultMessage);
		} else {
			user = userDAO.getUserByUserNameAndPassword(userName, password);
			mv.addObject("modelUser", user);
			mv.setViewName("redirect:account.do");
			loggedIn = true;
			mv.addObject("loggedIn", loggedIn);
			System.out.println(user);

		}

		return mv;
	}

	// logout.do removes the user from session and redirects to index.do.
	@RequestMapping(path = "logout.do", method = RequestMethod.POST)
	public ModelAndView logout(@ModelAttribute("modelUser") User user, Boolean loggedIn, SessionStatus sessionStatus) {
		loggedIn = false;
		ModelAndView mv = new ModelAndView();
	
		sessionStatus.setComplete();
		mv.setViewName("index.do");
		return mv;
	}

}
