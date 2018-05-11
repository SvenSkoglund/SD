package com.skilldistillery.jpavideostore.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.client.JPQLRelationshipsLab;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Rental;
import com.skilldistillery.jpavideostore.entities.Store;

public class JPQLRelationshipsTests {
	private EntityManagerFactory emf;
	private EntityManager em;
	private Store store;
	private JPQLRelationshipsLab jpql;
	private List<Store> stores;
	private List<Film> films;
	private List<Rental> rentals;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		jpql = new JPQLRelationshipsLab();
		stores = new ArrayList<>();
		films = new ArrayList<>();
		rentals = new ArrayList<>();
	}

	@AfterEach
	public void tearDown() throws Exception {
		store = null;
		em.close();
		emf.close();
	}

	@Test
	public void test_get_stores_by_state() {
		stores = jpql.getStoresByState("Washington");
		assertEquals("Washington", stores.get(0).getAddress().getState());
	}

	@Test
	public void test_get_films_by_actor_id() {
		films = jpql.getFilmsForActorWithId(1);
		assertNotEquals(0, films.size());
	}

	@Test
	public void test_get_rentals_by_customer_id() {
		rentals = jpql.getRentalsForCustomerWithCustomerId(1);
		assertNotEquals(0 , rentals.size());
		System.out.println(rentals);
	}
	@Test
	public void test_get_films_of_category() {
		int count = jpql.getNumberOfFilmsForCategoryWithName("Horror");
		assertNotEquals(0 , count);
		System.out.println(count);
	}
	@Test
	public void test_get_() {
		List<Film> inventory  = jpql.getInventoryForStoreWithId(1);
		assertNotEquals(0 , inventory.size());
		System.out.println(inventory);
	}
	@Test
	public void test_get_films_rented_by_customer_id() {
		List<Film> films  = jpql.getFilmsRentedForCustomerWithId(1);
		assertNotEquals(0 , films.size());
		System.out.println(films);
	}
}
