package com.skilldistillery.jpavideostore.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Customer;

public class ActorClient {

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
	void test_customer_mappings() {
		Actor act = em.find(Actor.class, 2);
		System.out.println(act);
		assertNotNull(act);
		assertEquals(2, act.getId());
		assertEquals("Nick", act.getFirstName());
		assertEquals("Wahlberg", act.getLastName());
	}

}