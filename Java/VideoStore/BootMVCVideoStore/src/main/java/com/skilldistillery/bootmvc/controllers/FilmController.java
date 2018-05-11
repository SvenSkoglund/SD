package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.bootmvc.data.FilmDAO;
import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;

@Controller
public class FilmController {

	@Autowired
	private FilmDAO dao;

	@RequestMapping(path = "getFilm.do", method = RequestMethod.GET)
	public ModelAndView showFilm(@RequestParam(name = "fid") Integer filmId) {
		ModelAndView mv = new ModelAndView();
		Film film = dao.show(filmId);
		List<Actor> actors = dao.getActorsForFilm(filmId);
		System.out.println(actors);
		mv.addObject("film", film);
		mv.addObject("actors", actors);
		mv.setViewName("show");
		return mv;
	}

	@RequestMapping(path = { "films.do", "/" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<Film> films = dao.index();
		mv.addObject("films", films);
		mv.setViewName("index");
		return mv;
	}
}
