package com.skilldistillery.jdbc.solutions.labs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ActorAdder {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    ActorAdder adder = new ActorAdder();
    adder.addActor(input);
  }

  public void addActor(Scanner input) {
    String url = "jdbc:mysql://localhost:3306/sdvid";
    String user = "student";
    String pword = "student";
    String firstName = getStringInput(input, "Enter the first name: ");
    String lastName = getStringInput(input, "Enter the last name: ");
    String sql = "INSERT INTO actor (first_name, last_name) VALUES (?, ?)";
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url, user, pword);
      conn.setAutoCommit(false); // Start transaction
      PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      st.setString(1, firstName);
      st.setString(2, lastName);
      int uc = st.executeUpdate();
      System.out.println(uc + " actor record created.");
      // Now get the auto-generated actor ID:
      ResultSet keys = st.getGeneratedKeys();
      if (keys.next()) {
        System.out.println("New actor ID: " + keys.getInt(1));
      }
      conn.commit();
      st.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private String getStringInput(Scanner input, String string) {
    System.out.print(string);
    String inputString = input.nextLine();
    return inputString;
  }

}