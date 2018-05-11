package com.skilldistillery.jpavideostore.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Customer;

public class CustomerTest {

	private EntityManagerFactory emf;
	private EntityManager em;
	Customer cust;

	@BeforeEach
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
		em = emf.createEntityManager();
		cust = em.find(Customer.class, 1);
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
		emf.close();
	}

	@Test
	void test_customer_mappings() {
		assertNotNull(cust);
		assertEquals(1, cust.getId());
		assertEquals("Mary", cust.getFirstName());
		assertEquals("Smithers", cust.getLastName());
		assertEquals("MARY.SMITH@sdvidcustomer.org", cust.getEmail());
		assertEquals("2014-05-25", cust.getCreatedAt().toString());
	}

	  @Test
	  public void test_customer_to_address_association() {
	     Customer cust = em.find(Customer.class, 2);
	     Address address = cust.getAddress();
	     assertEquals("1121 Loja Avenue", address.getStreet());
	     assertEquals("", address.getStreet2());
	     assertEquals("San Bernardino", address.getCity());
	     assertEquals("17886", address.getPostalCode());
	  }
	  
	  @Test
	  public void test_rental_mapping() {
		  assertEquals(76, cust.getRentals().get(0).getId());
	  }
	  @Test
	  public void test_store_mapping() {
		  assertEquals("Los Angeles", cust.getStore().getAddress().getCity());
	  }
}