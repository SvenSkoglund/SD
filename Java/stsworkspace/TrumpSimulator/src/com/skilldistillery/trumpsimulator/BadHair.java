package com.skilldistillery.trumpsimulator;

public class BadHair extends Obstacle {

	public void printEncounterMessage() {
		encounterMessage = "Another day. The best day. I have to look good. How should I do my hair?\n";
		System.out.println(encounterMessage);
	}

	public int changeAR(int ar, int selection) {
		switch (selection) {
		case 1:
			ar += 5;
			System.out.println(
					"No one talked about your hair today, the news was too distracted by the other three ongoing scandals.");
			break;
		case 2:
			ar -= 15;
			System.out.println("People noticed the hair. They did not say good things about it.");
			break;

		case 3:
			ar -= 5;
			System.out.println("MAGA hat always plays well with the base, but the snobby coastal elites on TV didn't like it.");
			break;

		case 4:
			ar -= 20;
			System.out.println("Old and bald does NOT suit you. The cyber is lighting up!");
			break;
		}
		return ar;
	}

	String best = "\t1: Just comb it over. It's all natural, no one will notice anyway!";
	String good = "\t3: Bring out a spare MAGA hat. The rubes will love it.";
	String bad = "\t2: Ignore it. My hair always looks great!";
	String worse = "\t4: Shave it. I have a big, glorious dome, the best dome, people are saying.";
	{
		optionArray[0] = best;
		optionArray[1] = bad;
		optionArray[2] = good;
		optionArray[3] = worse;
	}

}
