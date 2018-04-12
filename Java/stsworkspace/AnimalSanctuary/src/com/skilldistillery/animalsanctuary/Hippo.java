package com.skilldistillery.animalsanctuary;

public class Hippo extends Carnivore {
	public Hippo() {

	}

	public Hippo(String name) {
		this.firstName = name;
	}

	public void eat(int num) {
		System.out.println("I just ate " + num + " lbs of aquatic plants. Yuck!");
		makeNoise();
	}

	public void makeNoise() {
		System.out.println("Splash, splash, splash. ");
	}

}
