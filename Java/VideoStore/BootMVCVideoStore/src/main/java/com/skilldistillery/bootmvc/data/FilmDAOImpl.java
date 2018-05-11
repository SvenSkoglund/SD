package com.skilldistillery.bootmvc.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpavideostore.entities.Actor;
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
		List<Film> films = em.createQuery(sql, Film.class).getResultList();
		return films;
	}

	@Override
	public List<Actor> getActorsForFilm(int fid) {
		String sql = "select f from Film f join fetch f.actors where f.id = :id";
		Film film = em.createQuery(sql, Film.class).setParameter("id", fid).getResultList().get(0);
		return film.getActors();
	}

}
