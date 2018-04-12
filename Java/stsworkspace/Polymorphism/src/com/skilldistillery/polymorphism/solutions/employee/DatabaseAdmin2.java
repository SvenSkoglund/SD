package com.skilldistillery.polymorphism.solutions.employee;

public class DatabaseAdmin2 extends Employee2 {

  public DatabaseAdmin2() {
    super();
  }

  public DatabaseAdmin2(String firstName, String lastName, int age, String title, double salary) {
    super(firstName, lastName, age, title, salary);
  }
  
  // DatabaseAdmin behavior...
  public String createTables(String tableName) {
    return "Created table " + tableName;
  }
  
  public void executeJob(String data) {
    System.out.println(createTables(data));
  }
  
}
