package com.skilldistillery.states.data;

public interface StateDAO {
  public State getStateByName(String name);
  public State getStateByAbbreviation(String abbreviation);
}
