package com.skilldistillery.data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	@NotNull
	@Email
	private String email;
	@Size(min = 6, max = 25)
	private String password;

	@Size(min = 3, max = 35)
	private String firstName;

	@Size(min = 3, max = 35)
	private String lastName;

	@Min(16)
	private Integer age;

	// firstName : size annotation, minimum 3, maximum 35
	//
	// lastName : size annotation, minimum 3, maximum 35
	//
	// age : minimum 16

	@Valid
	public User() {
	}

	@Valid
	public User(String e, String fn, String ln, String p, Integer a) {
		this.email = e;
		this.firstName = fn;
		this.lastName = ln;
		this.password = p;
		this.age = a;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
