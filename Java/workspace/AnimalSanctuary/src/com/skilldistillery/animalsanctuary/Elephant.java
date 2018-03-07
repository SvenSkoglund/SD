package com.skilldistillery.animalsanctuary;

public class Elephant extends Herbivore {

	public Elephant() {

	}

	public Elephant(String name) {
		this.firstName = name;
	}

	public void eat(int num) {
		System.out.println("I just ate " + num + " lbs of palm frond. Yum!");
		makeNoise();
	}

	public void makeNoise() {
		System.out.println("Chomp, chomp, chomp!!!");
	}

}
