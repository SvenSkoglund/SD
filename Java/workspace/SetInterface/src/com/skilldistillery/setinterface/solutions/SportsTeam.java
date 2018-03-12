package com.skilldistillery.setinterface.solutions;

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

  /*
   * HashSet relies on hashCode and equals to determine if an object is
   * already in the set.
   * The default Object.hashCode returns a unique number for each object
   * regardless of its state.
   * The default Object.equals compares object references, not state.
   * 
   * You can have Eclipse generate equals and hashCode based on values
   * of instance variables.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((city == null) ? 0 : city.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SportsTeam other = (SportsTeam) obj;
    if (city == null) {
      if (other.city != null)
        return false;
    }
    else if (!city.equals(other.city))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    }
    else if (!name.equals(other.name))
      return false;
    return true;
  }
  
}
