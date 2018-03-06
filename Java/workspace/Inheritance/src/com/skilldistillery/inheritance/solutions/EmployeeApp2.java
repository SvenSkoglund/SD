package com.skilldistillery.inheritance.solutions;

import com.skilldistillery.inheritance.drills.Person;

public class EmployeeApp2 {

  public static void main(String[] args) {
    EmployeeApp2 app = new EmployeeApp2();
    app.run();
  }

  private void run() {
    Person pers = null;
    pers = new Person("Ronnie", "Dobbs", 34);
    System.out.println(pers.getInfo());
    
    Employee3 emp = null;
    emp = new Employee3("Bob", "Dobbs", 55, "VP of Sales", 138_000.00);
    System.out.println(emp.getInfo());
    
  }

}
