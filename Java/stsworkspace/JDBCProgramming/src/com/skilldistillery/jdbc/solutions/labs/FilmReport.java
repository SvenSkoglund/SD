package com.skilldistillery.jdbc.solutions.labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class FilmReport {
  public static void main(String args[]) {
    FilmReport report = new FilmReport();
    report.reportReplacementCosts();
  }

  private void reportReplacementCosts() {
    String url = "jdbc:mysql://localhost:3306/sdvid";
    String user = "student";
    String pword = "student";
    String sqltxt;
    sqltxt = "SELECT title, replacement_cost FROM film";

    try (Connection conn = DriverManager.getConnection(url, user, pword);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqltxt);) {
      String title;
      float cost;
      float totalCost = 0.0F;

      while (rs.next()) {
        title = rs.getString(1);
        cost = rs.getFloat(2);
        totalCost += cost;
        System.out.printf("%1s \t %2.2f %n", title, cost);
      }
      System.out.println("----------\nTotal cost: " + totalCost);
    }
    catch (SQLException sqle) {
      System.err.println(sqle);
    }
  }

  public FilmReport() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException e) {
      System.err.println("Error loading driver.");
      e.printStackTrace();
    }
  }
}
