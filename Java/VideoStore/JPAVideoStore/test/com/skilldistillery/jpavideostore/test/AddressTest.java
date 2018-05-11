package com.skilldistillery.jpavideostore.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Address;

public class AddressTest {

	private EntityManagerFactory emf;
	private EntityManager em;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	void test_address_mappings() {
		Address add = em.find(Address.class, 1);
		assertNotNull(add);
		// 1 | 47 MySakila Drive | NULL Lethbridge Alberta CA
		assertEquals("47 MySakila Drive", add.getStreet());
		assertEquals(null, add.getStreet2());
		assertEquals("Lethbridge", add.getCity());
		assertEquals("Alberta", add.getState());
		assertEquals("", add.getPostalCode());
		assertEquals("", add.getPhone());

	}
	
	@Test
	void test_country_mappings() {
		Address add = em.find(Address.class, 1);
		assertNotNull(add);
		assertEquals("Canada", add.getCountry().getName());


	}

}