package com.skilldistillery.animalsanctuary;

public class Carnivore extends Animals {

	public Carnivore() {

	}

	public Carnivore(String name) {
		firstName = name;
	}

	public Animals eat(Animals a) {
		System.out.println("I am a " + getClass().getSimpleName() + " and I just ate " + a.firstName + " the "+ a.getClass().getSimpleName());
		makeNoise();
		return a;

	}
}
