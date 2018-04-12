package com.skilldistillery.jdbc.drills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class JDBCTest {
	private static final String URL = "jdbc:mysql://localhost:3306/sdvid";

	public JDBCTest() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("JDBCTest started.");
		JDBCTest tester = new JDBCTest();
		int entry = -1;
		do {
			System.out.println("**********************************\nEnter 1 to search by store ID \nEnter 2 to show customer list \n(0 to quit)");
			entry = input.nextInt();
			if (entry == 1) {
				System.out.println("Enter the store ID");
				entry = input.nextInt();
				tester.showStaff(entry);
			}else if (entry == 2) {
				System.out.println("Enter the customer's first name");
				String name = input.next();
				tester.showCustomers(name);
			}
		}
		while (entry != 0);
		input.close();

	}

	public void showStaff(int storeID) throws SQLException, ClassNotFoundException {
		String user = "student";
		String pass = "student";
		Connection conn = DriverManager.getConnection(URL, user, pass);
		String sql = "SELECT id, first_name, last_name FROM staff WHERE store_id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, storeID);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String fn = rs.getString(2);
			String ln = rs.getString(3);
			System.out.println(id + "\t" + fn + "\t" + ln);

		}

		rs.close();
		stmt.close();
		conn.close();

	}
	// Write a program to retrieve and print the names, email addresses, and last
	// update times of customers. Have your program exit cleanly after printing only
	// the first 20 customers.
	public void showCustomers(String name) throws SQLException {
		String user = "student";
		String pass = "student";
		Connection conn = DriverManager.getConnection(URL, user, pass);
		String sql = "SELECT first_name, last_name, email, last_update FROM customer where first_name = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, name);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String fn = rs.getString(1);
			String ln = rs.getString(2);
			String email = rs.getString(3);
			String lastUpdate = rs.getString(4);
			System.out.println(fn + "\t" + ln + "\t" + email + "\t" + lastUpdate);

		}

		rs.close();
		stmt.close();
		conn.close();
	}
}