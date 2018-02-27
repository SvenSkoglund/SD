package com.skilldistillery.advancedarrays.solutions;

public class SBScores {
  public static void main(String[] args) {
    int[][] superBowlScores = { { 35, 10 }, { 33, 14 }, { 16, 7 }, { 23, 7 },
        { 16, 13 }, { 24, 3 }, { 14, 7 }, { 24, 7 }, { 16, 6 }, { 21, 17 } };
    String[][] superBowlTeams = {
        { "Green Bay", "Kansas City" },
        { "Green Bay", "Oakland" },
        { "NY Jets", "Baltimore" },
        { "Kansas City", "Minnesota" },
        { "Baltimore", "Dallas" },
        { "Dallas", "Miami" },
        { "Miami", "Washington" },
        { "Miami", "Minnesota" },
        { "Pittsburgh", "Minnesota" },
        { "Pittsburgh", "Dallas" }
    };
    for (int i = 0; i < superBowlScores.length; i++) {
      int[] scores = superBowlScores[i];
      String[] teams = superBowlTeams[i];
      printScore(teams, scores);
    }
  }
  
  public static void printScore(String[] teams, int[] scores) {
    System.out.println(teams[0] + " " + scores[0] + " - " +
        teams[1] + " " + scores[1]);
  }
}
