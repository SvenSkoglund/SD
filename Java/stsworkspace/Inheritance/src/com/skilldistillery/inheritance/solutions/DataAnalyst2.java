package com.skilldistillery.inheritance.solutions;

public class DataAnalyst2 extends Employee4 {
  private String securityClearance;
  
  public DataAnalyst2(String securityClearance, String firstName, String lastName, int age, String title, double salary) {
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

  public String getInfo() {
    return getName() + " " + age                    // protected in Person
        + " " + getTitle() + " " + getSalary()      // visible methods from Employee
        + " " + securityClearance;                  // private in DataAnalyst
  }
}
