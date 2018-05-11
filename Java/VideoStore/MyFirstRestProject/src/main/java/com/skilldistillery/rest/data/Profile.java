package com.skilldistillery.rest.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Profile {

	// name, username, email, and password.

	private String name;

	private User user;

	public Profile() {

	}

	public Profile(String name, User user) {
		super();
		this.name = name;
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}