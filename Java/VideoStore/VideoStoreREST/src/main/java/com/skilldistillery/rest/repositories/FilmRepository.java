package com.skilldistillery.rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Rating;

public interface FilmRepository extends JpaRepository<Film, Integer> {
	// Write a method stub that will find a film by its title.
	//
	// Write a method stub that will find a collection of films by there language.
	//
	// Write a method stub that will find a collection of films by there language as
	// well as there release year.
	//
	// Write a method stub that will find a collection of films that have
	// replacement costs within in a specific range.
	//
	// Write a method stub that will find a collection of films by there rating.

	Film findByTitle(String title);

	List<Film> findByLanguageName(String languageName);

	List<Film> findByLanguageNameAndReleaseYear(String languageName, int releaseYear);

	List<Film> findByReplacementCostBetween(Double low, Double high);
	
	@Query("SELECT f FROM Film f where replacementCost >= :min and replacementCost <= :max")
	List<Film> queryByReplacementCostInRange(@Param("min") double min, @Param("max") double max);

	@Query("SELECT f FROM Film f JOIN FETCH f.actors")
	List<Film> queryByFilmWithActors();
	
	
	List<Film> findByRating(Rating rating);	
}
