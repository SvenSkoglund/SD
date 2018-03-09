package com.skilldistillery.trumpsimulator;

public class PressConference extends Obstacle {
	public void printEncounterMessage() {
		encounterMessage = "I'm calling a press conference today. What should I talk about?\n";
		System.out.println(encounterMessage);
	}

	public int changeAR(int ar, int selection) {
		switch (selection) {
		case 1:
			ar += 3;
			System.out.println(
					"I sure do love talking about my favorite subject!");
			break;
		case 2:
			ar -= 20;
			System.out.println(
					"Reporters are so rude! Why don't they treat me like those Russian journalists treat Putin?");
			break;

		case 3:
			ar -= 15;
			System.out.println("The media doesn't like hearing the truth!");
			break;

		case 4:
			ar -= 5;
			System.out
					.println("Well, I didn't say anything outrageous. Unfortunately I'm also not a great reader.");
			break;
		}
		return ar;
	}


	String best = "\t1: My historic election win last November.";
	String worse = "\t2: Take questions from the reporters.";
	String bad = "\t3: Wing it. The people want to hear a real person talk, not a politician!";
	String good = "\t4: Just stick to the teleprompter, don't go off-script.";
	{
		optionArray[2] = bad;
		optionArray[0] = best;
		optionArray[1] = worse;
		optionArray[3] = good;
	}

}
