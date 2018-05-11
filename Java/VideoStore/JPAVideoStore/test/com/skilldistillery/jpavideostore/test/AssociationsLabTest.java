package com.skilldistillery.jpavideostore.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.client.JPQLRelationshipsLab;

class AssociationsLabTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	private JPQLRelationshipsLab jpql;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		jpql=new JPQLRelationshipsLab();
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}
	
	@Test
	void test_get_items_by_store_id_and_title() {
		int result = jpql.checkFilmInventoryItemsForStoreById(1, "ZORRO ARK");
		System.out.println(result);
	}

}
