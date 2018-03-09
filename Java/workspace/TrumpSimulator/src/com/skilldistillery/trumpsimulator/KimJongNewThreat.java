package com.skilldistillery.trumpsimulator;

public class KimJongNewThreat extends Obstacle {

	public void printEncounterMessage() {
		encounterMessage = "It's 7:30pm, time to start winding down the day and browse through my Twitter feed. Little Rocket Man issued another nuclear threat. What should I do?\n";
		System.out.println(encounterMessage);
	}

	public int changeAR(int ar, int selection) {
		switch (selection) {
		case 1:
			ar -= 5;
			System.out.println(
					"Rocket Man sent back a tweet threatening to blow California off the map. I'll have to use scarier words next tweet.");
			break;
		case 2:

			System.out.println(
					"My Secretary of Defense decided not to send off an impetuous tweet to an unstable world leader who controls nuclear weapons. Boring!");
			break;

		case 3:
			ar += 3;
			System.out.println("I decided to just go to bed. I'm so presidential. Like Honest Abe.");
			break;

		case 4:
			ar -= 20;
			System.out
					.println("The adults in the room won't let me drop a bomb on Little Kimmy. DEEP STATE GLOBALISTS!");
			break;
		}
		return ar;
	}

	// public String [] badHairChoices()
	String bad = "\t1: Fire off another intimidating \"Fire and Fury\" tweet. That'll show him.";
	String good = "\t2: Where's Mattis? I'll just let him handle this.";
	String best = "\t3: Go to bed. I'll tweet about it in the morning.";
	String worse = "\t4: We have the nuclear. Why can't we use the nuclear?";
	{
		optionArray[2] = best;
		optionArray[0] = bad;
		optionArray[1] = good;
		optionArray[3] = worse;
	}

}
