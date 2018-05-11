package com.skilldistillery.rest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.rest.repositories.AddressRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressTest {

	@Autowired
	AddressRepository addRepo;
	
	@Test
	public void test_address_repo() {
		Address address = addRepo.findById(1).get();
		System.out.println(address);
		assertNotNull(address);
	}
	


}


