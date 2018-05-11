package com.skilldistillery.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpavideostore.entities.Film;

@Service
public interface FilmService {
	//index, show, create, update, delete
	public List<Film> index();
	public Film show(int id);
	public Film create(Film film);
	public Film update(Film film);
	public Boolean delete(int id);
	public Film replace(int id, Film film);
}
