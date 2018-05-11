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

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;
import com.skilldistillery.jpavideostore.entities.Rating;

public class FilmTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	private Film film;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		film = em.find(Film.class, 2);
	}

	@AfterEach
	public void tearDown() throws Exception {
		film = null;
		em.close();
		emf.close();
	}

	@Test
	void test_film_rating() {
		assertEquals(Rating.G, film.getRating());
	}
	
	
	@Test
	void test_film_mappings() {

		// | 2 | ACE GOLDFINGER | A Astounding Epistle of a Database Administrator And a
		// Explorer who must Find a Car in Ancient China | 2000 | 1 | 3 | 4.99 | 48 |
		// 12.99 | G | Trailers,Deleted Scenes |
		assertNotNull(film);
		assertEquals("ACE GOLDFINGER", film.getTitle());
		assertEquals("A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China", film.getDescription());
		assertEquals(2000, film.getReleaseYear());
		assertEquals(4.99, film.getRentalRate());
		assertEquals(12.99, film.getReplacementCost());

	}

	@Test
	void test_film_language_mapping() {
		Language lang = film.getLanguage();
		assertEquals("English", film.getLanguage().getName());
		assertEquals("ACE GOLDFINGER", lang.getFilms().get(1).getTitle());
	}
	@Test
	void test_film_actors_mapping() {
		assertNotEquals(0,film.getActors().size());
		assertNotEquals(0, film.getActors().get(0).getFilms());
	}
	@Test
	void test_film_categories_mapping() {
		assertNotEquals(0,film.getCategories().size());
		assertNotEquals(0, film.getCategories().get(0).getFilms().size());
	}
	
	@Test
	void test_inventory_item_mappyin() {
		assertNotEquals(0,film.getItems().size());
	}
}