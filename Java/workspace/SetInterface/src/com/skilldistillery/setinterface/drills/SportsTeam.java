package com.skilldistillery.setinterface.drills;

public class SportsTeam {
  private String name;
  private String city;
  
  public SportsTeam(String city, String name) {
    super();
    this.name = name;
    this.city = city;
  }
  
  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("SportsTeam [name=");
    builder.append(name);
    builder.append(", city=");
    builder.append(city);
    builder.append("]");
    return builder.toString();
  }
}
