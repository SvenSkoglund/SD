package com.skilldistillery.mvcvideostore.data;

import java.util.List;

import com.skilldistillery.jpavideostore.entities.Film;

public interface FilmDAO {
	
	public Film show(int id);
	
	public List<Film> index();
}
