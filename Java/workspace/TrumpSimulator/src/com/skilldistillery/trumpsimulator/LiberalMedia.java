package com.skilldistillery.trumpsimulator;

public class LiberalMedia extends Obstacle {

	public void printEncounterMessage() {
		encounterMessage = "The liberal fake news ran a hit piece on me because they're jealous. What should I do?\n";
		System.out.println(encounterMessage);
	}

	public int changeAR(int ar, int selection) {
		switch (selection) {
		case 1:
			System.out.println("People love me. I'm the best tweeter. I have the best tweets.");
			break;
		case 2:
			ar -= 15;
			System.out.println(
					"People are talking even more about collusion now. It was out of the news until I brought it up!");
			break;

		case 3:
			ar -= 10;
			System.out.println("Uh-oh, the employee I fired is writing a tell-all book!");
			break;

		case 4:
			ar += 2;
			System.out.println("They love me over there at FOX. Good people.");
			break;
		}
		return ar;
	}

	// public String [] badHairChoices()
	String good = "\t1: I'm a counter-puncher. Send out a tweet with a GIF of CNN getting hit by a train.";
	String worse = "\t2: NO COLLUSION. TRUMP-RUSSIA TOTALLY FABRICATED FAKE NEWS. CNN FAILING LOW ENERGY.";
	String bad = "\t3: Fire someone. Anyone. Who still works here?";
	String best = "\t4: Ignore it. I'll just switch over to Fox and Friends instead.";
	{
		optionArray[3] = best;
		optionArray[2] = bad;
		optionArray[0] = good;
		optionArray[1] = worse;
	}
}
