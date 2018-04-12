package com.skilldistillery.data.president;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JDBCPresidentDAOImpl implements PresidentDAO {

  private static String url = "jdbc:mysql://localhost:3306/historydb";

  private final String user = "historyuser";
  private final String pass = "historyuser";
  
  private final String fullDataQuery = "SELECT term, first_name, middle_name, last_name, inauguration_date, "
      + "date_left_office, elections_won, reason_left_office, party "
      + "from PRESIDENT ";
  
  public JDBCPresidentDAOImpl() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }
  
  @Override
  public List<President> getPresidents() {
    List<President> presidents = new ArrayList<>();
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      String sql = fullDataQuery;
      PreparedStatement st = conn.prepareStatement(sql);
      ResultSet rs = st.executeQuery();
      while(rs.next()) {
        presidents.add(mapResultSetToPresident(rs));
      }
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return presidents;
  }

  @Override
  public President getPresidentByTermNumber(int number) {
    President p = null;
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      String sql = fullDataQuery + "WHERE term = ?";
      
      PreparedStatement st = conn.prepareStatement(sql);
      st.setInt(1, number);
      
      ResultSet rs = st.executeQuery();
      if(rs.next()) {
        p = mapResultSetToPresident(rs);
      }
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return p;
  }
  
  private President mapResultSetToPresident(ResultSet rs) throws SQLException {
    Date termStartDt = rs.getDate(5);
    Date termEndDt = rs.getDate(6);
    
    LocalDate termStart = termStartDt.toLocalDate();
    LocalDate termEnd = null;
    if (termEndDt != null) {
      termEnd = termEndDt.toLocalDate();
    }
    President p = new President(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
        termStart, termEnd, rs.getInt(7), rs.getString(8), rs.getString(9));
    
    return p;
  }

  @Override
  public List<President> findByParty(String string) {
    List<President> presidents = new ArrayList<>();
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      String sql = fullDataQuery + "WHERE party = ?";
      
      PreparedStatement st = conn.prepareStatement(sql);
      st.setString(1, string);
      
      ResultSet rs = st.executeQuery();
      while(rs.next()) {
        presidents.add(mapResultSetToPresident(rs));
      }
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return presidents;
  }

  @Override
  public List<President> findByLastName(String string) {
    List<President> presidents = new ArrayList<>();
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      String sql = fullDataQuery + "WHERE last_name = ?";
      
      PreparedStatement st = conn.prepareStatement(sql);
      st.setString(1, string);
      
      ResultSet rs = st.executeQuery();
      while(rs.next()) {
        presidents.add(mapResultSetToPresident(rs));
      }
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return presidents;
  }

}
