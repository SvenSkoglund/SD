package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Staff;

public class IntermediateJPQLClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		String query = "select s from Staff s order by s.lastName";
		List<Staff> staff = em.createQuery(query, Staff.class).getResultList();
		for (Staff s : staff) {
			System.out.println(s);
		}
	}

}
