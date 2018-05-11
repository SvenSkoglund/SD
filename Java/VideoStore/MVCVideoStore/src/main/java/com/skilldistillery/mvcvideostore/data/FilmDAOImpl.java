package com.skilldistillery.mvcvideostore.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpavideostore.entities.Film;

@Transactional
@Component
public class FilmDAOImpl implements FilmDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Film show(int id) {
		Film film = em.find(Film.class, id);
		return film;
	}

	@Override
	public List<Film> index() {
		String sql = "select f from Film f";
		List <Film> films = em.createQuery(sql, Film.class).getResultList();
		return films;
	}

}
