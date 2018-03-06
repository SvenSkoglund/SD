package com.skilldistillery.inheritance.solutions;

import com.skilldistillery.inheritance.drills.Person;

public class EmployeeApp5 {

  public static void main(String[] args) {
    EmployeeApp5 app = new EmployeeApp5();
    app.run();
  }

  private void run() {
    Person pers = null;
    pers = new Person("Ronnie", "Dobbs", 34);
    System.out.println(pers.getInfo());
    
    Employee5 emp = null;
    emp = new Employee5("Bob", "Dobbs", 55, "VP of Sales", 138_000.00);
    System.out.println(emp.getInfo());
    
    DataAnalyst3 dataAnalyst = new DataAnalyst3("TOP SECRET", "James", "Java", 45, "Analyst IV", 120_000.00);
    System.out.println(dataAnalyst.getInfo());
    
  }

}
