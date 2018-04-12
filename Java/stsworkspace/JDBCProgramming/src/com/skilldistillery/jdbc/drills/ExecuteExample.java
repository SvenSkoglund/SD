package com.skilldistillery.jdbc.drills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteExample {
  public static void main(String args[]) {
    ExecuteExample example = new ExecuteExample();
    example.run();
  }

  private void run() {
    String url = "jdbc:mysql://localhost:3306/sdvid";
    String user = "student";
    String pword = "student";
    String sqlstring = readInSQLStatement();
    System.out.println("Executing SQL statement:\n" + sqlstring + "\n");
    try (Connection conn = DriverManager.getConnection(url, user, pword);
        Statement stmt = conn.createStatement();) {

      boolean haveResultSet = stmt.execute(sqlstring);
      if (haveResultSet) {
        ResultSet rs = stmt.getResultSet();
        ResultSetMetaData rsmd = rs.getMetaData();
        int cols = rsmd.getColumnCount();
        for (int col = 1; col <= cols; col++) {
          System.out.print(rsmd.getColumnName(col) + "\t");
        }
        System.out.println("");
        while (rs.next()) {
          for (int col = 1; col <= cols; col++) {
            System.out.print(rs.getString(col) + "\t");
          }
          System.out.println("");
        }
        rs.close();
      }
      else { // No result set.
        int uc = stmt.getUpdateCount();
        System.out.println(uc + " row(s) updated.");
      }
    }
    catch (SQLException e) {
      System.err.println(e);
    }
  }

  private static String readInSQLStatement() {
    String buf;
    StringBuilder sqlstring = new StringBuilder();
    try (BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));) {

      System.out.println("Enter a SQL statement. "
          + "To finish, enter 'q'");

      while ((buf = br.readLine()) != null) {
        if (buf.equals("q")) {
          break;
        }
        sqlstring.append(buf + " ");
      }
    }
    catch (IOException ioe) {
      System.err.println(ioe);
      System.exit(1);
    }
    return sqlstring.toString();
  }

  public ExecuteExample() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException e) {
      System.err.println("Error loading driver.");
      e.printStackTrace();
    }
  }
}
