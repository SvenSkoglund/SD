package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Address;

public class IntermediateJPQLLab {
// In a main method write a query that counts the average length of the films in the database.

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		String query = "select avg(f.length) from Film f";
		Double length = em.createQuery(query, Double.class).getSingleResult();
		System.out.println(length);
		
		
		//Write a query that calculates the number of addresses grouped by their state.
		query = "select count(a) from Address a group by a.state";
		List <Long> addressesByState = em.createQuery(query, Long.class).getResultList();
		System.out.println(addressesByState);
	}

}
