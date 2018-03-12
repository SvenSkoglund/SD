package com.skilldistillery.setinterface.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SportsTeamApp {

  public static void main(String[] args) {
    SportsTeamApp app = new SportsTeamApp();
    app.launch();
  }

  private void launch() {
    SportsTeam t1 = new SportsTeam("Denver", "Vampires");
    SportsTeam t2 = new SportsTeam("Michigan", "Werewolves");
    SportsTeam t3 = new SportsTeam("Derry", "Clowns");
    SportsTeam t4 = new SportsTeam("Derry", "Clowns");
    SportsTeam t5 = new SportsTeam("Houston", "Chupacabras");
    
    Set<SportsTeam> teams = new HashSet<>();
    addTeam(teams, t1);
    addTeam(teams, t2);
    addTeam(teams, t3);
    addTeam(teams, t4);
    addTeam(teams, t5);
    
    // Iterate through the contents of the Set using an iterator, and print them to the screen
    Iterator<SportsTeam> sIt = teams.iterator();
    while(sIt.hasNext()) {
      SportsTeam s = sIt.next();
      System.out.println(s);
    }
    
    // If the results are not as expected, fix SportsTeam.
    //   SportsTeam does not have an equals() method, so the Set
    //   does not know when it's looking at a duplicate object.
  }
  
  //Change addTeam() to add the object to the Set.
  private void addTeam(Set<SportsTeam> set, SportsTeam t) {
    boolean added = set.add(t);
    System.out.println(t.getName() + " added: " + added);
    
  }
}
