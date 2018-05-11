package com.skilldistillery.rest.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skilldistillery.jpavideostore.entities.Address;

@Service
@Transactional
public class AddressDAOImpl implements AddressDAO {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Address> index(){
		  String query = "Select a from Address a";
		  return em.createQuery(query, Address.class).getResultList();
		}
	
	@Override
	public Address show(int id){
		  return em.find(Address.class, id);
		}
	@Override
	public Address create(String addressJson){
		  Address address = null;
		  try{
		    ObjectMapper mapper = new ObjectMapper();
		    address = mapper.readValue(addressJson, Address.class);
		    em.persist(address);
		    em.flush();
		  }
		  catch(Exception e){
		    e.printStackTrace();
		  }

		  return address;
		}
}
