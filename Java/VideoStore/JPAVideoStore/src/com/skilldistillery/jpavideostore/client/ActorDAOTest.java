package com.skilldistillery.jpavideostore.client;

import com.skilldistillery.jpavideostore.data.ActorDAO;
import com.skilldistillery.jpavideostore.data.ActorDAOImpl;
import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;

public class ActorDAOTest {

	public static void main(String[] args) {
		ActorDAO dao = new ActorDAOImpl();
		 Actor stefan = new Actor("Stefan", "Skoglund");		
		Film film = new Film();
		film.setTitle("The Title");
		film.setDescription("Desctibed here");
		film.setRentalRate(1.99);
		film.setReplacementCost(100);
		dao.createActorAndFilm(stefan, film);


		System.out.println(stefan);
		System.out.println(film);
	}

}
