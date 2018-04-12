package com.skilldistillery.jdbc.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class ExecuteFormat {

  public static void main(String args[]) {
    ExecuteFormat example = new ExecuteFormat();
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
        int numColumns = rsmd.getColumnCount();
        int colWidth[] = new int[numColumns]; // Place to store width of each column
        StringBuilder headerLine = new StringBuilder();
        for (int col = 1; col <= numColumns; col++) {
          colWidth[col - 1] = getAppDisplayWidth(rsmd, col);
          headerLine.append(rPadTrunc(rsmd.getColumnName(col), colWidth[col - 1], ' '));
          if (col < numColumns) {
            headerLine.append(" ");
          }
        }
        System.out.println(headerLine.toString());

        while (rs.next()) {
          StringBuilder resultLine = new StringBuilder();
          for (int col = 1; col <= numColumns; col++) {
            resultLine.append(rPadTrunc(rs.getString(col),colWidth[col - 1], ' '));
            if (col < numColumns) {
              resultLine.append(" ");
            }
          }
          System.out.println(resultLine);
        }
      }
      else { // No result set.
        int uc = stmt.getUpdateCount();
        System.out.println(uc + " row(s) updated.");
      }

    }
    catch (SQLException e) {
      e.printStackTrace();
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

  private static int getAppDisplayWidth(ResultSetMetaData rsmd, int col)
      throws SQLException {

    switch (rsmd.getColumnType(col)) {
      case Types.NUMERIC:
      case Types.INTEGER:
        return 9;
      case Types.TIMESTAMP:
        return 22;
      case Types.DATE:
        return 10;
      case Types.TIME:
        return 8;
      default:
        return rsmd.getColumnDisplaySize(col);
    }
  }

  private static String rPadTrunc(String s, int len, char c) {
    if (s == null) {
      s = "";
    }
    if (len <= s.length()) {
      return s.substring(0, len);
    }
    StringBuilder sb = new StringBuilder(s);
    for (int k = 0; k < (len - s.length()); k++) {
      sb.append(c);
    }
    return sb.toString();
  }

  public ExecuteFormat() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException e) {
      System.err.println("Error loading driver.");
      e.printStackTrace();
    }
  }

}
