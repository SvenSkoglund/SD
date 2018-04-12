package com.skilldistillery.jdbc.solutions.labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerLister {
  private static String url = "jdbc:mysql://localhost:3306/sdvid";

  public CustomerLister() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    CustomerLister lister = new CustomerLister();
    lister.listFirstTwenty();
  }

  private void listFirstTwenty() throws SQLException {
    String user = "student";
    String pass = "student";
    Connection conn = DriverManager.getConnection(url, user, pass);
    String sqltext;
    //                1   2           3          4      5
    sqltext = "SELECT id, first_name, last_name, email, last_update FROM customer ORDER BY last_name"; /////
    PreparedStatement stmt = conn.prepareStatement(sqltext);
    ResultSet rs = stmt.executeQuery();

    int counter = 0;
    StringBuilder sb = new StringBuilder();
    while (rs.next() && counter++ < 20) {
      sb.append(rs.getInt("id"));
      sb.append(": ");
      sb.append(rs.getString(2));
      sb.append(" ");
      sb.append(rs.getString(3));
      sb.append(" ");
      sb.append(rs.getString(4));
      sb.append(", last updated ");
      sb.append(rs.getTimestamp(5));
      System.out.println(sb.toString());
      sb.delete(0, sb.length());
    }

    rs.close();
    stmt.close();
    conn.close();
  }

}
