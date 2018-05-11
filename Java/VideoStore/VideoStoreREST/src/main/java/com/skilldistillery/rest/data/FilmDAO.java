package com.skilldistillery.rest.data;

import java.util.List;
import java.util.Set;

import com.skilldistillery.jpavideostore.entities.Film;

public interface FilmDAO {

	Set<Film> index();

}
