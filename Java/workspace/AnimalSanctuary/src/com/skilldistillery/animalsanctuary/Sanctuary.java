package com.skilldistillery.animalsanctuary;

public class Sanctuary {
	private Animals[] animalArray = new Animals[10];
	private Attendant att;


	private int currentAnimalIndex;

	public Sanctuary(Attendant att) {
		this.att = att;
	}

	public Sanctuary(Attendant att, int num) {
		this.att = att;
		currentAnimalIndex = num;
	}

	public Sanctuary(Animals[] animalArray, Attendant att) {
		this.att = att;
		this.animalArray = animalArray;
	}

	public void addAnimal(Animals a) {
		for (int i = 0; i < animalArray.length; i++) {
			if (animalArray[i] == null) {
				animalArray[i] = a;
				return;
			}
		}
		System.out.println("No more room for animals");
	}

	public void startAttendantRounds(int num) {
		att.doRounds(animalArray, num);
	}
	public Animals[] getAnimalArray() {
		return animalArray;
	}

}