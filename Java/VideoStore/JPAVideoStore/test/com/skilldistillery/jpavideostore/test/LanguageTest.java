package com.skilldistillery.jpavideostore.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Language;

public class LanguageTest {

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
	void test_language_mappings() {
		Language lang = em.find(Language.class, 1);
		assertNotNull(lang);
		assertEquals(1, lang.getId());
		assertEquals("English", lang.getName());
		
	}

}