package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCStatePresidentImpl implements PresidentDAO {

  private static String url = "jdbc:mysql://localhost:3306/historydb";

  private final String user = "historyuser";
  private final String pass = "historyuser";
  
  private final String fullDataQuery = "SELECT term, first_name, last_name, inauguration_date, elections_won, reason_left_office, party "
      + "from PRESIDENT ";
  
  public JDBCStatePresidentImpl() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }
  @Override
  public President getPresidentByTerm(String term) {
    // TODO : Implement method
    President s = null;
      // Find the state by it's name in the 'states' table
      // If found, assign the state to 's'
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      // add where clause...
      String sql = fullDataQuery + "where name = ?";
      
      PreparedStatement st = conn.prepareStatement(sql);
      
      // set parameters
      st.setString(1, term);
      ResultSet rs = st.executeQuery();
      // map ResultSet data to a President object and set to 's'
      if(rs.next()) {
        s = new President(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
      }
      
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return s;
  }

}

