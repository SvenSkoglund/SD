package com.skilldistillery.mvcvideostore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.mvcvideostore.data.FilmDAO;

@Controller
public class FilmController {
	
	@Autowired
	private FilmDAO dao;

	@RequestMapping(path = "getFilm.do", method = RequestMethod.GET)
	public ModelAndView showFilm( @RequestParam(name = "fid") Integer filmId) {
		ModelAndView mv = new ModelAndView();
		Film film = dao.show(filmId);
		mv.addObject("film", film);
		mv.setViewName("film/show.jsp");
		return mv;
	}
	
	@RequestMapping(path="films.do", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List <Film> films = dao.index();
		mv.addObject("films", films);
		mv.setViewName("index.jsp");
		return mv;
	}
}
