package com.skilldistillery.polymorphism.solutions.employee;

public class DatabaseAdmin extends Employee {

  public DatabaseAdmin() {
    super();
  }

  public DatabaseAdmin(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  // DatabaseAdmin behavior...
  public String createTables(String tableName) {
    return "Created table " + tableName;
  }
  
}
