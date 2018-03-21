package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PresidentAppInnerClasses {
	private static final String fileName = "resources" + File.separator + "presidents.tsv";
	private List<President> presidents = new ArrayList<>();
	private String dateFormat = "MMM dd, yyyy";

	public static void main(String[] args) {
		PresidentAppInnerClasses app = new PresidentAppInnerClasses();
		app.start();
	}

	public void start() {

		class WhyLeftOffice implements PresidentMatcher {

			@Override
			public boolean matches(President pres, String string) {

				return pres.getWhyLeftOffice().equalsIgnoreCase(string);
			}

		}

		this.printPresidents(this.getPresidents());

		List<President> byPartyAndTerm = sortByPartyAndTerm(presidents);
		System.out.println("***** By Party And Term *****");
		printPresidents(byPartyAndTerm);

		List<President> byReasonLeftOfficeAndTerm = sortByReasonLeftTerm(presidents);
		System.out.println("***** By Reason And Term *****");
		printPresidents(byReasonLeftOfficeAndTerm);

		System.out.println("***** By Last Name *****");
		printPresidents(sortByLastName(presidents));

		System.out.println("***** By Whigs *****");
		printPresidents(filter("Whig", new PresidentPartyMatcher()));

		System.out.println("***** President First Name Starts With *****");
		printPresidents(filter("J", new PresidentFirstNameMatcher()));

		System.out.println("***** Why Left Office *****");
		printPresidents(filter("Term Ended", new WhyLeftOffice()));

		System.out.println("***** Last Name Starts With C *****");
		printPresidents(filter("C", new PresidentMatcher() {

			@Override
			public boolean matches(President pres, String string) {
				return pres.getLastName().startsWith(string);
			}

		}));

		System.out.println("***** Party Contains Democrat *****");
		printPresidents(filter("Democrat", new PresidentMatcher() {

			@Override
			public boolean matches(President pres, String string) {
				return pres.getParty().contains(string);
			}

		}));

		System.out.println("***** Died In Office *****");
		printPresidents(filter("Died in office", new PresidentMatcher() {
			@Override
			public boolean matches(President pres, String string) {
				return pres.getWhyLeftOffice().equalsIgnoreCase(string);
			}

		}));

		System.out.println("***** Won Single Election *****");
		Integer i = 1;
		printPresidents(filter(i.toString(), new PresidentMatcher() {
			@Override
			public boolean matches(President pres, String string) {
				Integer electionsWon = pres.getElectionsWon();
				return electionsWon.toString().equalsIgnoreCase(string);
			}
		}));

		System.out.println("***** 19th Century Terms *****");
		printPresidents(filter("18", new PresidentMatcher() {

			@Override
			public boolean matches(President pres, String string) {
				String startDate = pres.getTermStart().toString();
				if (startDate.startsWith(string)) {
					return true;
				}
				return false;
			}

		}));

		copyToFile("presidentsAlt.tsv", presidents);

	}

	public void copyToFile(String fileName, List<President> presidents) {
		try {
			FileWriter fs = new FileWriter(fileName);
			PrintWriter ps = new PrintWriter(fs);
			for (President line : presidents) {
				ps.println(line);
			}
			ps.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
				} catch (DateTimeParseException e) {
					termEnd = null;
				}
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				// LocalDate st = LocalDate.parse(termStart, formatter);
				// LocalDate end = LocalDate.parse(termEnd, formatter);

				President pres = new President(term, fName, mName, lName, termStart, termEnd, won, whyLeft, party);
				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}

	public List<President> sortByPartyAndTerm(List<President> presidents) {
		List<President> sorted = new ArrayList<>(presidents);
		PartyAndTermComparator p = new PartyAndTermComparator();
		Collections.sort(sorted, p);

		return sorted;
	}

	public List<President> sortByReasonLeftTerm(List<President> presidents) {
		List<President> sorted = presidents;
		class CompareReasonLeftAndTerm implements Comparator<President> {

			@Override
			public int compare(President o1, President o2) {
				// TODO Auto-generated method stub
				String o1Party = o1.getWhyLeftOffice();
				String o2Party = o2.getWhyLeftOffice();
				int result = o1Party.compareTo(o2Party);

				int r = 0;
				if (result != 0) {
					return result;
				}
				if (result == 0) {
					int o1Term = o1.getTermNumber();
					int o2Term = o2.getTermNumber();
					if (o1Term < o2Term) {
						r = -1;
					} else if (o1Term == o2Term) {
						r = 0;
					} else {
						r = 1;
					}
				}
				return r;
			}

		}
		sorted.sort(new CompareReasonLeftAndTerm());
		return sorted;
	}

	public List<President> sortByLastName(List<President> presidents) {
		List<President> sorted = presidents;

		sorted.sort(new Comparator<President>() {

			@Override
			public int compare(President o1, President o2) {
				// TODO Auto-generated method stub
				String o1Party = o1.getLastName();
				String o2Party = o2.getLastName();
				int result = o1Party.compareTo(o2Party);

				int r = 0;
				if (result != 0) {
					return result;
				}
				if (result == 0) {
					int o1Term = o1.getTermNumber();
					int o2Term = o2.getTermNumber();
					if (o1Term < o2Term) {
						r = -1;
					} else if (o1Term == o2Term) {
						r = 0;
					} else {
						r = 1;
					}
				}
				return r;
			}

		});
		return sorted;
	}

	class PresidentFirstNameMatcher implements PresidentMatcher {

		@Override
		public boolean matches(President pres, String string) {

			return pres.getFirstName().startsWith(string);
		}

	}

	class PartyAndTermComparator implements Comparator<President> {

		@Override
		public int compare(President o1, President o2) {
			// TODO Auto-generated method stub
			String o1Party = o1.getParty();
			String o2Party = o2.getParty();
			int result = o1Party.compareTo(o2Party);

			int r = 0;
			if (result == 0) {
				int o1Term = o1.getTermNumber();
				int o2Term = o2.getTermNumber();
				if (o1Term < o2Term) {
					r = -1;
				} else if (o1Term == o2Term) {
					r = 0;
				} else {
					r = 1;
				}
			}
			return r;
		}

	}

}
