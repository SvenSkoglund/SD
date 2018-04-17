package com.skilldistillery.states.data;

public interface StateDAO {
  public State getStateByName(String name);
  public State getStateByAbbreviation(String abbreviation);
  public void addState(State state);
  public State getNextState(State current);
  public State getPreviousState(State current);
}
