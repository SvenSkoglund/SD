package com.skilldistillery.advancedarrays.labs;

public class SBScores {

	public static void main(String[] args) {
		// Write a program called SBScores to print out the teams and scores of the
		// first ten Super Bowls. (Find these on the internet. Note that since you know
		// the data values, using the 2d array shortcut is a great idea here.)
		//
		// Store the winning and losing score in a 2d array named superBowlScores.
		// Store the winning and losing teams in a 2d array called superBowlTeams.
		// Print the output in the format  Green Bay 35 - Kansas City 10
		
		String [] [] teams = {
				{"Green Bay", "Kansas City"},
				{"Green Bay", "Oakland"},
				{"New York Jets", "Baltimore"},
				{"Kansas City", "Minnesota"},
				{"Baltimore","Dallas"},
				{"Dallas", "Miami"},
				{"Miami","Washington"},
				{"Miami","Minnesota"},
				{"Pittsburgh","Minnesota"},
				{"Pittsburgh","Dalls"}
		};
		int[][] scores = {
                {35, 10},
                {33, 14},
                {16, 7},
                {23, 7},
                {16, 13},
                {24, 3},
                {14, 7},
                {24, 7},
                {16, 6},
                {21, 17},
        };
		
		for ( int i = 0 ; i < teams.length ; i ++) {
			System.out.println(teams[i][0] + " " + scores[i][0] + " - " + teams[i][1] + " " + scores[i][1]);
		}
				
	}

}
