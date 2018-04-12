package com.skilldistillery.polymorphism.solutions.employee;

import com.skilldistillery.polymorphism.solutions.employee.DataAnalyst;
import com.skilldistillery.polymorphism.solutions.employee.DatabaseAdmin;
import com.skilldistillery.polymorphism.solutions.employee.Employee;
import com.skilldistillery.polymorphism.solutions.employee.SoftwareDeveloper;

public class ExecuteJobApp {

  public static void main(String[] args) {
    ExecuteJobApp eja = new ExecuteJobApp();
    eja.run();
  }
  
  private void run() {
    Employee2 e0 = new Employee2("Jane", "Doer", 55, "Carpenter", 45000);
    Employee2 e1 = new DataAnalyst2("SECRET", "Harrison", "Ryan", 34, "Analyst I", 76_400);
    Employee2 e2 = new SoftwareDeveloper2("William", "Fences", 47, "SoftDev I", 63000.00);
    Employee2 e3 = new DatabaseAdmin2("Ronnie", "Dobbs", 31, "DBA", 112500.00);
    
    System.out.println(e0.getInfo()+"----");
    e0.executeJob("Building Stuff");
    System.out.println(e1.getInfo()+"----");
    e1.executeJob("Secret data A198209");
    System.out.println(e2.getInfo()+"----");
    e2.executeJob("Requirements Doc 12345");
    System.out.println(e3.getInfo()+"----");
    e3.executeJob("USERS");
  }

}
