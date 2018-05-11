package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Category;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.InventoryItem;
import com.skilldistillery.jpavideostore.entities.Rental;
import com.skilldistillery.jpavideostore.entities.Store;

public class JPQLRelationshipsLab {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	private EntityManager em = emf.createEntityManager();

	public List<Store> getStoresByState(String state) {
		String sql = "select s from Store s where s.address.state = :state";
		List<Store> stores = em.createQuery(sql, Store.class).setParameter("state", state).getResultList();
		return stores;
	}

	public List<Film> getFilmsForActorWithId(int id) {
		String sql = "select a from Actor a join fetch a.films where a.id = :id";
		List<Actor> actor = em.createQuery(sql, Actor.class).setParameter("id", id).getResultList();
		List<Film> films = actor.get(0).getFilms();
		return films;
	}

	public List<Rental> getRentalsForCustomerWithCustomerId(int id) {
		String sql = "select r from Rental r where r.customer.id = :id";
		List<Rental> rentals = em.createQuery(sql, Rental.class).setParameter("id", id).getResultList();
		return rentals;
	}

	public int getNumberOfFilmsForCategoryWithName(String name) {
		String sql = "select c from Category c join fetch c.films where c.name = :name";
		List<Category> category = em.createQuery(sql, Category.class).setParameter("name", name).getResultList();
		int count = category.get(0).getFilms().size();
		return category.size();
	}

	public List<Film> getInventoryForStoreWithId(int id) {
		String sql = "select s from Store s join fetch s.films where s.id = :id";
		List<Store> s = em.createQuery(sql, Store.class).setParameter("id", id).getResultList();
		List<Film> films = s.get(0).getFilms();
		return films;
	}

	public int checkFilmInventoryItemsForStoreById(int id, String title) {
		String sql = "select i from InventoryItem i where i.store.id = :id and i.film.title = :title";
		List<InventoryItem> II = em.createQuery(sql, InventoryItem.class).setParameter("id", id)
				.setParameter("title", title).getResultList();

		return II.size();
	}

	public List<Film> getFilmsRentedForCustomerWithId(int id) {
		String sql = "SELECT r.item.film from Rental r where r.customer.id = :id";
		List<Film> films = em.createQuery(sql,Film.class).setParameter("id", id).getResultList();
		return films;
	}

}
