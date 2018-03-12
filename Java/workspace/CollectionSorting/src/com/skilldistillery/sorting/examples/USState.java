package com.skilldistillery.sorting.examples;

public class USState {
  private String abbreviation;
  private String name;
  private String capital;
  private String admissionDate;
  private int population;

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public String getAdmissionDate() {
    return admissionDate;
  }

  public void setAdmissionDate(String admissionDate) {
    this.admissionDate = admissionDate;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public USState() {
  }

  public USState(String abbreviation, String name, String capital, String admissionDate, int population) {
    super();
    this.abbreviation = abbreviation;
    this.name = name;
    this.capital = capital;
    this.setAdmissionDate(admissionDate);
    this.population = population;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("USState [abbreviation=").append(abbreviation).append(", name=").append(name).append(", capital=")
        .append(capital).append(", admissionDate=").append(admissionDate).append(", population=").append(population)
        .append("]");
    return builder.toString();
  }

}
