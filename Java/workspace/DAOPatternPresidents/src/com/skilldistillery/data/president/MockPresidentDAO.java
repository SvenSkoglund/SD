package com.skilldistillery.data.president;

import java.util.ArrayList;
import java.util.List;

public class MockPresidentDAO implements PresidentDAO {
	List<President> p;
	{
		p = new ArrayList<President>();
		President p1 = new President(1, "sven", "richard", "Skoglund", 10, "got bored", "always");
		p.add(p1);
		President p2 = new President(2, "Mark", "Joseph", "Coleman", 1, "drugs", "green");
		p.add(p2);
		President p3 = new President(3, "John", "Bob", "Jones", 3, "sexual misconduct", "communist");
		p.add(p3);
	}

	@Override
	public List<President> getPresidents() {

		return p;
	}

	@Override
	public President getPresidentByTermNumber(int number) {
		for (President p1 : p) {
			if (p1.getTermNumber() == number) {
				return p1;
			}
		}
		return null;
	}

	@Override
	public List<President> findByParty(String string) {
		List<President> pParty = new ArrayList<>();
		for (President p1 : p) {
			if (p1.getParty().equals(string)) {
				pParty.add(p1);
			}
		}
		return pParty;
	}

	@Override
	public List<President> findByLastName(String string) {
		List<President> pLastName = new ArrayList<>();
		for (President p1 : p) {
			if (p1.getLastName().equals(string)) {
				pLastName.add(p1);
			}
		}
		return pLastName;
	}
}