package com.skilldistillery.jpavideostore.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;

public class ActorDAOImpl implements ActorDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	private EntityManager em = emf.createEntityManager();

	@Override
	public Actor create(Actor actor) {
		// start the transaction
		em.getTransaction().begin();
		// write the customer to the database
		em.persist(actor);
		// update the "local" Customer object
		em.flush();
		// commit the changes (actually perform the operation)
		em.getTransaction().commit();

		return actor;
	}

	@Override
	public Actor update(int id, Actor updatedActor) {
		em.getTransaction().begin();
		Actor managed = em.find(Actor.class, id);
		managed.setFirstName(updatedActor.getFirstName());
		managed.setLastName(updatedActor.getLastName());
		em.flush();
		em.getTransaction().commit();
		return managed;
	}

	@Override
	public boolean destroy(int id) {
		em.getTransaction().begin();
		Actor actorToDelete = em.find(Actor.class, id);
		if (actorToDelete == null) {
			em.getTransaction().commit();
			return false;
		}
		System.out.println(actorToDelete);
		em.remove(actorToDelete);
			em.flush();
		em.getTransaction().commit();
		return true;
	}

	@Override
	public Actor createActorAndFilm(Actor actor, Film film) {
		Language language = em.find(Language.class, 1);
		List<Film> films = actor.getFilms();
		if (films == null) {
			films = new ArrayList<>();
		}
		film.setLanguage(language);
		films.add(film);
		actor.setFilms(films);
		em.getTransaction().begin();
		em.persist(actor);
		em.flush();
		em.getTransaction().commit();
		return actor;
	}

}
