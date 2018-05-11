package com.skilldistillery.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;
import com.skilldistillery.jpavideostore.entities.Rating;
import com.skilldistillery.rest.repositories.FilmRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FilmTest {

	@Autowired
	FilmRepository repo;

	@Test
	public void repo_find_by_title() {
		Film byTitle = repo.findByTitle("ACE GOLDFINGER");
		assertEquals("ACE GOLDFINGER", byTitle.getTitle());
	}

	@Test
	public void test_find_by_language() {
		List<Film> filmsByLanguage = repo.findByLanguageName("English");
		for (Film film : filmsByLanguage) {
			assertTrue(film.getLanguage().getId() == 1);
		}
		assertTrue(filmsByLanguage.size() > 0);

	}

	@Test
	public void test_find_by_language_and_releaseYear() {
		List<Film> filmsByLanguageAndReleaseYear = repo.findByLanguageNameAndReleaseYear("English", 1999);
		for (Film film : filmsByLanguageAndReleaseYear) {
			assertTrue(film.getLanguage().getId() == 1 && film.getReleaseYear() == 1999);
		}
		assertTrue(filmsByLanguageAndReleaseYear.size() > 0);

	}

	@Test
	public void test_find_by_replacementCost_between() {
		List<Film> filmsReplacementCostBetween = repo.findByReplacementCostBetween(5.0, 10.0);
		assertTrue(filmsReplacementCostBetween.size() > 0);
		for (Film film : filmsReplacementCostBetween) {
			assertTrue(film.getReplacementCost() >= 5.0 && film.getReplacementCost() <= 10.0);
		}

	}

	@Test
	public void test_find_rating() {
		Rating rating = Rating.R;
		List<Film> filmsByRating = repo.findByRating(rating);
		assertTrue(filmsByRating.size() > 0);
		for (Film film : filmsByRating) {
			assertTrue(film.getRating().equals(rating));
		}
		System.out.println(filmsByRating);

	}

	@Test
	public void test_query_replacementCost_range() {
		List<Film> filmsQueryRange = repo.queryByReplacementCostInRange(5.0, 10.0);
		assertTrue(filmsQueryRange.size() > 0);
		for (Film film : filmsQueryRange) {
			assertTrue(film.getReplacementCost() >= 5 && film.getReplacementCost() <= 10);
		}

	}

	@Test
	public void test_query_with_actors() {
		List<Film> filmsWithActors = repo.queryByFilmWithActors();
		assertTrue(filmsWithActors.get(1).getActors().size() > 0);
		for (Film film : filmsWithActors) {
			assertTrue(film.getActors() != null);
		}
		System.out.println(filmsWithActors);
	}
}
