package com.skilldistillery.setinterface.solutions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SportsTeamApp2 {

  public static void main(String[] args) {
    SportsTeamApp2 app = new SportsTeamApp2();
    app.launch();
  }

  private void launch() {
    SportsTeam t1 = new SportsTeam("Denver", "Vampires");
    SportsTeam t2 = new SportsTeam("Michigan", "Werewolves");
    SportsTeam t3 = new SportsTeam("Derry", "Clowns");
    SportsTeam t4 = new SportsTeam("Derry", "Clowns");
    SportsTeam t5 = new SportsTeam("Houston", "Chupacabras");
    
    // LinkedHashSet will maintain insertion order.
    // Note that we did not have to change the method definition 
    // because we used a Set<SportsTeam> as a method parameter.
    Set<SportsTeam> teams = new LinkedHashSet<>();
    addTeam(teams, t1);
    addTeam(teams, t2);
    addTeam(teams, t3);
    addTeam(teams, t4);
    addTeam(teams, t5);
    
    Iterator<SportsTeam> sIt = teams.iterator();
    while(sIt.hasNext()) {
      SportsTeam s = sIt.next();
      System.out.println(s);
    }
    
  }
  
  private void addTeam(Set<SportsTeam> set, SportsTeam t) {
    boolean added = set.add(t);
    System.out.println(t.getName() + " added: " + added);
    
  }
}
