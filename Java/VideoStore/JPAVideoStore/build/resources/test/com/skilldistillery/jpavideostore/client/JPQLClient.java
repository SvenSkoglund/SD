package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Staff;

public class JPQLClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();

		String query = "select s from Staff s where s.id < :id";
		List<Staff> emps = em.createQuery(query, Staff.class).setParameter("id", 25).getResultList();
		for (Staff s : emps) {
			System.out.println(s);
		}
		// In your JPQLClient class, write a JPQL statement to retrieve the last name of
		// any staff member whose id is less than 10. What would be the type of the
		// returned collection?
		
		String query2 = "select s.lastName from Staff s where s.id < 10";
		List<String> empsLastName = em.createQuery(query2, String.class).getResultList();
		for (String lastName : empsLastName) {
			System.out.println(lastName);
		}
		
		String queryString = "SELECT s.firstName, s.lastName FROM Staff s where id < 10";

		List<Object[]> results = em.createQuery(queryString, Object[].class)
		                          .getResultList();
		for(Object[] arr : results){
		  System.out.println("First name: " + arr[0] + " Last name: " + arr[1]);
		}

	}

}
