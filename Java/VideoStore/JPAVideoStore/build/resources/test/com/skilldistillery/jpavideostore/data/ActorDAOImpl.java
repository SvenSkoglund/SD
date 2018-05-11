package com.skilldistillery.jpavideostore.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Actor;

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

}
