package com.skilldistillery.setinterface.drills;

import java.util.Iterator;
import java.util.LinkedHashSet;
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
    
    Set<SportsTeam> teams = new LinkedHashSet<>();
    addTeam(teams, t1);
    addTeam(teams, t2);
    addTeam(teams, t3);
    addTeam(teams, t4);
    addTeam(teams, t5);
    
    // Iterate through the contents of the Set using an iterator, and print them to the screen.
    Iterator <SportsTeam> it = teams.iterator();
    while (it.hasNext()) {
    		SportsTeam st = it.next();
    		System.out.println(st);
    }
    // If the results are not as expected, fix SportsTeam.
  }
  
  // Change addTeam() to add the object to the Set.
  private void addTeam(Set<SportsTeam> set, SportsTeam t) {
    boolean added = false;
    added = set.add(t);
    System.out.println(t.getName() + " added: " + added);
  }
  
}
