package com.skilldistillery.advancedarrays.solutions;

import java.util.Scanner;

public class Months2DArrayPrompt {
  public static void main(String args[]) {

    String[][] months = {
        { "January", "Jan", "31" },
        { "February", "Feb", "28" },
        { "March", "Mar", "31" },
        { "April", "Apr", "30" },
        { "May", "May", "31" },
        { "June", "Jun", "30" },
        { "July", "Jul", "31" },
        { "August", "Aug", "31" },
        { "September", "Sep", "30" },
        { "October", "Oct", "31" },
        { "November", "Nov", "30" },
        { "December", "Dec", "31" }
    };

    String birthMonth = promptUserForMonth();
    
    String[] monthData = findMonthData(months, birthMonth);
    
    if(monthData != null) {
      System.out.println(monthData[0] + " - " + monthData[1] + " - " + monthData[2] );
    }
    else {
      System.out.println("Month " + birthMonth + " not recognized. Check your capitaliztion and spelling.");
    }
  }
  
  public static String promptUserForMonth() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the month in which you were born: ");
    
    String month = sc.next();
    sc.close();
    
    return month;
  }
  
  public static String[] findMonthData(String[][] months, String month) {
    String[] data = null;
    for(String[] monthData : months) {
      if(monthData[0].equals(month)) {
        data = monthData;
        break;
      }
    }
    
    return data;
  }

  
}
