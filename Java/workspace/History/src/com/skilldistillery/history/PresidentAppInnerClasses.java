package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PresidentAppInnerClasses {
	private static final String fileName = "resources" + File.separator + "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentAppInnerClasses app = new PresidentAppInnerClasses();
		app.start();
	}

	public void start() {
		class PresidentWhyLeftMatcher implements PresidentMatcher {

			@Override
			public boolean matches(President pres, String string) {
			    return pres.getWhyLeftOffice().equals(string);
			}
			
		}
		// sortByPartyAndTerm(presidents);
//		List <President> filtered = filter("G", new PresidentFirstNameMatcher());
		List <President> filtered = filter("Term ended", new PresidentWhyLeftMatcher());
		List <President> anonFiltered = filter("Term ended", new 	 PresidentMatcher() {

			@Override
			public boolean matches(President pres, String string) {
			    return pres.getWhyLeftOffice().equals(string);
			}
			
		};
		
		this.printPresidents(filtered);
//		this.printPresidents(sortByLastName(presidents));

	}

	public PresidentAppInnerClasses() {
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

	class PresidentFirstNameMatcher implements PresidentMatcher {

		@Override
		public boolean matches(President pres, String string) {
			return pres.getFirstName().startsWith(string);
		}

	}

	public List<President> sortByLastName(List<President> presidents) {
		List sorted = new ArrayList<>(presidents);
		sorted.sort(new Comparator<President>() {

			@Override
			public int compare(President o1, President o2) {

				int retval = o1.getLastName().compareTo(o2.getLastName());

				// shorthand syntax
				return retval;
			}

		});
		System.out.println(sorted);
		return sorted;

	}

	// Create a method that returns a list of presidents sorted by the reason they
	// left office, then by term number. Use a local class for the comparator. Pass
	// the original list to this method, and print the resulting list.
	public List<President> sortByReasonLeftAndTerm(List<President> presidents) {
		List sorted = new ArrayList<>(presidents);
		class CompareReasonLeftAndTerm implements Comparator<President> {

			@Override
			public int compare(President o1, President o2) {

				int retval = o1.getWhyLeftOffice().compareTo(o2.getWhyLeftOffice());

				// shorthand syntax
				return (retval != 0) ? retval : o1.getTermNumber() - o2.getTermNumber();
			}

		}
		sorted.sort(new CompareReasonLeftAndTerm());
		System.out.println(sorted);
		return sorted;

	}

	public class ComparePartyAndTerm implements Comparator<President> {

		@Override
		public int compare(President o1, President o2) {

			int retval = o1.getParty().compareTo(o2.getParty());

			// shorthand syntax
			return (retval != 0) ? retval : o1.getTermNumber() - o2.getTermNumber();
		}

	};

	// Create a method that returns a list of presidents sorted by party and term
	// number. Use a member class that implements Comparator<President>. Pass the
	// original list to this method, and print the resulting list.
	public List<President> sortByPartyAndTerm(List<President> presidents) {
		List sorted = new ArrayList<>(presidents);
		sorted.sort(new ComparePartyAndTerm());
		System.out.println(sorted);
		return sorted;

	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left office
		// Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek re-election
		// Independent
		DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");

				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				String termBeginString = col[4];// : Date term began.
				String termEndString = col[5];// Date term ended.
				LocalDate termBegin = LocalDate.parse(termBeginString, dateFmt);
				LocalDate termEnd = null;
				try {
					termEnd = LocalDate.parse(termEndString, dateFmt);
				}
				catch (DateTimeParseException e) {
					// TODO Auto-generated catch block
					termEnd = LocalDate.now();
				}
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				President pres = new President(term, fName, mName, lName, termBegin, termEnd, won, whyLeft, party);
				presidents.add(pres);
				try (PrintWriter pw = new PrintWriter(new PrintStream("presidents2.txt"))) {
					for (President p : presidents) {
						pw.println(p.getTermNumber() + "\t" + p.getFirstName() + "\t" + p.getMiddleName() + "\t"
								+ p.getLastName() + "\t" + p.getTermBegin() + "\t" + p.getTermEnd() + "\t"
								+ p.getElectionsWon() + "\t" + p.getWhyLeftOffice() + "\t" + p.getParty());
					}
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}

}