package com.skilldistillery.daopattern.solutions;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.daopattern.drills.President;
import com.skilldistillery.daopattern.drills.PresidentDAO;

public class MockPresidentDAO implements PresidentDAO {

  @Override
  public List<President> getPresidents() {
    List<President> presidents = new ArrayList<>();
    
    President p = new President(1, null, null, "C", 0, null, "Dems");
    President p2 = new President(2, null, null, "AAA", 0, null, "Whig");
    President p3 = new President(3, null, null, "AAA", 0, null, "Whig");
    
    presidents.add(p);
    presidents.add(p2);
    presidents.add(p3);
    
    return presidents;
  }

}
