package com.skilldistillery.jdbc.labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FilmReport {
	static String user = "student";
	static String pass = "student";
	private static final String URL = "jdbc:mysql://localhost:3306/sdvid";

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Unable to load DB. Exiting program.");
			e.printStackTrace();
			System.exit(1);
		}
	}
	static {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	    }
	    catch ( ClassNotFoundException e ) {
	      e.printStackTrace();
	    }
	  }
	public static void main(String[] args) {
		FilmReport fr = new FilmReport();
		try {
			fr.getFilmReplacementCost();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getFilmReplacementCost() throws SQLException {
		// Film film = null;
		String sql = "select title, replacement_cost from film";
		Connection conn = DriverManager.getConnection(URL, user, pass);
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		double counter = 0;
		while (rs.next()) {
			System.out.println((rs.getString(1) + "\t$" + rs.getDouble(2)));
			counter += rs.getDouble(2);
		}
		if (counter == 0) {
			rs.close();
			ps.close();
			conn.close();
		}
		System.out.println("Total Replacement Cost:\t$" + counter);
		rs.close();
		ps.close();
		conn.close();

	}
}
