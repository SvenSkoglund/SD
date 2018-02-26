
/* Write a program that prompts the user for a String department code, a floating-point salary, and an integer employee id. Put each of the items in a separate variable, then:

Print each of the items and a string literal label separated by a space.
Print each of the items and a string literal label separated by a tab.
Print each of the items and a string literal label separated by a newline. */

import java.util.Scanner;

public class ThreeVariables {
  public static void main (String [] args ){

    String deptCode ;
    double salary ;
    int id;

    deptCode = promptDeptCode();
    salary = promptSalary();
    id = promptID();

    printSpace(deptCode,salary,id);
    printTabs(deptCode,salary,id);
    printLines(deptCode,salary,id);


  }

  public static String promptDeptCode(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter the department code: ");
     return scanner.next();
  }

  public static double promptSalary(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter the salary: ");
    return scanner.nextDouble();
  }

  public static int promptID(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter the ID: ");
    return scanner.nextInt();
  }

  public static void printSpace(String deptCode, double salary, int id){
        System.out.println("Dept Code: " + deptCode + " Salary: " + salary + " ID: " + id);
  }
  public static void printTabs(String deptCode, double salary, int id){
        System.out.println("Dept Code: " + deptCode + "\tSalary: " + salary + "\tID: " + id);
  }
  public static void printLines(String deptCode, double salary, int id){
    System.out.println("Dept Code: " + deptCode + "\nSalary: " + salary + "\nID: " + id);
  }
}
