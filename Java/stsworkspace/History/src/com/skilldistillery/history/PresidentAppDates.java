package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class PresidentAppDates {
	private static final String fileName = "resources" + File.separator + "presidents.tsv";
	private List<President> presidents = new ArrayList<>();
	private String dateFormat = "MMM dd, yyyy";

	public static void main(String[] args) {
		PresidentAppDates app = new PresidentAppDates();
		app.start();
	}

	public void start() {
		this.printPresidents(this.getPresidents());

	}

	public PresidentAppDates() {
		this.loadPresidents(fileName);
	}

	public List<President> getPresidents() {
		return this.presidents;
	}

	public void printPresidents(List<President> pres) {
		for (President p : pres) {
			System.out.println(p);
		}
	}

	public List<President> filter(String string, PresidentMatcher matcher) {
		List<President> filtered = new ArrayList<>();
		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left office
		// Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek re-election
		// Independent
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
				
				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				LocalDate termStart;
				try {
					termStart = LocalDate.parse(col[4], formatter);
				} catch (DateTimeParseException e) {
					termStart = null;
				}
				LocalDate termEnd;
				try {
					termEnd = LocalDate.parse(col[5], formatter);
				}
				catch (DateTimeParseException e) {
					termEnd = null;
				}
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				//LocalDate st = LocalDate.parse(termStart, formatter);
				//LocalDate end = LocalDate.parse(termEnd, formatter);

				President pres = new President(term, fName, mName, lName, termStart, termEnd, won, whyLeft, party);
				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}
	
}
