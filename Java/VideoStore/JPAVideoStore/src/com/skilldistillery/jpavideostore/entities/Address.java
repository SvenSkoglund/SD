package com.skilldistillery.jpavideostore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	// firstName -> SQL column name is first_name
	// lastName -> SQL column name is last_name
	// email -> SQL column name is email...no @Column necessary

	public Address() {
		
	}
	
	public Address(String street, String state, String city, String postalCode, String phone) {
		super();
		this.street = street;
		this.state = state;
		this.city = city;
		this.postalCode = postalCode;
		this.phone = phone;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="address")
	private String street;

	@Column(name="address2")
	private String street2;
	
	@Column(name="state_province")
	private String state;

	private String city;
	
	@Column(name="postal_code")
	private String postalCode;

	private String phone;
//	
//	@OneToOne(mappedBy = "address")
//	private Customer customer;
//
//	@OneToOne(mappedBy = "address")
//	private Store store;
	
	@ManyToOne
	@JoinColumn(name="country_code")
	private Country country;
	
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//
//	public Store getStore() {
//		return store;
//	}
//
//	public void setStore(Store store) {
//		this.store = store;
//	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [id=").append(id).append(", street=").append(street).append(", street2=")
				.append(street2).append(", state=").append(state).append(", city=").append(city).append(", postalCode=")
				.append(postalCode).append(", phone=").append(phone).append("]");
		return builder.toString();
	}
	
	
}

	
	