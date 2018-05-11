package com.skilldistillery.jpavideostore.test;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.InventoryItem;

class InventoryItemTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	InventoryItem i_i;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		i_i = em.find(InventoryItem.class, 1);
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}
	
	@Test
	public void test_i_i() {
		assertNotNull(i_i.getMediaCondition());
		assertNotNull(i_i.getId());
		
	}

}
