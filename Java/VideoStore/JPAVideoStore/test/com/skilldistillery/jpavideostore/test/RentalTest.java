package com.skilldistillery.jpavideostore.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Rental;

public class RentalTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	private Rental rental;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		rental = em.find(Rental.class, 1);

	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	void test_rental_mappings() {
// | id | rental_date         | inventory_id | customer_id | return_date         | staff_id |
// |  1 | 2014-05-24 22:53:30 |        14072 |         130 | 2014-05-26 22:04:30 |       46 |
		assertNotNull(rental);
		assertEquals(1,rental.getId());
		assertEquals("2014-05-24 22:53:30.0",rental.getRentalDate().toString());
		assertEquals("2014-05-26 22:04:30.0",rental.getReturnDate().toString());


	}
	@Test
	void test_staff_mapping() {
		assertEquals("William", rental.getStaff().getFirstName());
	}
	
	@Test
	void test_customer_mapping() {
		assertEquals("Charlotte", rental.getCustomer().getFirstName());
	}
	
	@Test
	void test_II_mapping() {
		System.out.println(rental);
		assertNotNull(rental.getItem());
		System.out.println(rental.getItem());
	}

}