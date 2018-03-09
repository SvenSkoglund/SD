package com.skilldistillery.trumpsimulator;

public class BigBill extends Obstacle{

	public void printEncounterMessage() {
		encounterMessage = "The Senate is voting on a bigly bill today and the vote is split between Democrats and Republicans. What should I do?\n";
		System.out.println(encounterMessage);
	}

	public int changeAR(int ar, int selection) {
		switch (selection) {
		case 1:
			ar += 3;
			System.out.println(
					"No one in Congress noticed I was gone, and I shaved a stroke off my handicap!");
			break;
		case 2:
			ar -= 20;
			System.out.println(
					"Wow, jeeze, bills are, like, really long. Not like my tweets!");
			break;

		case 3:
			ar -= 15;
			System.out.println("Both Democrats and Republicans are mad! The whole Swamp is against me!");
			break;

		case 4:
			ar -= 5;
			System.out
					.println("The Republican senators seem to just ignore me now-a-days.");
			break;
		}
		return ar;
	}


	String best = "\t1: Take the afternoon off and play a round of golf. I've had a long day.";
	String worse = "\t2: Let me just explain the bill to the holdouts and they'll come around.";
	String bad = "\t3: I'm a master negotiator with lots of business savvy. I'll get everyone together for a compromise.";
	String good = "\t4: Threaten the holdouts on my team - they won't get re-elected without my help!";
	{
		optionArray[2] = bad;
		optionArray[0] = best;
		optionArray[1] = worse;
		optionArray[3] = good;
	}

}

