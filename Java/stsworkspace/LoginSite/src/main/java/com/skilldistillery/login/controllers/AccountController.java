package com.skilldistillery.login.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.login.data.User;

@Controller
public class AccountController {

	@RequestMapping(path = "account.do", method = RequestMethod.GET)
	public ModelAndView login(HttpSession session) {
		System.out.println("IN ACcount redir.do");
		User user = (User) session.getAttribute("modelUser");
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		try {
			if (user.getUserName() != null) {
				mv.setViewName("WEB-INF/account.jsp");
			}
		} catch (NullPointerException e) {
			mv.setViewName("login.do");
		}
		mv.setViewName("login.do");

		mv.addObject("user", user);
		return mv;
	}
}
