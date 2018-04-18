package com.skilldistillery.jpavideostore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	// firstName -> SQL column name is first_name
	// lastName -> SQL column name is last_name
	// email -> SQL column name is email...no @Column necessary

	public Customer() {
		
	}
	
	@Id
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", email=").append(email).append("]");
		return builder.toString();
	}

	
	
}
