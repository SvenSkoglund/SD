package com.skilldistillery.jpavideostore.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Customer;

public class CustomerClient {

	private EntityManagerFactory emf;
	private EntityManager em;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	void test_customer_mappings() {
		Customer cust = em.find(Customer.class, 1000);
		System.out.println(cust);
		assertNotNull(cust);
		assertEquals(1, cust.getId());
		assertEquals("Mary", cust.getFirstName());
		assertEquals("Smithers", cust.getLastName());
		assertEquals("MARY.SMITH@sdvidcustomer.org", cust.getEmail());
	}

	@Test
	void test_how_many_customers() {
		int i = 0;
		for (i = 0;; i++) {
			Customer cust = em.find(Customer.class, i);
			if (cust == null) {
				break;
			}
		}
		System.err.println(i);
	}
}