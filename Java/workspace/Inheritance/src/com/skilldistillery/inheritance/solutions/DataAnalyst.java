package com.skilldistillery.inheritance.solutions;

public class DataAnalyst extends Employee2 {
  private String securityClearance;

  public String getSecurityClearance() {
    return securityClearance;
  }

  public void setSecurityClearance(String securityClearance) {
    this.securityClearance = securityClearance;
  }
  
  public DataAnalyst(String securityClearance) {
    this.securityClearance = securityClearance;
  }
  
  public String getInfo() {
    return getName() + " " + age                    // protected in Person
        //+ " " + title + " " + salary              // private in Employee
        + " " + securityClearance;                  // private in DataAnalyst
  }
}
