package com.skilldistillery.data.president;

import java.util.List;

public interface PresidentDAO {
  List<President> getPresidents();
  President getPresidentByTermNumber(int number);
  List<President> findByParty(String string);
  List<President> findByLastName(String string);
}
