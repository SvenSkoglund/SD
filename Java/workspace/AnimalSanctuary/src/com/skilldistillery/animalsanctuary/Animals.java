package com.skilldistillery.animalsanctuary;

public class Animals {
	protected String firstName;

	public Animals() {

	}

	public Animals(String name) {
		firstName = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void eat(int num) {
		System.out.println("I ate " + num + " pieces of food. ");
		makeNoise();
	}

	public void makeNoise() {
		System.out.println("Get me out of here!!! ");
	}

}
