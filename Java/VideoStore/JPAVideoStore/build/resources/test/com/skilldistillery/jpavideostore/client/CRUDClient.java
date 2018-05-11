package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Customer;

public class CRUDClient {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	private static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
//		updateNullEmails();

		
//		String myStreet = "7335 E Quincy Ave";
//		String myCity = "Denver";
//		String myState = "Colorado";
//		String myPostalCode = "80237";
//		String myPhone = "9707598363";
//		addAddress(myStreet, myCity, myState, myPostalCode, myPhone);
		
		deleteAddress(730);
	}

	public static void updateNullEmails() {
		String query = "select c from Customer c where email = '' or email is null";
		List<Customer> custs = em.createQuery(query, Customer.class).getResultList();
		em.getTransaction().begin();
		for (Customer c : custs) {
			c.setEmail(c.getFirstName() + "." + c.getFirstName() + "@sdvidcustomer.org");
		}
		em.flush();
		em.getTransaction().commit();

	}
	// This method should create a new Address object, and set its values to your
	// personal information (street, city, state, postalCode, phone).
	public static boolean addAddress(String street, String city, String state, String postalCode, String phone) {
		Address toBeAdded = new Address(street, state, city, postalCode, phone);
		em.getTransaction().begin();;
		em.persist(toBeAdded);
		em.flush();
		em.getTransaction().commit();
		
		if (em.contains(toBeAdded)) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean deleteAddress(int id) {
		Address toBeDeleted = em.find(Address.class, id);
		em.getTransaction().begin();
		em.remove(toBeDeleted);
		em.flush();
		em.getTransaction().commit();
		
		if (em.contains(toBeDeleted)) {
			return false;
		}else {
			return true;
		}
		
	}
}
