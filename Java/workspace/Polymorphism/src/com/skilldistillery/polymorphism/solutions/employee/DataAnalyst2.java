package com.skilldistillery.polymorphism.solutions.employee;

public class DataAnalyst2 extends Employee2 {
  private String securityClearance;

  public DataAnalyst2() {
  }

  public DataAnalyst2(String securityClearance, String firstName, String lastName, int age, String title,
      double salary) {
    super(firstName, lastName, age, title, salary);
    this.setSecurityClearance(securityClearance);
  }

  public String getSecurityClearance() {
    return securityClearance;
  }

  public void setSecurityClearance(String securityClearance) {
    this.securityClearance = securityClearance;
  }

  public String getInfo() {
    return super.getInfo() + " " + securityClearance;
  }

  // DataAnalyst behavior...
  public String analyzeData(String data) {
    return data != null ? data.toUpperCase() : "Data is null";
  }
  
  public void executeJob(String data) {
    System.out.println(analyzeData(data));
  }
}
