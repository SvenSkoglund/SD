package com.skilldistillery.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;
import com.skilldistillery.rest.repositories.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmRepository repo;

	@Override
	public List<Film> index() {
		return repo.findAll();
	}

	@Override
	public Film show(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Film create(Film film) {
		Language lang = new Language();
		lang.setId(1);
		film.setLanguage(lang);
		return repo.saveAndFlush(film);
	}

	@Override
	public Film update(Film film) {
		repo.saveAndFlush(film);
		return film;
	}

	@Override
	public Boolean delete(int id) {
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Film replace(int id, Film film) {
		repo.saveAndFlush(film);
		return film;
	}
}
