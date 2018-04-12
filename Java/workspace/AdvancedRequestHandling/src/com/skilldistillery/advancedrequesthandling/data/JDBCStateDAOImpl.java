package com.skilldistillery.advancedrequesthandling.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCStateDAOImpl implements StateDAO {

  private static String url = "jdbc:mysql://localhost:3306/historydb";

  private final String user = "historyuser";
  private final String pass = "historyuser";
  
  private final String fullDataQuery = "SELECT abbreviation, name, capital, latitude, longitude, capital_population "
      + "from STATE ";
  
  public JDBCStateDAOImpl() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }
  @Override
  public State getStateByName(String name) {
    State s = null;
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      String sql = fullDataQuery + " where name = ?";
      
      PreparedStatement st = conn.prepareStatement(sql);
      st.setString(1, name);
      
      ResultSet rs = st.executeQuery();
      if(rs.next()) {
        s = mapStateDataToState(rs);
      }
      
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return s;
  }
  @Override
  public State getStateByAbbreviation(String abbrev) {
    State s = null;
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      String sql = fullDataQuery + " where abbreviation = ?";
      
      PreparedStatement st = conn.prepareStatement(sql);
      st.setString(1, abbrev);
      
      ResultSet rs = st.executeQuery();
      if(rs.next()) {
        s = mapStateDataToState(rs);
      }
      
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return s;
  }
  
  private State mapStateDataToState(ResultSet rs) throws SQLException {
    State s = new State(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
    return s;
  }

  @Override
  public void addState(State state) {
    String sql = "INSERT INTO state (abbreviation, name, capital, latitude, longitude, capital_population) "
        + " VALUES (?, ?, ?, ?, ?, ?)";
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url, user, pass);
      conn.setAutoCommit(false); // Start transaction
      PreparedStatement st = conn.prepareStatement(sql);
      
      st.setString(1, state.getAbbreviation());
      st.setString(2, state.getName());
      st.setString(3, state.getCapital());
      st.setString(4, state.getLatitude());
      st.setString(5, state.getLongitude());
      st.setInt(6, state.getCapitalPopulation());
      st.executeUpdate();
      
      conn.commit();
      st.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

