package com.skilldistillery.animalsanctuary;

public class SanctuarySimulator {
	private  Attendant att;
	private  Sanctuary sanc;

	public static void main(String[] args) {
		Attendant att = new Attendant();
		Sanctuary sanc = new Sanctuary(att);
		
		Lion simba = new Lion("Simba");
		Hippo mottomotto = new Hippo("Motto Motto");
		Giraffe jeffery = new Giraffe("Jeffery");
		Elephant dumbo = new Elephant("Dumbo");
		
		sanc.addAnimal(simba);
		sanc.addAnimal(mottomotto);
		sanc.addAnimal(jeffery);
		sanc.addAnimal(dumbo);
		
		att.doRounds(sanc.getAnimalArray(), 10);
		simba.eat(jeffery);
	}

	public SanctuarySimulator() {
	}

	private void run() {

	}
}
