package com.skilldistillery.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.rest.services.FilmService;

@RestController
@RequestMapping("api")
public class FilmController {

	@Autowired
	FilmService filmService;

	@RequestMapping(path = "films", method = RequestMethod.GET)
	public List<Film> index() {
		return filmService.index();
	}

	@RequestMapping(path = "films/{id}", method = RequestMethod.GET)
	public Film show(@PathVariable int id) {
		return filmService.show(id);
	}

	// public Film create(Film film);
	// public Film update(Film film);
	// public Boolean delete(Film film);

	@RequestMapping(path = "films", method = RequestMethod.POST)
	public Film create(@RequestBody Film film) {
		return filmService.create(film);
	}

	@RequestMapping(path = "films/{id}", method = RequestMethod.PATCH)
	public Film update(@RequestBody Film film) {
		return filmService.update(film);
	}

	@RequestMapping(path = "films/{id}", method = RequestMethod.PUT)
	public Film replace(@RequestBody Film film, @PathVariable int id) {
		return filmService.replace(id, film);
	}

	@RequestMapping(path = "films/{id}", method = RequestMethod.DELETE)
	public Boolean update(@PathVariable int id) {
		return filmService.delete(id);
	}
}
