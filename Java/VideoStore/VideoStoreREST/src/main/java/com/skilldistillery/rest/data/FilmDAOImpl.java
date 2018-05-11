package com.skilldistillery.rest.data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpavideostore.entities.Film;

@Service
@Transactional
public class FilmDAOImpl implements FilmDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Set<Film> index(){
		  String query = "Select f from Film f JOIN FETCH f.actors order by f.id";
		  List<Film>films = em.createQuery(query, Film.class).getResultList();
		  HashSet<Film> filmSet = new HashSet(films);
		  return filmSet;
		}
	
}
