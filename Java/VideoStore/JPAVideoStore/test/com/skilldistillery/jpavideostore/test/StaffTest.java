package com.skilldistillery.jpavideostore.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Staff;

public class StaffTest {

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
	void test_staff_mappings() {
		Staff staff = em.find(Staff.class, 1);
		// 1 | Larry | Kong | 666 | larry.kong@example.com | 4 | NULL | 1 | lkong |
		// 8cb2237d0679ca88db6464eac60da96345513964
		assertNotNull(staff);
		assertEquals(1, staff.getId());
		assertEquals("Larry", staff.getFirstName());
		assertEquals("Kong", staff.getLastName());
		assertEquals("larry.kong@example.com", staff.getEmail());
		

	}

	@Test
	void test_address_mapping() {
		Staff staff = em.find(Staff.class, 1);
		assertEquals("370 E. Rochelle Blvd", staff.getAddress().getStreet());
	}
	@Test
	void test_store_mapping() {
		Staff staff = em.find(Staff.class, 1);
		assertEquals("Las Vegas", staff.getStore().getAddress().getCity());
	}
}