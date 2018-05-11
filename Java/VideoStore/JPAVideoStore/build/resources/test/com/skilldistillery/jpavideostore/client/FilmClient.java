package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Film;

public class FilmClient {

	public static void main(String[] args) {
		// Create an EntityManagerFactory so we can later create an EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		
		// Create an EntityManager using the EntityManagerFactory
		EntityManager em = emf.createEntityManager();
		
		// Use the Entity Manager to find a customer in the Database
		Film cust = em.find(Film.class, 1);
		System.out.println(cust);
		
		
		// No memory leaks...
		em.close();
		emf.close();
	}
}
