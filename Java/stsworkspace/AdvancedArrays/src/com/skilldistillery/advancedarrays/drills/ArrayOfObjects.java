package com.skilldistillery.advancedarrays.drills;

import com.skilldistillery.advancedarrays.drills.PopStar;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// Instantiate an Array to hold PopStar objects.
		PopStar ps1 = new PopStar();
		ps1.name = "T Boz";

		PopStar ps2;
		ps2 = new PopStar();
		ps2.name = "Left Eye";

		PopStar ps3;
		ps3 = new PopStar();
		ps3.name = "Chilli";

		PopStar[] tlc = new PopStar[3];
		tlc[0] = ps1;
		tlc[1] = ps2;
		tlc[2] = ps3;

		PopStar[] ps = new PopStar[4];
		// Create PopStar instances and add them to the array.
		ps[0] = new PopStar();
		ps[0].name = "Michael";

		ps[1] = new PopStar();
		ps[1].name = "David";

		ps[2] = new PopStar();
		ps[2].name = "Lady Gaga";

		ps[3] = new PopStar();
		ps[3].name = "Madonna";
		// Call the method allSing, passing your array.

		allSing(ps);
	}

	public static void allSing(PopStar[] stars) {

		for (PopStar star : stars) {
			star.sing();
		}
	}

}
