package com.skilldistillery.inheritance.solutions;

import com.skilldistillery.inheritance.drills.Person;

public class EmployeeApp3 {

  public static void main(String[] args) {
    EmployeeApp3 app = new EmployeeApp3();
    app.run();
  }

  private void run() {
    Person pers = null;
    pers = new Person("Ronnie", "Dobbs", 34);
    System.out.println(pers.getInfo());
    
    Employee4 emp = null;
    emp = new Employee4("Bob", "Dobbs", 55, "VP of Sales", 138_000.00);
    System.out.println(emp.getInfo());
    
    DataAnalyst2 dataAnalyst = new DataAnalyst2("TOP SECRET", "James", "Java", 45, "Analyst IV", 120_000.00);
    System.out.println(dataAnalyst.getInfo());
    
  }

}
