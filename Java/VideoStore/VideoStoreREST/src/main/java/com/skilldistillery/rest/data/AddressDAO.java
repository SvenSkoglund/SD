package com.skilldistillery.rest.data;

import java.util.List;

import com.skilldistillery.jpavideostore.entities.Address;

public interface AddressDAO {

	List<Address> index();

	Address show(int id);

	Address create(String addressJson);

}
