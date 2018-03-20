package com.skilldistillery.history;

public class PresidentFirstNameMatcher implements PresidentMatcher {
  @Override
  public boolean matches(President pres, String string) {
    return pres.getFirstName().startsWith(string);
  }
}