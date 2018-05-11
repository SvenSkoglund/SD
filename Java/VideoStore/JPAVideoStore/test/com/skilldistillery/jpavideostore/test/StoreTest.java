package com.skilldistillery.jpavideostore.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Store;

public class StoreTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	Store store;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		store = em.find(Store.class, 1);
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	void test_address_mappings() {
		assertNotNull(store);
		assertEquals(1, store.getId());
		Address address = store.getAddress();
		assertEquals("Seattle", address.getCity());
	}
	@Test
	void test_customer_mappings() {
		assertNotNull(store);
		assertEquals(1, store.getId());
		assertEquals("Barbara", store.getCustomers().get(0).getFirstName());
	}
	@Test
	void test_staff_mapping() {
		assertEquals("Dutch" , store.getStaff().get(0).getFirstName());
	}
	@Test
	void test_manager_mapping() {
		assertEquals("Dutch" , store.getManager().getFirstName());
	}
	@Test
	void test_films_mapping() {
		assertNotEquals(0 , store.getFilms().size());
		assertNotEquals(0 , store.getFilms().get(0).getStores().size());
	}
	@Test
	void test_inventory_item_mappyin() {
		assertNotNull(store.getItems());
	}

}