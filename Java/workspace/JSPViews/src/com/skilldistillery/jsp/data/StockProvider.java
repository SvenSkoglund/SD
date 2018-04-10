package com.skilldistillery.jsp.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockProvider {

  private static String url = "jdbc:mysql://localhost:3306/stockdb";

  private final String user = "stockuser";
  private final String pass = "stockuser";
  
  private final String fullDataQuery = "SELECT symbol, company_name, quote"
      + " from SYMBOL ";
  
  public StockProvider() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }
  
  private Stock mapResultSetToStock(ResultSet rs) throws SQLException {
    Stock s = null;
    
    s = new Stock(rs.getString(1), rs.getString(2), rs.getDouble(3));
    
    return s;
  }
  
  public List<Stock> getAllStocks() {
    List<Stock> stocks = new ArrayList<>();
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      String sql = fullDataQuery;
      PreparedStatement st = conn.prepareStatement(sql);
      ResultSet rs = st.executeQuery();
      while(rs.next()) {
        stocks.add(mapResultSetToStock(rs));
      }
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    
    return stocks;
  }
}
