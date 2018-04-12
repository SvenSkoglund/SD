package com.skilldistillery.daopattern.drills;

import java.util.ArrayList;
import java.util.List;

public class MockPresidentDAO implements PresidentDAO {

	@Override
	public List<President> getPresidents() {
		List<President> list = new ArrayList<>();
		list.add(new President(1, null, null, "C", 0, null, "Dems"));
		list.add(new President(2, null, null, "AAA", 0, null, "Whig"));
		list.add(new President(3, null, null, "AAA", 0, null, "Whig"));
		return list;
	}

}
