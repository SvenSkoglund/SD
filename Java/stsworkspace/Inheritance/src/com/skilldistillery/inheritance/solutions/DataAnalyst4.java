package com.skilldistillery.inheritance.solutions;

public class DataAnalyst4 extends Employee6 {
  private String securityClearance;
  
  public DataAnalyst4(String securityClearance, String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
    this.setSecurityClearance(securityClearance);
  }

  public String getSecurityClearance() {
    return securityClearance;
  }

  public void setSecurityClearance(String securityClearance) {
    this.securityClearance = securityClearance;
  }
  
  // Call the parent method
  public String getInfo() {
    return super.getInfo() + " " + securityClearance;
  }
}
