package com.skilldistillery.rest.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	// name, username, email, and password.

	private String name;

	private String username;

	private String email;

	private String password;

	@JsonIgnore
	private Profile profile;

	public User() {

	}
	
	public User(String name, String username, String email, String password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public User(String name, String username, String email, String password, Profile profile) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
