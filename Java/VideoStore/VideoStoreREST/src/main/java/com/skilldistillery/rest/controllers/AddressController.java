package com.skilldistillery.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.rest.data.AddressDAO;

@RestController
@RequestMapping("api")
public class AddressController {
	@Autowired
	private AddressDAO addressDAO;

	@RequestMapping(path = "addresses", method = RequestMethod.GET)
	public List<Address> index() {
		return addressDAO.index();
	}

	@RequestMapping(path = "addresses/{id}", method = RequestMethod.GET)
	public Address show(@PathVariable int id) {
		return addressDAO.show(id);
	}

	@RequestMapping(path = "addresses", method = RequestMethod.POST)
	public Address create(@RequestBody String jsonAddress) {
		return addressDAO.create(jsonAddress);
	}
}
