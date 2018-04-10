package com.skilldistillery.filmjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Film {
	private static final String URL = "jdbc:mysql://localhost:3306/sdvid";
	private static final String user = "student", pass = "student";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("JDBCTest started.");
		Film tester = new Film();
		int entry = -1;
		do {
			System.out.println(
					"**********************************\nEnter 1 to search by film ID \nEnter 2 to search by film title \n(0 to quit)");
			entry = input.nextInt();
			if (entry == 1) {
				System.out.println("Enter the film ID");
				int id = input.nextInt();
				tester.searchFilmByID(id);
			}
			else if (entry == 2) {
				System.out.println("Enter the movie title or description");
				String titleOrDescription = input.next().toUpperCase();
				System.out.println("Enter the maximum number of films to show (Greater than 0)");
				int numFilms = input.nextInt();
				tester.searchFilmByTitle(titleOrDescription, numFilms);
			}
		}
		while (entry != 0);
		input.close();
	}

	public void searchFilmByID(int filmID) throws SQLException, ClassNotFoundException {

		Connection conn = DriverManager.getConnection(URL, user, pass);
		String sql = "SELECT * FROM film WHERE id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, filmID);
		ResultSet rs = stmt.executeQuery();
		int counter = 0;
		OUTERLOOP: while (counter == 0) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String fn = rs.getString(2);
				String ln = rs.getString(3);
				System.out.println(id + "\t" + fn + "\t" + ln);
				counter++;
			}
			if (counter == 0) {
				System.out.println("Film not found");
				break OUTERLOOP;
			}
			counter++;
		}

		rs.close();
		stmt.close();
		conn.close();

	}

	public void searchFilmByTitle(String titleOrDescription, int numFilms) throws SQLException, ClassNotFoundException {

		Connection conn = DriverManager.getConnection(URL, user, pass);
		String sql = "SELECT * FROM film WHERE title like ? or description like ?";
		PreparedStatement stmt;
		if (numFilms > 0) {
			sql = "SELECT * FROM film WHERE title like ? or description like ? limit ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + titleOrDescription + "%");
			stmt.setString(2, "%" + titleOrDescription + "%");
			stmt.setInt(3, numFilms);
		}
		else {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + titleOrDescription + "%");
			stmt.setString(2, "%" + titleOrDescription + "%");
		}

		ResultSet rs = stmt.executeQuery();

		int counter = 0;
		OUTERLOOP: while (counter == 0) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String fn = rs.getString(2);
				String ln = rs.getString(3);
				System.out.println(id + "\t" + fn + "\t" + ln);
				counter++;
			}
			if (counter == 0) {
				System.out.println("No matching films");
				break OUTERLOOP;
			}
			counter++;
		}

		rs.close();
		stmt.close();
		conn.close();
	}
}
