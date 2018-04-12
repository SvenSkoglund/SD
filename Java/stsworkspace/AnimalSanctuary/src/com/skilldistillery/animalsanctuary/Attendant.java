package com.skilldistillery.animalsanctuary;

public class Attendant {
	public Attendant() {

	}

	public void feedAnimal(Animals a, int num) {

		System.out.println("I will feed " + a.firstName + " " + num + " pieces of food");
	}

	public void doRounds(Animals[] animalArray, int num) {
		for (int i = 0; i < animalArray.length; i++) {
			if (animalArray[i] != null) {
				feedAnimal(animalArray[i], num);
				animalArray[i].eat(num);
				System.out.println();
			}
		}
	}

}
