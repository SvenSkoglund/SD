package com.skilldistillery.jdbc.labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class ActorAdder {
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ActorAdder aa = new ActorAdder();
		try {
			aa.addActor();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addActor() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name of the actor to be added to the DB");
		String firstName = scanner.nextLine();
		System.out.println("Enter the last name of the actor to be added to the DB");
		String lastName = scanner.nextLine();
		String sql = "insert into actor (first_name, last_name) values ( ? , ? )";
		Connection conn = DriverManager.getConnection(URL, user, pass);
		PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, firstName);
		ps.setString(2, lastName);

		int update = ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();

		int rowID = -1;
		double counter = 0;
		while (rs.next()) {
			rowID = rs.getInt(1);
		}
		if (rowID < 0) {
			System.out.println("ID not found");
			rs.close();
			ps.close();
			conn.close();
		} else {
			System.out.println("Actor " + firstName + " " + lastName + " added at ID:" + rowID);
		}
		rs.close();
		ps.close();
		conn.close();

	}
}