package com.skilldistillery.states.data;

import java.util.List;

public interface StateDAO {
	public State getStateByName(String name);

	public State getStateByAbbreviation(String abbreviation);

	void addState(State state);

	List<State> getStates();
}
