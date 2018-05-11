package com.skilldistillery.jpavideostore.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Customer;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Store;

public class RelationshipCRUDClient {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		RelationshipCRUDClient rcc = new RelationshipCRUDClient();
		
//		rcc.addNewActorToFilm("Jacob", "Smith", 507);
		
		
		rcc.newCustomerAndAddress("Hello World", "City", "Solid State", "101010101", "Compu", "Tron", em.find(Store.class, 1), "1010@10101.io", new Date());
	}

	public void addNewActorToFilm(String firstName, String lastName, int filmId) {
		Actor actor = new Actor(firstName, lastName);
		List<Film> films = actor.getFilms();
		if (films == null) {
			films = new ArrayList<>();
		}
		Film film = em.find(Film.class, filmId);
		films.add(film);
		actor.setFilms(films);
		em.getTransaction().begin();
		em.persist(actor);
		em.flush();
		em.getTransaction().commit();
	}

	public void newCustomerAndAddress(String street, String city, String state, String phone, String firstName, String lastName, Store store, String email, Date createdAt) {
		// Create new Address
		Address a = new Address();
		a.setStreet(street);
		a.setCity(city);
		a.setState(state);
		a.setPhone(phone);
		
		//Create new Customer
		Customer cust = new Customer();
		cust.setFirstName(firstName);
		cust.setLastName(lastName);
		cust.setStore(store);
		cust.setEmail(email);
		cust.setAddress(a);
		cust.setCreatedAt(createdAt);
		
		//Persist the Customer, and the address associated with it
		em.getTransaction().begin();
		em.persist(cust);
		em.flush();
		em.getTransaction().commit();
//		street
//		city
//		state
//		phone
//		Creates a new Customer object with the following values set:
//		firstName
//		lastName
//		store (use the store with id 1)
//		email
//		createdAt (use new Date() to get todays date)
//		address (use the address you just created)
	}
}
