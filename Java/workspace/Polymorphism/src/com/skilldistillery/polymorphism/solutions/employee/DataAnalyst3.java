package com.skilldistillery.polymorphism.solutions.employee;

public class DataAnalyst3 extends Employee2 {
  private String securityClearance;

  public DataAnalyst3() {
  }

  public DataAnalyst3(String securityClearance, String firstName, String lastName, int age, String title,
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

  @Override
  public String getInfo() {
    return super.getInfo() + " " + securityClearance;
  }

  // DataAnalyst behavior...
  public String analyzeData(String data) {
    return data != null ? data.toUpperCase() : "Data is null";
  }
  
  @Override
  public void executeJob(String data) {
    System.out.println(analyzeData(data));
  }
}
