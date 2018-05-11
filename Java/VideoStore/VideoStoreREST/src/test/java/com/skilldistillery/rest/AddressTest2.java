package com.skilldistillery.rest;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.rest.repositories.AddressRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class AddressTest2 {

	@Autowired
	private AddressRepository addRepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_address_repo() {
		Address address = addRepo.findById(1).get();
		System.out.println(address);
		assertNotNull(address);
	}

}
