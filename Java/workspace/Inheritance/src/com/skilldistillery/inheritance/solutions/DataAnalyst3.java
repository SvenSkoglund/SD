package com.skilldistillery.inheritance.solutions;

public class DataAnalyst3 extends Employee4 {
  private String securityClearance;
  
  public DataAnalyst3(String securityClearance, String firstName, String lastName, int age, String title, double salary) {
    this.setSecurityClearance(securityClearance);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setAge(age);
    this.setTitle(title);
    this.setSalary(salary);
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
