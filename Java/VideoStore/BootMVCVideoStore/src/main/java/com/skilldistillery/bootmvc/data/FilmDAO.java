package com.skilldistillery.bootmvc.data;

import java.util.List;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;

public interface FilmDAO {
	
	public Film show(int id);
	
	public List<Film> index();
	
	public List <Actor> getActorsForFilm(int fid);
}
